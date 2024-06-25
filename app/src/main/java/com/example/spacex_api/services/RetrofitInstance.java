package com.example.spacex_api.services;

import android.widget.Toast;

import com.example.spacex_api.MainActivity;
import com.example.spacex_api.models.Launch;
import com.example.spacex_api.models.LaunchsResponse;

import java.io.IOException;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Path;

public class RetrofitInstance {

    private static Retrofit retrofit = null;
    //private static String BASE_URL = "https://api.spacexdata.com/v3/";

    private static String BASE_URL = "https://reqres.in/";

    //  singleton pattern used to create instance pf retrofit
    public static GetData getData() {

//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }

          retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


        return retrofit.create(GetData.class);
    }

//    private final Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();
//
//    private final GetData getData = retrofit.create(GetData.class);
//
//    public  void Test() throws IOException {
//        int launch_year = 2023;
//        int flight_number = 195;
//
//        Response<LaunchsResponse> response = getData.getPastLaunches(2023, 195).execute();
//
//        assert response.isSuccessful() : "response is not Successful";
//
//        LaunchsResponse launchsResponse = response.body();
//        assert launchsResponse.equals("") : "launchsResponse equals null";
//
//    }

}
