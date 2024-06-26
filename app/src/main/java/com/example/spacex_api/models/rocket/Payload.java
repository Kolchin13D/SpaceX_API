package com.example.spacex_api.models.rocket;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

import com.example.spacex_api.models.info.OrbitParams;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload{
    public String payload_id;
    public ArrayList<Integer> norad_id;
    public boolean reused;
    public ArrayList<String> customers;
    public String nationality;
    public String manufacturer;
    public String payload_type;
    public double payload_mass_kg;
    public double payload_mass_lbs;
    public String orbit;
    public OrbitParams orbit_params;
    public String cap_serial;
    public double mass_returned_kg;
    public double mass_returned_lbs;
    public int flight_time_sec;
    public String cargo_manifest;

    public Payload(String payload_id, ArrayList<Integer> norad_id, boolean reused, ArrayList<String> customers, String nationality, String manufacturer, String payload_type, double payload_mass_kg, double payload_mass_lbs, String orbit, OrbitParams orbit_params, String cap_serial, double mass_returned_kg, double mass_returned_lbs, int flight_time_sec, String cargo_manifest) {
        this.payload_id = payload_id;
        this.norad_id = norad_id;
        this.reused = reused;
        this.customers = customers;
        this.nationality = nationality;
        this.manufacturer = manufacturer;
        this.payload_type = payload_type;
        this.payload_mass_kg = payload_mass_kg;
        this.payload_mass_lbs = payload_mass_lbs;
        this.orbit = orbit;
        this.orbit_params = orbit_params;
        this.cap_serial = cap_serial;
        this.mass_returned_kg = mass_returned_kg;
        this.mass_returned_lbs = mass_returned_lbs;
        this.flight_time_sec = flight_time_sec;
        this.cargo_manifest = cargo_manifest;
    }

    public String getPayload_id() {
        return payload_id;
    }

    public ArrayList<Integer> getNorad_id() {
        return norad_id;
    }

    public boolean isReused() {
        return reused;
    }

    public ArrayList<String> getCustomers() {
        return customers;
    }

    public String getNationality() {
        return nationality;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPayload_type() {
        return payload_type;
    }

    public double getPayload_mass_kg() {
        return payload_mass_kg;
    }

    public double getPayload_mass_lbs() {
        return payload_mass_lbs;
    }

    public String getOrbit() {
        return orbit;
    }

    public OrbitParams getOrbit_params() {
        return orbit_params;
    }

    public String getCap_serial() {
        return cap_serial;
    }

    public double getMass_returned_kg() {
        return mass_returned_kg;
    }

    public double getMass_returned_lbs() {
        return mass_returned_lbs;
    }

    public int getFlight_time_sec() {
        return flight_time_sec;
    }

    public String getCargo_manifest() {
        return cargo_manifest;
    }
}