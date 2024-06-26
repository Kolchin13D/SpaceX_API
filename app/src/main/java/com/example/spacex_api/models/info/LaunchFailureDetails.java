package com.example.spacex_api.models.info;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LaunchFailureDetails{
    public int time;
    public int altitude;
    public String reason;

    public LaunchFailureDetails(int time, int altitude, String reason) {
        this.time = time;
        this.altitude = altitude;
        this.reason = reason;
    }

    public int getTime() {
        return time;
    }

    public int getAltitude() {
        return altitude;
    }

    public String getReason() {
        return reason;
    }
}
