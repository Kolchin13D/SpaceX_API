package com.example.spacex_api.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.spacex_api.models.main.Launch;
import com.example.spacex_api.models.main.LaunchRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {

    private LaunchRepository launchRepository;

    public MainViewModel() {
        launchRepository = LaunchRepository.getInstance();
    }

    // Live data
    public LiveData<List<Launch>> getLaunches(){

        Log.v("CALL6", "size = " + launchRepository.getLaunches().getValue());

        return launchRepository.getLaunches();
    }
}
