package org.personal.elastic.resources;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.xpack.client.PreBuiltXPackTransportClient;

public class ElasticTransportClient {

    private static TransportClient instance = null;
    private static final String NODE_ADDRESS = "127.0.0.1";
    private static final Logger LOGGER = Logger.getLogger(ElasticTransportClient.class.getName());
    
    protected ElasticTransportClient() {
        // do nothing
    }
    
    public static TransportClient getInstance() {
        if(instance == null) {
            instance = getTransportClient();
        }
        return instance;
    }
    
    @SuppressWarnings({ "resource", "unchecked" })
    private static TransportClient getTransportClient() {
        
        TransportClient client = null;
        
        try {
            InetSocketTransportAddress inetAddress = new InetSocketTransportAddress(InetAddress.getByName(NODE_ADDRESS), 9300);
            client = new PreBuiltXPackTransportClient(Settings.EMPTY).addTransportAddress(inetAddress);
        } catch (UnknownHostException e) {
            LOGGER.log(Level.WARNING, e.getMessage());
        }

        return client;
    }
    
}
