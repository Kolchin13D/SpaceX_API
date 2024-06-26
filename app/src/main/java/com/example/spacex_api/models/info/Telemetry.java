package com.example.spacex_api.models.info;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Telemetry{
    public String flight_club;

    public Telemetry(String flight_club) {
        this.flight_club = flight_club;
    }

    public String getFlight_club() {
        return flight_club;
    }
}