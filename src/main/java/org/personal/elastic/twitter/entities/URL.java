package org.personal.elastic.twitter.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class URL {

    @JsonProperty("display_url")
    String displayUrl;
    
    @JsonProperty("expanded_url")
    String expandedUrl;
    
    int[] indices;
    String url;
    
    public String getDisplayUrl() {
        return displayUrl;
    }
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }
    public String getExpandedUrl() {
        return expandedUrl;
    }
    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }
    public int[] getIndices() {
        return indices;
    }
    public void setIndices(int[] indices) {
        this.indices = indices;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
