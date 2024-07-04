package com.example.spacex_api;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.spacex_api.adapters.LaunchAdapter;
import com.example.spacex_api.databinding.ActivityMainBinding;
import com.example.spacex_api.models.main.Launch;
import com.example.spacex_api.models.Test.UserResponse;
import com.example.spacex_api.models.main.LaunchRepository;
import com.example.spacex_api.services.RetrofitInstance;
import com.example.spacex_api.view.LaunchActivity;
import com.example.spacex_api.viewmodel.MainViewModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Launch> launches;
    ArrayList<UserResponse> users;

    private RecyclerView recyclerView;
    private LaunchAdapter launchAdapter;

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

//        Thread Thead1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try  {
//                    getLaunches2();
//                    ShowOnRecyclerView();
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Thead1.start();

        swipeRefreshLayout = activityMainBinding.main;
        swipeRefreshLayout.setColorSchemeResources(R.color.green);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getLaunches();
            }
        });


//        recyclerView = activityMainBinding.rvLaunch;
//        launchAdapter = new LaunchAdapter(this, launches);
//
//        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
//            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
//        } else {
//            recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
//        }
//
//        recyclerView.setItemAnimator(new DefaultItemAnimator());




//        recyclerView.setAdapter(launchAdapter);
//        launchAdapter.notifyDataSetChanged();

//        Thread Thead1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try  {
//                    setname();
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//        Thead1.start();


    }

    private void getLaunches() {
        mainViewModel.getLaunches().observe(this, new Observer<List<Launch>>() {
            @Override
            public void onChanged(List<Launch> launchesFromLiveData) {
                launches = (ArrayList<Launch>) launchesFromLiveData;

                if (launches.size() == 0){
                    Toast.makeText(MainActivity.this, "NULL LAUNCHES", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }

    private void getLaunches2() {
        launches = (ArrayList<Launch>) mainViewModel.getLaunches2();

        if (launches.size() == 0) {
            Toast.makeText(MainActivity.this, "NULL LAUNCHES", Toast.LENGTH_SHORT).show();
        }

        //mainViewModel.getLaunches2().get(0);



    }


    private void ShowOnRecyclerView() {

        recyclerView = activityMainBinding.rvLaunch;
        launchAdapter = new LaunchAdapter(this, launches);

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        }

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(launchAdapter);
        launchAdapter.notifyDataSetChanged();

        recyclerView.setAdapter(launchAdapter);
        launchAdapter.notifyDataSetChanged();


    }

    private void setname() throws IOException {


        //launches = RetrofitInstance.Test4();
        launches = LaunchRepository.Test4();
        String value = launches.get(1).mission_name;

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                //textView333.setText(value);
            }
        });


    }
}