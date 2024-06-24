package com.example.spacex_api.services;

import com.example.spacex_api.models.LaunchsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetData {

    @GET("launches/past")
    Call<LaunchsResponse> getPastLaunches(
            @Query("launch_year") int launch_year,
            @Query("flight_number") int flight_number

    );

//    @GET("launches/past")
//    Call<Result> getResult();

}
