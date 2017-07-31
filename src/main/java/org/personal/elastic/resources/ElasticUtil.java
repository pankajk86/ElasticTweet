package org.personal.elastic.resources;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.personal.elastic.twitter.indexable.entities.ITweet;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ElasticUtil {

    private static final Logger LOGGER = Logger.getLogger(ElasticUtil.class.getName());
    private static ObjectMapper mapper = new ObjectMapper();
    private static final String INDEX = "twitter";
    private static final String TYPE = "tweet";

    /**
     * @param iTweet
     * @throws IOException 
     */
    @SuppressWarnings("deprecation")
    public static void indexTweet(TransportClient client, ITweet iTweet) throws IOException {
        
        String json = mapper.writeValueAsString(iTweet);
        IndexResponse response = client.prepareIndex(INDEX, TYPE)
                .setSource(json).execute().actionGet();
        
        GetResponse getResponse = client
                .prepareGet(INDEX, TYPE, response.getId())
                .execute().actionGet();
        
        String source = getResponse.getSourceAsString();
        ITweet iTweetGet = mapper.readValue(source, ITweet.class);
        LOGGER.log(Level.INFO, iTweetGet.getId() + " retrieved.");
        
//        ActionFuture<DeleteResponse> result = ES_CLIENT.delete(new DeleteRequest(INDEX, TYPE, response.getId()));
//        LOGGER.log(Level.INFO, result.actionGet().getId() + " deleted.");
        
    }
    
}
