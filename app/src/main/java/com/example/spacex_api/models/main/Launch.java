package com.example.spacex_api.models.main;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

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


public class Launch extends BaseObservable implements Parcelable {

    @SerializedName("flight_number")
    @Expose
    public int flight_number;
    @SerializedName("mission_name")
    @Expose
    public String mission_name;
    @SerializedName("mission_id")
    @Expose
    public ArrayList<String> mission_id;
    @SerializedName("upcoming")
    @Expose
    public boolean upcoming;
    @SerializedName("launch_year")
    @Expose
    public String launch_year;
    @SerializedName("launch_date_unix")
    @Expose
    public int launch_date_unix;
    @SerializedName("launch_date_utc")
    @Expose
    public Date launch_date_utc;
    @SerializedName("launch_date_local")
    @Expose
    public Date launch_date_local;
    @SerializedName("is_tentative")
    @Expose
    public boolean is_tentative;
    @SerializedName("tentative_max_precision")
    @Expose
    public String tentative_max_precision;
    @SerializedName("tbd")
    @Expose
    public boolean tbd;
    @SerializedName("launch_window")
    @Expose
    public int launch_window;
    @SerializedName("rocket")
    @Expose
    public Rocket rocket;
    @SerializedName("ships")
    @Expose
    public ArrayList<String> ships;
    @SerializedName("telemetry")
    @Expose
    public Telemetry telemetry;
    @SerializedName("launch_site")
    @Expose
    public LaunchSite launch_site;
    @SerializedName("launch_success")
    @Expose
    public boolean launch_success;
    @SerializedName("launch_failure_details")
    @Expose
    public LaunchFailureDetails launch_failure_details;
    @SerializedName("links")
    @Expose
    public Links links;
    @SerializedName("details")
    @Expose
    public String details;
    @SerializedName("static_fire_date_utc")
    @Expose
    public Date static_fire_date_utc;
    @SerializedName("static_fire_date_unix")
    @Expose
    public int static_fire_date_unix;
    @SerializedName("timeline")
    @Expose
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

    protected Launch(Parcel in) {
        flight_number = in.readInt();
        mission_name = in.readString();
        mission_id = in.createStringArrayList();
        upcoming = in.readByte() != 0;
        launch_year = in.readString();
        launch_date_unix = in.readInt();
        is_tentative = in.readByte() != 0;
        tentative_max_precision = in.readString();
        tbd = in.readByte() != 0;
        launch_window = in.readInt();
        ships = in.createStringArrayList();
        launch_success = in.readByte() != 0;
        details = in.readString();
        static_fire_date_unix = in.readInt();
    }

    @Bindable
    public int getFlight_number() {
        return flight_number;
    }
    @Bindable
    public String getMission_name() {
        return mission_name;
    }
    @Bindable
    public ArrayList<String> getMission_id() {
        return mission_id;
    }
    @Bindable
    public boolean isUpcoming() {
        return upcoming;
    }
    @Bindable
    public String getLaunch_year() {
        return launch_year;
    }
    @Bindable
    public int getLaunch_date_unix() {
        return launch_date_unix;
    }
    @Bindable
    public Date getLaunch_date_utc() {
        return launch_date_utc;
    }
    @Bindable
    public Date getLaunch_date_local() {
        return launch_date_local;
    }
    @Bindable
    public boolean isIs_tentative() {
        return is_tentative;
    }
    @Bindable
    public String getTentative_max_precision() {
        return tentative_max_precision;
    }
    @Bindable
    public boolean isTbd() {
        return tbd;
    }
    @Bindable
    public int getLaunch_window() {
        return launch_window;
    }
    @Bindable
    public Rocket getRocket() {
        return rocket;
    }
    @Bindable
    public ArrayList<String> getShips() {
        return ships;
    }
    @Bindable
    public Telemetry getTelemetry() {
        return telemetry;
    }
    @Bindable
    public LaunchSite getLaunch_site() {
        return launch_site;
    }
    @Bindable
    public boolean isLaunch_success() {
        return launch_success;
    }
    @Bindable
    public LaunchFailureDetails getLaunch_failure_details() {
        return launch_failure_details;
    }
    @Bindable
    public Links getLinks() {
        return links;
    }
    @Bindable
    public String getDetails() {
        return details;
    }
    @Bindable
    public Date getStatic_fire_date_utc() {
        return static_fire_date_utc;
    }
    @Bindable
    public int getStatic_fire_date_unix() {
        return static_fire_date_unix;
    }
    @Bindable
    public Timeline getTimeline() {
        return timeline;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {

        dest.writeValue(flight_number);
        dest.writeValue(mission_name);
        dest.writeValue(mission_id);
        dest.writeValue(upcoming);
        dest.writeValue(launch_year);
        dest.writeValue(launch_date_unix);
        dest.writeValue(is_tentative);
        dest.writeValue(tentative_max_precision);
        dest.writeValue(tbd);
        dest.writeValue(launch_window);
        dest.writeValue(ships);
        dest.writeValue(launch_success);
        dest.writeValue(details);
        dest.writeValue(static_fire_date_unix);
    }

    public final static  Parcelable.Creator<Launch> CREATOR2 = new Creator<Launch>() {
        @Override
        public Launch createFromParcel(Parcel source) {
            return new Launch(source);
        }

        @Override
        public Launch[] newArray(int size) {
            return new Launch[size];
        }
    };

    public static final Creator<Launch> CREATOR = new Creator<Launch>() {
        @Override
        public Launch createFromParcel(Parcel in) {
            return new Launch(in);
        }

        @Override
        public Launch[] newArray(int size) {
            return new Launch[size];
        }
    };
}
