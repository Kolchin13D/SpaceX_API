package com.example.spacex_api.models.rocket;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirstStage{
    public ArrayList<Core> cores;

    public FirstStage(ArrayList<Core> cores) {
        this.cores = cores;
    }

    public ArrayList<Core> getCores() {
        return cores;
    }
}