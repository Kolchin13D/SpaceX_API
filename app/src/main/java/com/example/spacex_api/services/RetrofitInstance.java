package com.example.spacex_api.services;

import android.util.Log;

import com.example.spacex_api.models.Launch;
import com.example.spacex_api.models.Test.ListUsersResponse;
import com.example.spacex_api.models.Test.UserResponse;

import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    //private static Retrofit retrofit = null;
    private static String BASE_URL2 = "https://api.spacexdata.com/v3/";

    private static String BASE_URL = "https://reqres.in/";

    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    private static final GetData getData = retrofit.create(GetData.class);

    public static String Test() throws IOException {

        int page = 1;

        Response<ListUsersResponse> response = getData.getUserList(page).execute();

        assert response.isSuccessful() : "response is Successful";
        Log.v("TAG1", response.toString());
        ListUsersResponse rootResponse = response.body();
        List<UserResponse> userData = rootResponse.getData();

        String name = response.body().data.get(0).first_name.toString();

        return name;
    }


    public static String Test2() throws IOException {

        int launch = 1;

        Response<Launch> response = getData.getLaunch(launch).execute();

        assert response.isSuccessful() : "response is Successful";
        Log.v("TAG2", response.toString());
        Launch launchRes = response.body();


        String missiom = response.body().mission_name;

        return missiom;
    }

    //  singleton pattern used to create instance pf retrofit


//    public static GetData getData() {

//        if (retrofit == null) {
//            retrofit = new Retrofit.Builder()
//                    .baseUrl(BASE_URL)
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//          retrofit = new Retrofit.Builder()
//            .baseUrl(BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();
//
//
//        return retrofit.create(GetData.class);
//    }

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
