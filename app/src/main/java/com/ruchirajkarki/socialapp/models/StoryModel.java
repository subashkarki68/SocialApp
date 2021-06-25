package com.ruchirajkarki.socialapp.models;

public class StoryModel {

    int story_type, others_story_image, others_profile_image;
    String others_name;

    public StoryModel(int story_type, String others_story_image_URL, String others_profile_image_URL, String others_name) {
        this.story_type = story_type;
        this.others_name = others_name;
        this.others_story_image_URL = others_story_image_URL;
        this.others_profile_image_URL = others_profile_image_URL;
    }

    String others_story_image_URL, others_profile_image_URL;


    public StoryModel(int story_type, int others_story_image, int others_profile_image, String others_name) {
        this.story_type = story_type;
        this.others_story_image = others_story_image;
        this.others_profile_image = others_profile_image;
        this.others_name = others_name;
    }

    public String getOthers_story_image_URL() {
        return others_story_image_URL;
    }

    public void setOthers_story_image_URL(String others_story_image_URL) {
        this.others_story_image_URL = others_story_image_URL;
    }

    public String getOthers_profile_image_URL() {
        return others_profile_image_URL;
    }

    public void setOthers_profile_image_URL(String others_profile_image_URL) {
        this.others_profile_image_URL = others_profile_image_URL;
    }

    public int getStory_type() {
        return story_type;
    }

    public void setStory_type(int story_type) {
        this.story_type = story_type;
    }

    public int getOthers_story_image() {
        return others_story_image;
    }

    public void setOthers_story_image(int others_story_image) {
        this.others_story_image = others_story_image;
    }

    public int getOthers_profile_image() {
        return others_profile_image;
    }

    public void setOthers_profile_image(int others_profile_image) {
        this.others_profile_image = others_profile_image;
    }

    public String getOthers_name() {
        return others_name;
    }

    public void setOthers_name(String others_name) {
        this.others_name = others_name;
    }

}
