package org.personal.elastic.twitter.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class User {
    
    long id;
    boolean verified;
    String url;
    Tweet status;
    String location;
    String name;
    boolean notifications;
    String lang;
    boolean following;
    String description;
    Entities entities;
    
    @JsonProperty("contributors_enabled")
    boolean contributorsEnabled;
    
    @JsonProperty("created_at")
    String createdAt;
    
    @JsonProperty("default_profile")
    boolean defaultProfile;
    
    @JsonProperty("default_profile_image")
    boolean defaultProfileImage;
    
    @JsonProperty("favourites_count")
    int favouritesCount;
    
    @JsonProperty("follow_request_sent")
    boolean followRequestSent;
    
    @JsonProperty("followers_count")
    int followersCount;
    
    @JsonProperty("friends_count")
    int friendsCount;
    
    @JsonProperty("geo_enabled")
    boolean geoEnabled;
    
    @JsonProperty("id_str")
    String idStr;
    
    @JsonProperty("is_translator")
    boolean isTranslator;
    
    @JsonProperty("listed_count")
    int listedCount;
    
    @JsonProperty("profile_background_color")
    String profileBackgroundColor;
    
    @JsonProperty("profile_background_image_url")
    String profileBackgroundImageUrl;
    
    @JsonProperty("profile_background_image_url_https")
    String profileBackgroundImageUrlHttps;
    
    @JsonProperty("profile_background_tile")
    boolean profileBackgroundTile;
    
    @JsonProperty("profile_banner_url")
    String profileBannerUrl;
    
    @JsonProperty("profile_image_url")
    String profileImageUrl;
    
    @JsonProperty("profile_image_url_https")
    String profileImageUrlHttps;
    
    @JsonProperty("profile_link_color")
    String profileLinkColor;
    
    @JsonProperty("profile_sidebar_border_color")
    String profileSidebarBorderColor;
    
    @JsonProperty("profile_sidebar_fill_color")
    String profileSidebarFillColor;
    
    @JsonProperty("profile_text_color")
    String profileTextColor;
    
    @JsonProperty("profile_use_background_image")
    boolean profileUseBackgroundImage;
    
    @JsonProperty("protected")
    boolean isProtected;
    
    @JsonProperty("screen_name")
    String screenName;
    
    @JsonProperty("statuses_count")
    int statusesCount;
    
    @JsonProperty("time_zone")
    String timeZone;
    
    @JsonProperty("utc_offset")
    int utcOffset;
    
    @JsonProperty("withheld_in_countries")
    String withheldInCountries;
    
    @JsonProperty("withheld_scope")
    String withheldScope;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Tweet getStatus() {
        return status;
    }

    public void setStatus(Tweet status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNotifications() {
        return notifications;
    }

    public void setNotifications(boolean notifications) {
        this.notifications = notifications;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Entities getEntities() {
        return entities;
    }

    public void setEntities(Entities entities) {
        this.entities = entities;
    }

    public boolean isContributorsEnabled() {
        return contributorsEnabled;
    }

    public void setContributorsEnabled(boolean contributorsEnabled) {
        this.contributorsEnabled = contributorsEnabled;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isDefaultProfile() {
        return defaultProfile;
    }

    public void setDefaultProfile(boolean defaultProfile) {
        this.defaultProfile = defaultProfile;
    }

    public boolean isDefaultProfileImage() {
        return defaultProfileImage;
    }

    public void setDefaultProfileImage(boolean defaultProfileImage) {
        this.defaultProfileImage = defaultProfileImage;
    }

    public int getFavouritesCount() {
        return favouritesCount;
    }

    public void setFavouritesCount(int favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    public boolean isFollowRequestSent() {
        return followRequestSent;
    }

    public void setFollowRequestSent(boolean followRequestSent) {
        this.followRequestSent = followRequestSent;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    public boolean isGeoEnabled() {
        return geoEnabled;
    }

    public void setGeoEnabled(boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public boolean isTranslator() {
        return isTranslator;
    }

    public void setTranslator(boolean isTranslator) {
        this.isTranslator = isTranslator;
    }

    public int getListedCount() {
        return listedCount;
    }

    public void setListedCount(int listedCount) {
        this.listedCount = listedCount;
    }

    public String getProfileBackgroundColor() {
        return profileBackgroundColor;
    }

    public void setProfileBackgroundColor(String profileBackgroundColor) {
        this.profileBackgroundColor = profileBackgroundColor;
    }

    public String getProfileBackgroundImageUrl() {
        return profileBackgroundImageUrl;
    }

    public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
        this.profileBackgroundImageUrl = profileBackgroundImageUrl;
    }

    public String getProfileBackgroundImageUrlHttps() {
        return profileBackgroundImageUrlHttps;
    }

    public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
        this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
    }

    public boolean isProfileBackgroundTile() {
        return profileBackgroundTile;
    }

    public void setProfileBackgroundTile(boolean profileBackgroundTile) {
        this.profileBackgroundTile = profileBackgroundTile;
    }

    public String getProfileBannerUrl() {
        return profileBannerUrl;
    }

    public void setProfileBannerUrl(String profileBannerUrl) {
        this.profileBannerUrl = profileBannerUrl;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getProfileImageUrlHttps() {
        return profileImageUrlHttps;
    }

    public void setProfileImageUrlHttps(String profileImageUrlHttps) {
        this.profileImageUrlHttps = profileImageUrlHttps;
    }

    public String getProfileLinkColor() {
        return profileLinkColor;
    }

    public void setProfileLinkColor(String profileLinkColor) {
        this.profileLinkColor = profileLinkColor;
    }

    public String getProfileSidebarBorderColor() {
        return profileSidebarBorderColor;
    }

    public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
        this.profileSidebarBorderColor = profileSidebarBorderColor;
    }

    public String getProfileSidebarFillColor() {
        return profileSidebarFillColor;
    }

    public void setProfileSidebarFillColor(String profileSidebarFillColor) {
        this.profileSidebarFillColor = profileSidebarFillColor;
    }

    public String getProfileTextColor() {
        return profileTextColor;
    }

    public void setProfileTextColor(String profileTextColor) {
        this.profileTextColor = profileTextColor;
    }

    public boolean isProfileUseBackgroundImage() {
        return profileUseBackgroundImage;
    }

    public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
        this.profileUseBackgroundImage = profileUseBackgroundImage;
    }

    public boolean isProtected() {
        return isProtected;
    }

    public void setProtected(boolean isProtected) {
        this.isProtected = isProtected;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public int getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(int statusesCount) {
        this.statusesCount = statusesCount;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public int getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(int utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getWithheldInCountries() {
        return withheldInCountries;
    }

    public void setWithheldInCountries(String withheldInCountries) {
        this.withheldInCountries = withheldInCountries;
    }

    public String getWithheldScope() {
        return withheldScope;
    }

    public void setWithheldScope(String withheldScope) {
        this.withheldScope = withheldScope;
    }
}
