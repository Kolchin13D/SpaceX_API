package com.example.spacex_api.models.main;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.MutableLiveData;

import com.example.spacex_api.MainActivity;
import com.example.spacex_api.services.GetData;
import com.example.spacex_api.services.RetrofitInstance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LaunchRepository {

    private static  LaunchRepository intance;

    private ArrayList<Launch> launches = new ArrayList<>();
    private MutableLiveData<List<Launch>> mutableLiveData = new MutableLiveData<>();

    private static final GetData getData = RetrofitInstance.getService();

    public  static LaunchRepository getInstance(){
        if(intance == null){
            intance = new LaunchRepository();
        }
        return  intance;
    }

    private LaunchRepository(){

        mutableLiveData = new MutableLiveData<>();

    }

    public ArrayList<Launch> Test4() throws IOException {

        Response<List<Launch>> response = getData.getPastLaunches(2008).execute();
        Call<List<Launch>> responseCall = getData.getPastLaunches(2008);
        launches = new ArrayList<>(response.body());

        Log.v("TAG4", "___________________________________________________");
        for (Launch launch : launches) {
            Log.v("TAG4", "The launch # " + launch.flight_number + " - " + launch.mission_name);
        }

        responseCall.enqueue(new Callback<List<Launch>>() {
            @Override
            public void onResponse(Call<List<Launch>> call, Response<List<Launch>> response) {
                if (response.isSuccessful()) {

                    Log.v("CALL4", "the response: " + response.isSuccessful());
                    Log.v("CALL4", "the response body: " + response.body());

                    for (Launch launch : launches) {
                        Log.v("CALL4", "The launch # " + launch.flight_number + " - " + launch.mission_name);
                    }

                } else {
                    Log.v("CALL4", "Launch not found, response is " + response.isSuccessful());
                }
            }

            @Override
            public void onFailure(Call<List<Launch>> call, Throwable throwable) {
                Log.v("CALL4", "CRITICAL ERROR");
                Log.v("CALL4", throwable.toString());
            }

        });

        Log.v("CALL4", responseCall.toString());

        return launches;
    }

    public MutableLiveData<List<Launch>> getLaunches() {


        GetData getData = RetrofitInstance.getService();

        Call<List<Launch>> call = getData.getPastLaunches(2008);


        Log.v("CALL5", call.toString());

        call.enqueue(new Callback<List<Launch>>() {
            @Override
            public void onResponse(Call<List<Launch>> call, Response<List<Launch>> response) {


                Log.v("CALL5", response.toString());

                //launches = new ArrayList<>(response.body());

                launches = (ArrayList<Launch>) response.body();

                for (Launch launch : launches) {
                    Log.v("CALL5", "The launch # " + launch.flight_number + " - " + launch.mission_name);
                }


                //Log.v("CALL6", "size = " + launches.size());

                mutableLiveData.setValue(launches);

            }

            @Override
            public void onFailure(Call<List<Launch>> call, Throwable t) {
                Log.v("CALL5", t.toString());
            }
        });


        Log.v("CALL5", "mutableLiveData =  " + mutableLiveData.getValue());
        Log.v("CALL5", "launches size = " + launches.size());

        return mutableLiveData;
    }
}
