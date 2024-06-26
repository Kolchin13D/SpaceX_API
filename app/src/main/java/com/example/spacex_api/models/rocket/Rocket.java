package com.example.spacex_api.models.rocket;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rocket{
    public String rocket_id;
    public String rocket_name;
    public String rocket_type;
    public FirstStage first_stage;
    public SecondStage second_stage;
    public Fairings fairings;

    public Rocket(String rocket_id, String rocket_name, String rocket_type, FirstStage first_stage, SecondStage second_stage, Fairings fairings) {
        this.rocket_id = rocket_id;
        this.rocket_name = rocket_name;
        this.rocket_type = rocket_type;
        this.first_stage = first_stage;
        this.second_stage = second_stage;
        this.fairings = fairings;
    }

    public String getRocket_id() {
        return rocket_id;
    }

    public String getRocket_name() {
        return rocket_name;
    }

    public String getRocket_type() {
        return rocket_type;
    }

    public FirstStage getFirst_stage() {
        return first_stage;
    }

    public SecondStage getSecond_stage() {
        return second_stage;
    }

    public Fairings getFairings() {
        return fairings;
    }
}