package org.personal.elastic.twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.elasticsearch.client.transport.TransportClient;
import org.personal.elastic.kafka.TwitterProducer;
import org.personal.elastic.resources.ElasticTransportClient;
import org.personal.elastic.resources.ElasticUtil;
import org.personal.elastic.twitter.entities.Tweet;
import org.personal.elastic.twitter.indexable.entities.ITweet;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Tweet Search
 */
public class TweetSearch {
    
    private static final TransportClient ES_CLIENT = ElasticTransportClient.getInstance();
    
    public static void main(String[] args) throws IOException, InterruptedException {

        TwitterProducer.run("dunkirk");
//      indexTweets();
    }
    
    public static void indexTweets() throws IOException {

        Configuration conf = new Configuration();
        conf.set("fs.default.name", "hdfs://localhost:9000");

        FileSystem fs = FileSystem.get(conf);
        Path root = new Path("/Users/flume/tweets/2016/02/06/23/FlumeData.1454824388996");

        BufferedReader br = new BufferedReader(new InputStreamReader(fs.open(root)));
        ObjectMapper mapper = new ObjectMapper();
        String line = null;

        while ((line = br.readLine()) != null) {
            System.out.println(line);

            Tweet tweet = mapper.readValue(line, Tweet.class);
            
            if(tweet.getUser().getTimeZone() != null) {
                ITweet iTweet = ITweet.getIndexableTweet(tweet);
                ElasticUtil.indexTweet(ES_CLIENT, iTweet);
            }
        }

        ES_CLIENT.close();
        fs.close();
    
    }
    
    
    @SuppressWarnings("unused")
    private static List<Path> getFilesPath(Path root) {
        List<Path> pathList = new ArrayList<Path>();
        return pathList;
    }
}
