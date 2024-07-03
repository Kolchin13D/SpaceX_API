package com.example.spacex_api;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spacex_api.adapters.LaunchAdapter;
import com.example.spacex_api.models.main.Launch;
import com.example.spacex_api.models.Test.UserResponse;
import com.example.spacex_api.models.main.LaunchRepository;
import com.example.spacex_api.services.RetrofitInstance;

import java.io.IOException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Launch> launches;
    ArrayList<UserResponse> users;

    private RecyclerView recyclerView;
    private LaunchAdapter launchAdapter;

    private String name;

    TextView textView333;


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

        textView333 = findViewById(R.id.text333);

        Thread Thead1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try  {
                    setname();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thead1.start();


    }

    private void setname() throws IOException {

        //launches = RetrofitInstance.Test4();
        launches = LaunchRepository.Test4();
        String value = launches.get(1).mission_name;

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textView333.setText(value);
            }
        });

        //launches = RetrofitInstance.Test4();

//        recyclerView = findViewById(R.id.recyclerView);
//        launchAdapter = new LaunchAdapter(launches);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
//        recyclerView.setLayoutManager(layoutManager);
//        recyclerView.setAdapter(launchAdapter);

    }
}