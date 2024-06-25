package com.example.spacex_api.services;

import com.example.spacex_api.models.LaunchsResponse;
import com.example.spacex_api.models.Test.ListUsersResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public static interface GetData {

    @GET("launches/past")
    Call<LaunchsResponse> getPastLaunches(
            @Path("launch_year") int launch_year,
            @Path("flight_number") int flight_number

    );

    @GET("api/users")
    Call<ListUsersResponse> getUserList(@Query("page") int page);

}
