package com.example.spacex_api.models.rocket;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondStage{
    public int block;
    public ArrayList<Payload> payloads;

    public SecondStage(int block, ArrayList<Payload> payloads) {
        this.block = block;
        this.payloads = payloads;
    }

    public int getBlock() {
        return block;
    }

    public ArrayList<Payload> getPayloads() {
        return payloads;
    }
}