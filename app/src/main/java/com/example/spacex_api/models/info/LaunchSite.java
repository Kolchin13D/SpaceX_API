package com.example.spacex_api.models.info;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LaunchSite{
    public String site_id;
    public String site_name;
    public String site_name_long;

    public LaunchSite(String site_id, String site_name, String site_name_long) {
        this.site_id = site_id;
        this.site_name = site_name;
        this.site_name_long = site_name_long;
    }

    public String getSite_id() {
        return site_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public String getSite_name_long() {
        return site_name_long;
    }
}