package com.example.spacex_api;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spacex_api.adapters.LaunchAdapter;
import com.example.spacex_api.models.Launch;
import com.example.spacex_api.models.Test.UserResponse;
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

        Thread MainThead = new Thread(new Runnable() {
            @Override
            public void run() {
                try  {
                    setname();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        MainThead.start();
    }

    private void setname() throws IOException {

        launches = RetrofitInstance.Test4();

        //String value = RetrofitInstance.Test3();

        String value = launches.get(1).mission_name;

        //RetrofitInstance.Test4().get(0).mission_name;

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                textView333.setText(value);
            }
        });

    }
}