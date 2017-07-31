package org.personal.elastic.twitter.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Size {

    int h;
    String resize;
    int w;
    
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }
    public String getResize() {
        return resize;
    }
    public void setResize(String resize) {
        this.resize = resize;
    }
    public int getW() {
        return w;
    }
    public void setW(int w) {
        this.w = w;
    }
}
