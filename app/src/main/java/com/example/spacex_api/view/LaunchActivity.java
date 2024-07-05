package com.example.spacex_api.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.spacex_api.R;
import com.example.spacex_api.databinding.ActivityLaunchBinding;
import com.example.spacex_api.models.main.Launch;

public class LaunchActivity extends AppCompatActivity {

    private Launch launch;
    private ActivityLaunchBinding activityLaunchBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_launch);
        TextView textView = findViewById(R.id.flight_number);

        androidx.appcompat.widget.Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        activityLaunchBinding = DataBindingUtil.setContentView(this, R.layout.activity_launch);

        Intent intent = getIntent();

        if (intent != null) {
            launch = intent.getParcelableExtra("launch");
            activityLaunchBinding.setLaunch(launch);
            getSupportActionBar().setTitle(launch.getMission_name());

        }

        textView.setText(launch.getMission_name());
    }
}