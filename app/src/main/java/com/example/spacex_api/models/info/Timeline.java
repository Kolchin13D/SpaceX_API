package com.example.spacex_api.models.info;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Timeline {

    @SerializedName("webcast_liftoff")
    @Expose
    private Integer webcastLiftoff;

    public Integer getWebcastLiftoff() {
        return webcastLiftoff;
    }

    public void setWebcastLiftoff(Integer webcastLiftoff) {
        this.webcastLiftoff = webcastLiftoff;
    }
}