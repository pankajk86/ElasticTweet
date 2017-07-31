package org.personal.elastic.twitter.entities;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        String json = "[ [ [2.2241006,48.8155414], [2.4699099,48.8155414], [2.4699099,48.9021461], [2.2241006,48.9021461] ] ]";
        Object[] box = mapper.readValue(json, Object[].class);
        System.out.println(box.toString());
        
//        String cc = "[[2.2241006,48.8155414], [2.2241006,48.8155414]]";
//        Float[] unit = mapper.readValue(cc, Float[].class);
//        System.out.println(unit.toString());
    }

}
