package com.example.spacex_api.models.Test;

public class Support{
    public String url;
    public String text;

    public Support(String url, String text) {
        this.url = url;
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public String getText() {
        return text;
    }
}