package org.personal.elastic.kafka;

import java.util.Arrays;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;

public class TwitterConsumer {
    
    private static final String KAFKA_TOPIC = "tweetStore";
    private static Consumer<String, String> consumer = TwitterKafkaProcessor.getConsumer();

    public static void consume() {
        consumer.subscribe(Arrays.asList(KAFKA_TOPIC));
        
        while(true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            
            for(ConsumerRecord<String, String> record: records) {
                String format = "offset = %d, key = %s, value = %s";
                System.out.printf(format, record.offset(), record.key(), record.value());
            }
        }
    }
    
    public static void main(String[] args) {
        consume();
    }

}
