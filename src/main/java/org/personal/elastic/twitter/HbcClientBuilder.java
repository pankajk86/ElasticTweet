package org.personal.elastic.twitter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

public class HbcClientBuilder {
    
    private static ClientBuilder instance = null;
    private static BlockingQueue<String> queue = null;
    
    private HbcClientBuilder() {
        // do nothing
    }
    
    public static ClientBuilder getInstance() {
        if(instance == null) {
            instance = getClientBuilder();
        }
        return instance;
    }
    
    private static ClientBuilder getClientBuilder() {
        
        Properties properties = getProperties();
        
        String consumerKey = properties.getProperty("consumer-key");
        String consumerSecret = properties.getProperty("consumer-secret");
        String token = properties.getProperty("access-token");
        String secret = properties.getProperty("access-token-secret");
        
        queue = new LinkedBlockingQueue<String>(10000);
        Authentication auth = new OAuth1(consumerKey, consumerSecret, token, secret);
        
        ClientBuilder builder = new ClientBuilder()
                .hosts(Constants.STREAM_HOST)
                .authentication(auth)
                .processor(new StringDelimitedProcessor(queue));
        
        return builder;
    }
    
    public static BlockingQueue<String> getQueue() {
        return HbcClientBuilder.queue;
    }
    
    private static Properties getProperties() {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("src/main/resources/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return props;
    }
    

}
