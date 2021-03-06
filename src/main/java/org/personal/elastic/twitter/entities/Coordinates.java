package org.personal.elastic.twitter.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Coordinates {

    float[] coordinates;
    String type;
    
    public float[] getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(float[] coordinates) {
        this.coordinates = coordinates;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
