package com.ruchirajkarki.socialapp.models;

public class DashboardModel {
    String dashboard_poster_name, dashboard_poster_profile_image_URL, dashboard_poster_post_image_URL, dashboard_poster_about;
    int dashboard_favourite_count, dashboard_comment_count, dashboard_share_count;
    Boolean favourite = false;
    Boolean bookmark = false;

    public DashboardModel(String dashboard_poster_name, String dashboard_poster_profile_image_URL, String dashboard_poster_post_image_URL, String dashboard_poster_about
            , int dashboard_favourite_count, int dashboard_comment_count, int dashboard_share_count) {
        this.dashboard_poster_name = dashboard_poster_name;
        this.dashboard_poster_profile_image_URL = dashboard_poster_profile_image_URL;
        this.dashboard_poster_post_image_URL = dashboard_poster_post_image_URL;
        this.dashboard_poster_about = dashboard_poster_about;
        this.dashboard_favourite_count = dashboard_favourite_count;
        this.dashboard_comment_count = dashboard_comment_count;
        this.dashboard_share_count = dashboard_share_count;
    }

    public String getDashboard_poster_name() {
        return dashboard_poster_name;
    }

    public void setDashboard_poster_name(String dashboard_poster_name) {
        this.dashboard_poster_name = dashboard_poster_name;
    }

    public String getDashboard_poster_profile_image_URL() {
        return dashboard_poster_profile_image_URL;
    }

    public void setDashboard_poster_profile_image_URL(String dashboard_poster_profile_image_URL) {
        this.dashboard_poster_profile_image_URL = dashboard_poster_profile_image_URL;
    }

    public String getDashboard_poster_post_image_URL() {
        return dashboard_poster_post_image_URL;
    }

    public void setDashboard_poster_post_image_URL(String dashboard_poster_post_image_URL) {
        this.dashboard_poster_post_image_URL = dashboard_poster_post_image_URL;
    }

    public String getDashboard_poster_about() {
        return dashboard_poster_about;
    }

    public void setDashboard_poster_about(String dashboard_poster_about) {
        this.dashboard_poster_about = dashboard_poster_about;
    }

    public int getDashboard_favourite_count() {
        return dashboard_favourite_count;
    }

    public void setDashboard_favourite_count(int dashboard_favourite_count) {
        this.dashboard_favourite_count = dashboard_favourite_count;
    }

    public int getDashboard_comment_count() {
        return dashboard_comment_count;
    }

    public void setDashboard_comment_count(int dashboard_comment_count) {
        this.dashboard_comment_count = dashboard_comment_count;
    }

    public int getDashboard_share_count() {
        return dashboard_share_count;
    }

    public void setDashboard_share_count(int dashboard_share_count) {
        this.dashboard_share_count = dashboard_share_count;
    }
}
