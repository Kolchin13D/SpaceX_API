package com.example.spacex_api.models.rocket;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Core{
    public String core_serial;
    public int flight;
    public int block;
    public boolean gridfins;
    public boolean legs;
    public boolean reused;
    public boolean land_success;
    public boolean landing_intent;
    public String landing_type;
    public String landing_vehicle;

    public String getCore_serial() {
        return core_serial;
    }

    public int getFlight() {
        return flight;
    }

    public int getBlock() {
        return block;
    }

    public boolean isGridfins() {
        return gridfins;
    }

    public boolean isLegs() {
        return legs;
    }

    public boolean isReused() {
        return reused;
    }

    public boolean isLand_success() {
        return land_success;
    }

    public boolean isLanding_intent() {
        return landing_intent;
    }

    public String getLanding_type() {
        return landing_type;
    }

    public String getLanding_vehicle() {
        return landing_vehicle;
    }

    public Core(String core_serial, int flight, int block, boolean gridfins, boolean legs, boolean reused, boolean land_success, boolean landing_intent, String landing_type, String landing_vehicle) {
        this.core_serial = core_serial;
        this.flight = flight;
        this.block = block;
        this.gridfins = gridfins;
        this.legs = legs;
        this.reused = reused;
        this.land_success = land_success;
        this.landing_intent = landing_intent;
        this.landing_type = landing_type;
        this.landing_vehicle = landing_vehicle;
    }
}