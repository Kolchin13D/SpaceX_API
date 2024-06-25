package com.example.spacex_api;

import static com.example.spacex_api.services.RetrofitInstance.Test;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
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
import com.example.spacex_api.services.GetData;
import com.example.spacex_api.services.RetrofitInstance;

import java.io.IOException;
import java.util.ArrayList;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<Launch> launches;
    ArrayList<UserResponse> users;

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

        TextView textView333 = findViewById(R.id.text333);
        Button button = findViewById(R.id.button);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //textView333.setText(RetrofitInstance.Test());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();

    }
}