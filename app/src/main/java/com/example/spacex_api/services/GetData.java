package com.example.spacex_api.services;

import com.example.spacex_api.models.Launch;
import com.example.spacex_api.models.Test.ListUsersResponse;

import java.util.function.Function;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetData {

    @GET("launches/past")
    Call<Launch> getPastLaunches(
            @Query("launch_year") int launch_year,
            @Query("flight_number") int flight_number

    );

    @GET("launches/{flight_number}")
    Call<Launch> getLaunch(
            @Path("flight_number") int flight_number
    );

    @GET("api/users")
    Call<ListUsersResponse> getUserList(@Query("page") int page);

}
