package org.personal.elastic.kafka;

import java.util.concurrent.BlockingQueue;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.personal.elastic.twitter.HbcClientBuilder;

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.httpclient.BasicClient;

public class TwitterProducer {
    
    private static final String KAFKA_TOPIC = "tweetStore";
    private static ClientBuilder hbcClientBuilder = HbcClientBuilder.getInstance();
    private static Producer<String, String> producer = TwitterKafkaProcessor.getProducer();

    /**
     * @param terms
     * @throws InterruptedException
     */
    public static void run(String... terms) throws InterruptedException {

        StatusesFilterEndpoint endpoint = new StatusesFilterEndpoint();
        endpoint.stallWarnings(false);
        endpoint.trackTerms(Lists.newArrayList(terms));
        
        BlockingQueue<String> queue = HbcClientBuilder.getQueue();
        BasicClient client = hbcClientBuilder.endpoint(endpoint).build();

        // Establish a connection
        client.connect();

        // Do whatever needs to be done with messages
        readTweets(client, queue);
        
        // Close resources
        producer.close();
        client.stop();
    }
    
    private static void readTweets(BasicClient client, BlockingQueue<String> queue) throws InterruptedException {
        for (int msgRead = 0; msgRead < 1000; msgRead++) {
            if (client.isDone()) {
                System.out.println("Client connection closed unexpectedly: " + client.getExitEvent().getMessage());
                break;
            }

            ProducerRecord<String, String> message = null;
            String msg = queue.take();
            
            if (msg != null) {
                System.out.println(msg);
                message = new ProducerRecord<String, String>(KAFKA_TOPIC, msg);
                producer.send(message);
            }
        }
    }
    
    public static void main(String args[]) {
        try {
            run("wonder woman");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
