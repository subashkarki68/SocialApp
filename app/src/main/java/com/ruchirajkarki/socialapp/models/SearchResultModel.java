package com.ruchirajkarki.socialapp.models;

public class SearchResultModel {
    String search_result_profile_image_URL, search_result_profile_name, search_result_profile_nickName;

    public String getSearch_result_profile_image_URL() {
        return search_result_profile_image_URL;
    }

    public void setSearch_result_profile_image_URL(String search_result_profile_image_URL) {
        this.search_result_profile_image_URL = search_result_profile_image_URL;
    }

    public String getSearch_result_profile_name() {
        return search_result_profile_name;
    }

    public void setSearch_result_profile_name(String search_result_profile_name) {
        this.search_result_profile_name = search_result_profile_name;
    }

    public String getSearch_result_profile_nickName() {
        return search_result_profile_nickName;
    }

    public void setSearch_result_profile_nickName(String search_result_profile_nickName) {
        this.search_result_profile_nickName = search_result_profile_nickName;
    }

    public SearchResultModel(String search_result_profile_image_URL, String search_result_profile_name, String search_result_profile_nickName) {
        this.search_result_profile_image_URL = search_result_profile_image_URL;
        this.search_result_profile_name = search_result_profile_name;
        this.search_result_profile_nickName = search_result_profile_nickName;
    }
}
