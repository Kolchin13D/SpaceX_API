package com.example.spacex_api.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.spacex_api.models.main.Launch;
import com.example.spacex_api.models.main.LaunchRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends AndroidViewModel {

    private LaunchRepository launchRepository;
    public MainViewModel(@NonNull Application application) {
        super(application);
        launchRepository = new LaunchRepository(application);
    }

    // Live data
    public LiveData<List<Launch>> getLaunches(){

        return launchRepository.getMutableLiveData();

    }

    public List<Launch> getLaunches2(){

        //return launchRepository.getMutableLiveData();

        ArrayList<Launch> launches = new ArrayList<>();

        try {
            launches = launchRepository.Test4();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return launches;

    }
}
