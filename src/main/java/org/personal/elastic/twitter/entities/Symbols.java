package org.personal.elastic.twitter.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Symbols {

    String text;
    int[] indices;
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int[] getIndices() {
        return indices;
    }
    public void setIndices(int[] indices) {
        this.indices = indices;
    }
}
