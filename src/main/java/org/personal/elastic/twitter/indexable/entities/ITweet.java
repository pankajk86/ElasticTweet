package org.personal.elastic.twitter.indexable.entities;

import org.personal.elastic.twitter.entities.Coordinates;
import org.personal.elastic.twitter.entities.Entities;
import org.personal.elastic.twitter.entities.ExtendedEntities;
import org.personal.elastic.twitter.entities.Places;
import org.personal.elastic.twitter.entities.Tweet;
import org.personal.elastic.twitter.entities.User;

public class ITweet {

    long id;
    boolean possiblySensitive;
    String lang;
    ExtendedEntities extendedEntities;
    String timestampMills;
    String createdAt;
    Places place;
    Coordinates coordinates;
    String text;
    Entities entities;
    IUser user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public ExtendedEntities getExtendedEntities() {
        return extendedEntities;
    }

    public void setExtendedEntities(ExtendedEntities extendedEntities) {
        this.extendedEntities = extendedEntities;
    }

    public String getTimestampMills() {
        return timestampMills;
    }

    public void setTimestampMills(String timestampMills) {
        this.timestampMills = timestampMills;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Places getPlace() {
        return place;
    }

    public void setPlace(Places place) {
        this.place = place;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public IUser getUser() {
        return user;
    }

    public void setUser(IUser user) {
        this.user = user;
    }
    
    public static ITweet getIndexableTweet(Tweet tweet) {
        ITweet iTweet = new ITweet();
        iTweet.setId(tweet.getId());
        iTweet.setPossiblySensitive(tweet.isPossiblySensitive());
        iTweet.setLang(tweet.getLang());
        iTweet.setExtendedEntities(tweet.getExtendedEntities());
        iTweet.setTimestampMills(tweet.getTimestampMills());
        iTweet.setCreatedAt(tweet.getCreatedAt());
        iTweet.setPlace(tweet.getPlace());
        iTweet.setCoordinates(tweet.getCoordinates());
        iTweet.setText(tweet.getText());
        iTweet.setEntities(tweet.getEntities());
        
        IUser iUser = new IUser();
        User user = tweet.getUser();
        
        iUser.setId(user.getId());
        iUser.setName(user.getName());
        iUser.setLocation(user.getLocation());
        iUser.setLang(user.getLang());
        iUser.setDescription(user.getDescription());
        iUser.setCreatedAt(user.getCreatedAt());
        iUser.setFollowersCount(user.getFollowersCount());
        iUser.setUtcOffset(user.getUtcOffset());
        iUser.setTimeZone(user.getTimeZone());
        iUser.setFriendsCount(user.getFriendsCount());
        iUser.setScreenName(user.getScreenName());
        
        iTweet.setUser(iUser);
        
        return iTweet;
    }
}
