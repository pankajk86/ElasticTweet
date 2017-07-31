package org.personal.elastic.twitter.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Sizes {

    Size thumb;
    Size large;
    Size medium;
    Size small;
    
    public Size getThumb() {
        return thumb;
    }
    public void setThumb(Size thumb) {
        this.thumb = thumb;
    }
    public Size getLarge() {
        return large;
    }
    public void setLarge(Size large) {
        this.large = large;
    }
    public Size getMedium() {
        return medium;
    }
    public void setMedium(Size medium) {
        this.medium = medium;
    }
    public Size getSmall() {
        return small;
    }
    public void setSmall(Size small) {
        this.small = small;
    }
}
