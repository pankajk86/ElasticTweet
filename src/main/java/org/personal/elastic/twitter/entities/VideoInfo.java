package org.personal.elastic.twitter.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class VideoInfo {

    @JsonProperty("aspect_ratio")
    int[] aspectRatio;
    
    @JsonProperty("duration_millis")
    long durationMillis;
    
    Variant[] variants;

    public int[] getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(int[] aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public long getDurationMillis() {
        return durationMillis;
    }

    public void setDurationMillis(long durationMillis) {
        this.durationMillis = durationMillis;
    }

    public Variant[] getVariants() {
        return variants;
    }

    public void setVariants(Variant[] variants) {
        this.variants = variants;
    }
}
