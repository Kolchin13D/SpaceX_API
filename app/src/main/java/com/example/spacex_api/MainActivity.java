package com.example.spacex_api;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.spacex_api.adapters.LaunchRecyclerView;
import com.example.spacex_api.databinding.ActivityMainBinding;
import com.example.spacex_api.models.Test.UserResponse;
import com.example.spacex_api.models.main.Launch;
import com.example.spacex_api.view.LaunchActivity;
import com.example.spacex_api.viewmodel.MainViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Launch> launches;
    ArrayList<UserResponse> users;
    private RecyclerView recyclerView;
    private LaunchRecyclerView launchAdapter;
    private SwipeRefreshLayout swipeRefreshLayout;

    private MainViewModel mainViewModel;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        getLaunches();

        swipeRefreshLayout = activityMainBinding.swipeLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.green);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getLaunches();
            }
        });
    }

    private void getLaunches() {
        mainViewModel.getLaunches().observe(this, new Observer<List<Launch>>() {
            @Override
            public void onChanged(List<Launch> liveLaunches) {
                launches = (ArrayList<Launch>) liveLaunches;
                ShowOnRecyclerView();

                if (launches.size() == 0) {
                    Toast.makeText(MainActivity.this, "NULL LAUNCHES", Toast.LENGTH_SHORT).show();
                }
                Log.v("CALL6", "size = " + launches.size());

            }
        });
    }

    private void ShowOnRecyclerView() {

        recyclerView = activityMainBinding.rvLaunch;
        launchAdapter = new LaunchRecyclerView(this, launches);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        }

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(launchAdapter);
        launchAdapter.notifyDataSetChanged();

    }
}