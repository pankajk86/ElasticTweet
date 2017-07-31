package org.personal.elastic.twitter.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class URLTest {

    @Test
    public void testURL() throws JsonParseException, JsonMappingException, IOException {
        
       String json = "{\n\t\"expanded_url\": \"http://goo.gl/2iiOTv\",\n\t\"indices\": [30, 53],\n\t\"display_url\": \"goo.gl/2iiOTv\",\n\t\"url\": \"https://t.co/EExcz6Vgl0\"\n}";
       ObjectMapper mapper = new ObjectMapper();
       URL obj = mapper.readValue(json, URL.class);
       
       assertEquals("http://goo.gl/2iiOTv", obj.getExpandedUrl()); 
       assertEquals(30, obj.getIndices()[0]);
       assertEquals(53, obj.getIndices()[1]);
       assertEquals("goo.gl/2iiOTv", obj.getDisplayUrl());
       assertEquals("https://t.co/EExcz6Vgl0", obj.getUrl());
    }
    
    @Test
    public void testURLWithMissingFields() throws JsonParseException, JsonMappingException, IOException {
        String json = "{\n\t\"expanded_url\": \"http://goo.gl/2iiOTv\",\n\t\"indices\": [30, 53],\n\t\"url\": \"https://t.co/EExcz6Vgl0\"\n}";
        ObjectMapper mapper = new ObjectMapper();
        URL obj = mapper.readValue(json, URL.class);
        
        assertNull(obj.getDisplayUrl());
        assertEquals("http://goo.gl/2iiOTv", obj.getExpandedUrl()); 
        assertEquals(30, obj.getIndices()[0]);
        assertEquals(53, obj.getIndices()[1]);
        assertEquals("https://t.co/EExcz6Vgl0", obj.getUrl());
    }
}
