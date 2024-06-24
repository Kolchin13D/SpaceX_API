package com.example.spacex_api.services;

import com.example.spacex_api.models.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetData {

    @GET("launches/past")
    Call<Result> getPastLaunches(

            @Query("launch_year") int launch_year,
            @Query("launch_success") boolean launch_success

    );

}
