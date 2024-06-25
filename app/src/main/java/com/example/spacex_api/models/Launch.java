package com.example.spacex_api.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import com.example.spacex_api.models.info.LaunchFailureDetails;
import com.example.spacex_api.models.info.LaunchSite;
import com.example.spacex_api.models.info.Links;
import com.example.spacex_api.models.info.Telemetry;
import com.example.spacex_api.models.info.Timeline;
import com.example.spacex_api.models.rocket.Rocket;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;


public class Launch{
    public int flight_number;
    public String mission_name;
    public ArrayList<String> mission_id;
    public boolean upcoming;
    public String launch_year;
    public int launch_date_unix;
    public Date launch_date_utc;
    public Date launch_date_local;
    public boolean is_tentative;
    public String tentative_max_precision;
    public boolean tbd;
    public int launch_window;
    public Rocket rocket;
    public ArrayList<String> ships;
    public Telemetry telemetry;
    public LaunchSite launch_site;
    public boolean launch_success;
    public LaunchFailureDetails launch_failure_details;
    public Links links;
    public String details;
    public Date static_fire_date_utc;
    public int static_fire_date_unix;
    public Timeline timeline;

    public Launch(int flight_number, String mission_name, ArrayList<String> mission_id, boolean upcoming, String launch_year, int launch_date_unix, Date launch_date_utc, Date launch_date_local, boolean is_tentative, String tentative_max_precision, boolean tbd, int launch_window, Rocket rocket, ArrayList<String> ships, Telemetry telemetry, LaunchSite launch_site, boolean launch_success, LaunchFailureDetails launch_failure_details, Links links, String details, Date static_fire_date_utc, int static_fire_date_unix, Timeline timeline) {
        this.flight_number = flight_number;
        this.mission_name = mission_name;
        this.mission_id = mission_id;
        this.upcoming = upcoming;
        this.launch_year = launch_year;
        this.launch_date_unix = launch_date_unix;
        this.launch_date_utc = launch_date_utc;
        this.launch_date_local = launch_date_local;
        this.is_tentative = is_tentative;
        this.tentative_max_precision = tentative_max_precision;
        this.tbd = tbd;
        this.launch_window = launch_window;
        this.rocket = rocket;
        this.ships = ships;
        this.telemetry = telemetry;
        this.launch_site = launch_site;
        this.launch_success = launch_success;
        this.launch_failure_details = launch_failure_details;
        this.links = links;
        this.details = details;
        this.static_fire_date_utc = static_fire_date_utc;
        this.static_fire_date_unix = static_fire_date_unix;
        this.timeline = timeline;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public String getMission_name() {
        return mission_name;
    }

    public ArrayList<String> getMission_id() {
        return mission_id;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public String getLaunch_year() {
        return launch_year;
    }

    public int getLaunch_date_unix() {
        return launch_date_unix;
    }

    public Date getLaunch_date_utc() {
        return launch_date_utc;
    }

    public Date getLaunch_date_local() {
        return launch_date_local;
    }

    public boolean isIs_tentative() {
        return is_tentative;
    }

    public String getTentative_max_precision() {
        return tentative_max_precision;
    }

    public boolean isTbd() {
        return tbd;
    }

    public int getLaunch_window() {
        return launch_window;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public ArrayList<String> getShips() {
        return ships;
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    public LaunchSite getLaunch_site() {
        return launch_site;
    }

    public boolean isLaunch_success() {
        return launch_success;
    }

    public LaunchFailureDetails getLaunch_failure_details() {
        return launch_failure_details;
    }

    public Links getLinks() {
        return links;
    }

    public String getDetails() {
        return details;
    }

    public Date getStatic_fire_date_utc() {
        return static_fire_date_utc;
    }

    public int getStatic_fire_date_unix() {
        return static_fire_date_unix;
    }

    public Timeline getTimeline() {
        return timeline;
    }


/*

@Generated("jsonschema2pojo")
public class Launch implements Parcelable {

    @SerializedName("flight_number")
    @Expose
    private Integer flightNumber;
    @SerializedName("mission_name")
    @Expose
    private String missionName;
    @SerializedName("mission_id")
    @Expose
    private List<Object> missionId;
    @SerializedName("upcoming")
    @Expose
    private Boolean upcoming;
    @SerializedName("launch_year")
    @Expose
    private String launchYear;
    @SerializedName("launch_date_unix")
    @Expose
    private Integer launchDateUnix;
    @SerializedName("launch_date_utc")
    @Expose
    private String launchDateUtc;
    @SerializedName("launch_date_local")
    @Expose
    private String launchDateLocal;
    @SerializedName("is_tentative")
    @Expose
    private Boolean isTentative;
    @SerializedName("tentative_max_precision")
    @Expose
    private String tentativeMaxPrecision;
    @SerializedName("tbd")
    @Expose
    private Boolean tbd;
    @SerializedName("launch_window")
    @Expose
    private Integer launchWindow;
    @SerializedName("rocket")
    @Expose
    private Rocket rocket;
    @SerializedName("ships")
    @Expose
    private List<Object> ships;
    @SerializedName("telemetry")
    @Expose
    private Telemetry telemetry;
    @SerializedName("launch_site")
    @Expose
    private LaunchSite launchSite;
    @SerializedName("launch_success")
    @Expose
    private Boolean launchSuccess;
    @SerializedName("launch_failure_details")
    @Expose
    private LaunchFailureDetails launchFailureDetails;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("static_fire_date_utc")
    @Expose
    private String staticFireDateUtc;
    @SerializedName("static_fire_date_unix")
    @Expose
    private Integer staticFireDateUnix;
    @SerializedName("timeline")
    @Expose
    private Timeline timeline;
    @SerializedName("crew")
    @Expose
    private Object crew;

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public List<Object> getMissionId() {
        return missionId;
    }

    public void setMissionId(List<Object> missionId) {
        this.missionId = missionId;
    }

    public Boolean getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    public Integer getLaunchDateUnix() {
        return launchDateUnix;
    }

    public void setLaunchDateUnix(Integer launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
    }

    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    public String getLaunchDateLocal() {
        return launchDateLocal;
    }

    public void setLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
    }

    public Boolean getIsTentative() {
        return isTentative;
    }

    public void setIsTentative(Boolean isTentative) {
        this.isTentative = isTentative;
    }

    public String getTentativeMaxPrecision() {
        return tentativeMaxPrecision;
    }

    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        this.tentativeMaxPrecision = tentativeMaxPrecision;
    }

    public Boolean getTbd() {
        return tbd;
    }

    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }

    public Integer getLaunchWindow() {
        return launchWindow;
    }

    public void setLaunchWindow(Integer launchWindow) {
        this.launchWindow = launchWindow;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public List<Object> getShips() {
        return ships;
    }

    public void setShips(List<Object> ships) {
        this.ships = ships;
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    public LaunchSite getLaunchSite() {
        return launchSite;
    }

    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }

    public Boolean getLaunchSuccess() {
        return launchSuccess;
    }

    public void setLaunchSuccess(Boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    public LaunchFailureDetails getLaunchFailureDetails() {
        return launchFailureDetails;
    }

    public void setLaunchFailureDetails(LaunchFailureDetails launchFailureDetails) {
        this.launchFailureDetails = launchFailureDetails;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    public void setStaticFireDateUtc(String staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    public Integer getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    public void setStaticFireDateUnix(Integer staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public Object getCrew() {
        return crew;
    }

    public void setCrew(Object crew) {
        this.crew = crew;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeInt(flightNumber);
        dest.writeString(launchYear);

    }


 */

}
