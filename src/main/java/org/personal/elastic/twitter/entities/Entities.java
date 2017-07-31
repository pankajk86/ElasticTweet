package org.personal.elastic.twitter.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Entities {

    Symbols[] symbols;
    URL[] urls;
    Hashtags[] hashtags;
    Media[] media;
    
    @JsonProperty("user_mentions")
    UserMention[] userMentions;

    public Symbols[] getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbols[] symbols) {
        this.symbols = symbols;
    }

    public URL[] getUrls() {
        return urls;
    }

    public void setUrls(URL[] urls) {
        this.urls = urls;
    }

    public Hashtags[] getHashtags() {
        return hashtags;
    }

    public void setHashtags(Hashtags[] hashtags) {
        this.hashtags = hashtags;
    }

    public Media[] getMedia() {
        return media;
    }

    public void setMedia(Media[] media) {
        this.media = media;
    }

    public UserMention[] getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(UserMention[] userMentions) {
        this.userMentions = userMentions;
    }
}
