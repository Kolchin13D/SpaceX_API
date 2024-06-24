package com.example.spacex_api;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spacex_api.adapters.LaunchAdapter;
import com.example.spacex_api.models.LaunchsResponse;
import com.example.spacex_api.models.Launch;
import com.example.spacex_api.services.GetData;
import com.example.spacex_api.services.RetrofitInstance;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ArrayList<Launch> launches;
    private RecyclerView recyclerView;
    private LaunchAdapter launchAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        GetLaunches();
    }

    private Object GetLaunches() {

        GetData getData = RetrofitInstance.getData();
        Call<LaunchsResponse> call = getData.getPastLaunches(2023, 195);

        call.enqueue(new Callback<LaunchsResponse>() {
            @Override
            public void onResponse(Call<LaunchsResponse> call, Response<LaunchsResponse> response) {
                LaunchsResponse result = response.body();
                Log.v("RESULT", result.toString());

                if(result != null && result.getResult() != null){

                    //launches = (ArrayList<Launch>) result.getResult();

                    for(Launch c: launches){
                        //Log.i("TAG", ""+ c.getName());

                    }

                    ViewData();
                }else {
                    Toast.makeText(MainActivity.this, "ERROR 403", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LaunchsResponse> call, Throwable throwable) {
                Log.v("ERROR", throwable.toString());
                Toast.makeText(MainActivity.this, "ERROR onFailure", Toast.LENGTH_SHORT).show();
            }
        });

        return launches;
    }

    private void ViewData() {
        recyclerView = findViewById(R.id.recyclerView);
        launchAdapter = new LaunchAdapter(launches);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(launchAdapter);
    }
}