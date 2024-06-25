package com.example.spacex_api;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.spacex_api.adapters.LaunchAdapter;
import com.example.spacex_api.models.LaunchsResponse;
import com.example.spacex_api.models.Launch;
import com.example.spacex_api.models.Test.ListUsersResponse;
import com.example.spacex_api.models.Test.UserResponse;
import com.example.spacex_api.services.GetData;
import com.example.spacex_api.services.RetrofitInstance;

import org.jetbrains.annotations.TestOnly;

import java.io.IOException;
import java.util.ArrayList;

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

    @TestOnly
    private void GetLaunches() {

        int page = 2;

        Response<UserResponse> response = GetData.

        assert response.isSuccessful() : "response is not Successful";

        Log.v("RESPONSE", response.message());

        ListUsersResponse userResponse = response.body();
        assert userResponse.equals("") : "launchsResponse equals null";

    }


}