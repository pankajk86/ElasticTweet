package org.personal.elastic.twitter.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(Include.NON_NULL)
public class Tweet {
    
    @JsonProperty("filter_level")
    String filterLevel;
    
    @JsonProperty("retweeted")
    boolean retweeted;
    
    @JsonProperty("retweeted_status")
    Tweet retweetedStatus;
    
    @JsonProperty("in_reply_to_screen_name")
    String in_replyToScreenName;
    
    @JsonProperty("truncated")
    boolean truncated;
    
    @JsonProperty("lang")
    String lang;
    
    @JsonProperty("in_reply_to_status_id_str")
    String inReplyToStatusIdStr;
    
    @JsonProperty("id")
    long id;
    
    @JsonProperty("in_reply_to_user_id_str")
    String inReplyToUserIdStr;
    
    @JsonProperty("timestamp_ms")
    String timestampMills;
    
    @JsonProperty("in_reply_to_status_id")
    String inReplyToStatusId;
    
    @JsonProperty("created_at")
    String createdAt;
    
    @JsonProperty("favorite_count")
    int favoriteCount;
    
    @JsonProperty("place")
    Places place;
    
    @JsonProperty("coordinates")
    Coordinates coordinates;
    
    @JsonProperty("text")
    String text;
    
    @JsonProperty("possibly_sensitive")
    boolean possiblySensitive;
    
    @JsonProperty("contributors")
    List<User> contributors;
    
    @JsonProperty("geo")
    Object geo;
    
    @JsonProperty("quoted_status_id_str")
    String quotedStatusIdStr;
    
    @JsonProperty("entities")
    Entities entities;
    
    @JsonProperty("extended_entities")
    ExtendedEntities extendedEntities;
    
    @JsonProperty("quoted_status_id")
    long quotedStatusId;
    
    @JsonProperty("scopes")
    Object scopes;
    
    @JsonProperty("is_quote_status")
    boolean isQuoteStatus;
    
    @JsonProperty("source")
    String source;
    
    @JsonProperty("quoted_status")
    Tweet quotedStatus;
    
    @JsonProperty("favorited")
    boolean favorited;
    
    @JsonProperty("in_reply_to_user_id")
    Long inReplyToUserId;
    
    @JsonProperty("retweet_count")
    int retweetCount;
    
    @JsonProperty("id_str")
    String idStr;
    
    @JsonProperty("user")
    User user;
    
    @JsonProperty("withheld_copyright")
    boolean withheldCopyright;
    
    @JsonProperty("withheld_in_countries")
    String[] withheldInCountries;
    
    @JsonProperty("withheld_scope")
    String withheldScope;
    
    @JsonProperty("current_user_retweet")
    Object currentUserRetweet;

    public String getFilterLevel() {
        return filterLevel;
    }

    public void setFilterLevel(String filterLevel) {
        this.filterLevel = filterLevel;
    }

    public boolean isRetweeted() {
        return retweeted;
    }

    public void setRetweeted(boolean retweeted) {
        this.retweeted = retweeted;
    }

    public Tweet getRetweetedStatus() {
        return retweetedStatus;
    }

    public void setRetweetedStatus(Tweet retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    public String getIn_replyToScreenName() {
        return in_replyToScreenName;
    }

    public void setIn_replyToScreenName(String in_replyToScreenName) {
        this.in_replyToScreenName = in_replyToScreenName;
    }

    public boolean isTruncated() {
        return truncated;
    }

    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    public void setInReplyToStatusIdStr(String inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    public void setInReplyToUserIdStr(String inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    public String getTimestampMills() {
        return timestampMills;
    }

    public void setTimestampMills(String timestampMills) {
        this.timestampMills = timestampMills;
    }

    public String getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(String inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
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

    public boolean isPossiblySensitive() {
        return possiblySensitive;
    }

    public void setPossiblySensitive(boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    public List<User> getContributors() {
        return contributors;
    }

    public void setContributors(List<User> contributors) {
        this.contributors = contributors;
    }

    public Object getGeo() {
        return geo;
    }

    public void setGeo(Object geo) {
        this.geo = geo;
    }

    public String getQuotedStatusIdStr() {
        return quotedStatusIdStr;
    }

    public void setQuotedStatusIdStr(String quotedStatusIdStr) {
        this.quotedStatusIdStr = quotedStatusIdStr;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public ExtendedEntities getExtendedEntities() {
        return extendedEntities;
    }

    public void setExtendedEntities(ExtendedEntities extendedEntities) {
        this.extendedEntities = extendedEntities;
    }

    public long getQuotedStatusId() {
        return quotedStatusId;
    }

    public void setQuotedStatusId(long quotedStatusId) {
        this.quotedStatusId = quotedStatusId;
    }

    public Object getScopes() {
        return scopes;
    }

    public void setScopes(Object scopes) {
        this.scopes = scopes;
    }

    public boolean isQuoteStatus() {
        return isQuoteStatus;
    }

    public void setQuoteStatus(boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Tweet getQuotedStatus() {
        return quotedStatus;
    }

    public void setQuotedStatus(Tweet quotedStatus) {
        this.quotedStatus = quotedStatus;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    public Long getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(Long inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isWithheldCopyright() {
        return withheldCopyright;
    }

    public void setWithheldCopyright(boolean withheldCopyright) {
        this.withheldCopyright = withheldCopyright;
    }

    public String[] getWithheldInCountries() {
        return withheldInCountries;
    }

    public void setWithheldInCountries(String[] withheldInCountries) {
        this.withheldInCountries = withheldInCountries;
    }

    public String getWithheldScope() {
        return withheldScope;
    }

    public void setWithheldScope(String withheldScope) {
        this.withheldScope = withheldScope;
    }

    public Object getCurrentUserRetweet() {
        return currentUserRetweet;
    }

    public void setCurrentUserRetweet(Object currentUserRetweet) {
        this.currentUserRetweet = currentUserRetweet;
    }
}
