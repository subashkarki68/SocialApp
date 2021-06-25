package com.ruchirajkarki.socialapp.models;

public class FriendListPreviewModel {
    String friend_profile_name, friend_profile_image_URL;

    public FriendListPreviewModel(String friend_profile_name, String friend_profile_image_URL) {
        this.friend_profile_name = friend_profile_name;
        this.friend_profile_image_URL = friend_profile_image_URL;
    }

    public String getFriend_profile_name() {
        return friend_profile_name;
    }

    public void setFriend_profile_name(String friend_profile_name) {
        this.friend_profile_name = friend_profile_name;
    }

    public String getFriend_profile_image_URL() {
        return friend_profile_image_URL;
    }

    public void setFriend_profile_image_URL(String friend_profile_image_URL) {
        this.friend_profile_image_URL = friend_profile_image_URL;
    }
}
