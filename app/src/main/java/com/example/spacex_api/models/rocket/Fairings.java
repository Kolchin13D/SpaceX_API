package com.example.spacex_api.models.rocket;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fairings{
    public boolean reused;
    public boolean recovery_attempt;
    public boolean recovered;
    public String ship;

    public Fairings(boolean reused, boolean recovery_attempt, boolean recovered, String ship) {
        this.reused = reused;
        this.recovery_attempt = recovery_attempt;
        this.recovered = recovered;
        this.ship = ship;
    }

    public boolean isReused() {
        return reused;
    }

    public boolean isRecovery_attempt() {
        return recovery_attempt;
    }

    public boolean isRecovered() {
        return recovered;
    }

    public String getShip() {
        return ship;
    }
}
