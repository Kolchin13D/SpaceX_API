package com.example.spacex_api.models.info;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class OrbitParams{
    public String reference_system;
    public String regime;
    public Object longitude;
    public double semi_major_axis_km;
    public double eccentricity;
    public double periapsis_km;
    public double apoapsis_km;
    public double inclination_deg;
    public double period_min;
    public Object lifespan_years;
    public Date epoch;
    public double mean_motion;
    public double raan;
    public double arg_of_pericenter;
    public double mean_anomaly;

    public OrbitParams(String reference_system, String regime, Object longitude, double semi_major_axis_km, double eccentricity, double periapsis_km, double apoapsis_km, double inclination_deg, double period_min, Object lifespan_years, Date epoch, double mean_motion, double raan, double arg_of_pericenter, double mean_anomaly) {
        this.reference_system = reference_system;
        this.regime = regime;
        this.longitude = longitude;
        this.semi_major_axis_km = semi_major_axis_km;
        this.eccentricity = eccentricity;
        this.periapsis_km = periapsis_km;
        this.apoapsis_km = apoapsis_km;
        this.inclination_deg = inclination_deg;
        this.period_min = period_min;
        this.lifespan_years = lifespan_years;
        this.epoch = epoch;
        this.mean_motion = mean_motion;
        this.raan = raan;
        this.arg_of_pericenter = arg_of_pericenter;
        this.mean_anomaly = mean_anomaly;
    }

    public String getReference_system() {
        return reference_system;
    }

    public String getRegime() {
        return regime;
    }

    public Object getLongitude() {
        return longitude;
    }

    public double getSemi_major_axis_km() {
        return semi_major_axis_km;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public double getPeriapsis_km() {
        return periapsis_km;
    }

    public double getApoapsis_km() {
        return apoapsis_km;
    }

    public double getInclination_deg() {
        return inclination_deg;
    }

    public double getPeriod_min() {
        return period_min;
    }

    public Object getLifespan_years() {
        return lifespan_years;
    }

    public Date getEpoch() {
        return epoch;
    }

    public double getMean_motion() {
        return mean_motion;
    }

    public double getRaan() {
        return raan;
    }

    public double getArg_of_pericenter() {
        return arg_of_pericenter;
    }

    public double getMean_anomaly() {
        return mean_anomaly;
    }
}