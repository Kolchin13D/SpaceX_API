package com.example.spacex_api.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class LaunchsResponse {

    @SerializedName("result")
    @Expose
    private List<Launch> result;
    @SerializedName("extra")
    @Expose
    private List<Object> extra;

    public List<Launch> getResult() {
        return result;
    }

    public void setResult(List<Launch> result) {
        this.result = result;
    }

    public List<Object> getExtra() {
        return extra;
    }

    public void setExtra(List<Object> extra) {
        this.extra = extra;
    }

}
