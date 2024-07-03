package com.example.spacex_api.services;

import android.util.Log;

import com.example.spacex_api.models.main.Launch;
import com.example.spacex_api.models.Test.ListUsersResponse;
import com.example.spacex_api.models.Test.UserResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static ArrayList<Launch> launches = new ArrayList<>();

    private static Retrofit retrofit = null;
    private static String BASE_URL2 = "https://api.spacexdata.com/v3/";
    private static String BASE_URL = "https://reqres.in/";

//    private static final Retrofit retrofit = new Retrofit.Builder()
//            .baseUrl(BASE_URL2)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build();
//    private static final GetData getData = retrofit.create(GetData.class);

    public static GetData getService() {

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL2)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Log.v("TAG2", retrofit.create(GetData.class).toString());
        return retrofit.create(GetData.class);
    }

//    public static String Test() throws IOException {
//
//        int page = 1;
//        Response<ListUsersResponse> response = getData.getUserList(page).execute();
//        assert response.isSuccessful() : "response is Successful";
//        Log.v("TAG1", response.toString());
//        ListUsersResponse rootResponce = response.body();
//        ArrayList<UserResponse> userData = rootResponce.getData();
//
//        String name = response.body().data.get(0).first_name;
//        return name.toString();
//    }
//
//    public static String Test2() throws IOException {
//
//        int launch = 195;
//        Response<Launch> response = getData.getLaunch(launch).execute();
//        //assert response.isSuccessful() : "response is Successful";
//
//        Log.v("TAG2", String.valueOf(response.errorBody()));
//        Log.v("TAG2", response.toString());
//        Launch launchRes = response.body();
//
//        String missiom = response.body().mission_name;
//        return missiom;
//    }
//
//    public static String Test3() throws IOException {
//
//        Integer launch = 110;
//        Call<Launch> responseCall = getData.getLaunch(launch);
//        Response<Launch> response = getData.getLaunch(launch).execute();
//        Launch launchRes = response.body();
//
//        responseCall.enqueue(new Callback<Launch>() {
//            @Override
//            public void onResponse(Call<Launch> call, Response<Launch> response) {
//                if (response.isSuccessful()) {
//                    Log.v("TAG3", "the response " + response.isSuccessful());
//                } else {
//                    Log.v("ERR404", "Launch not found, response is " + response.isSuccessful());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Launch> call, Throwable throwable) {
//                Log.v("ERR3", "CRITICAL ERROR");
//                Log.v("ERR3", throwable.toString());
//            }
//        });
//        Log.v("TAG3", responseCall.toString());
//
//        String missiom = response.body().mission_name;
//        return missiom;
//    }
//
//    public static ArrayList<Launch> Test4() throws IOException {
//
//        Response<List<Launch>> response = getData.getPastLaunches(2020).execute();
//
//        Call<List<Launch>> responseCall = getData.getPastLaunches(2008);
//
//        launches = new ArrayList<>(response.body());
//
//        Log.v("TAG4", "___________________________________________________");
//        for (Launch launch : launches) {
//            Log.v("TAG4", "The launch # " + launch.flight_number + " - " + launch.mission_name);
//        }
//
//        responseCall.enqueue(new Callback<List<Launch>>() {
//            @Override
//            public void onResponse(Call<List<Launch>> call, Response<List<Launch>> response) {
//                if (response.isSuccessful()) {
//
//                    Log.v("CALL4", "the response: " + response.isSuccessful());
//                    Log.v("CALL4", "the response body: " + response.body());
//
//                    for (Launch launch : launches) {
//                        Log.v("CALL4", "The launch # " + launch.flight_number + " - " + launch.mission_name);
//                    }
//
//                } else {
//                    Log.v("CALL4", "Launch not found, response is " + response.isSuccessful());
//                }
//            }
//
//            @Override
//            public void onFailure(Call<List<Launch>> call, Throwable throwable) {
//                Log.v("CALL4", "CRITICAL ERROR");
//                Log.v("CALL4", throwable.toString());
//            }
//
//        });
//
//        Log.v("CALL4", responseCall.toString());
//
//        return launches;
//    }
}
