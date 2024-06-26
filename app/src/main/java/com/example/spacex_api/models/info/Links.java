package com.example.spacex_api.models.info;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links{
    public String mission_patch;
    public String mission_patch_small;
    public String reddit_campaign;
    public String reddit_launch;
    public String reddit_recovery;
    public String reddit_media;
    public String presskit;
    public String article_link;
    public String wikipedia;
    public String video_link;
    public String youtube_id;
    public ArrayList<String> flickr_images;

    public Links(String mission_patch, String mission_patch_small, String reddit_campaign, String reddit_launch, String reddit_recovery, String reddit_media, String presskit, String article_link, String wikipedia, String video_link, String youtube_id, ArrayList<String> flickr_images) {
        this.mission_patch = mission_patch;
        this.mission_patch_small = mission_patch_small;
        this.reddit_campaign = reddit_campaign;
        this.reddit_launch = reddit_launch;
        this.reddit_recovery = reddit_recovery;
        this.reddit_media = reddit_media;
        this.presskit = presskit;
        this.article_link = article_link;
        this.wikipedia = wikipedia;
        this.video_link = video_link;
        this.youtube_id = youtube_id;
        this.flickr_images = flickr_images;
    }

    public String getMission_patch() {
        return mission_patch;
    }

    public String getMission_patch_small() {
        return mission_patch_small;
    }

    public String getReddit_campaign() {
        return reddit_campaign;
    }

    public String getReddit_launch() {
        return reddit_launch;
    }

    public String getReddit_recovery() {
        return reddit_recovery;
    }

    public String getReddit_media() {
        return reddit_media;
    }

    public String getPresskit() {
        return presskit;
    }

    public String getArticle_link() {
        return article_link;
    }

    public String getWikipedia() {
        return wikipedia;
    }

    public String getVideo_link() {
        return video_link;
    }

    public String getYoutube_id() {
        return youtube_id;
    }

    public ArrayList<String> getFlickr_images() {
        return flickr_images;
    }
}