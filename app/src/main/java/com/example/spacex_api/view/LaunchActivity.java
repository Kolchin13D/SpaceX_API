package com.example.spacex_api.view;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.bumptech.glide.Glide;
import com.example.spacex_api.MainActivity;
import com.example.spacex_api.R;
import com.example.spacex_api.databinding.ActivityLaunchBinding;
import com.example.spacex_api.models.main.Launch;

public class LaunchActivity extends AppCompatActivity {

    private Launch launch;
    private ActivityLaunchBinding activityLaunchBinding;

    private ImageView imageView;
    private TextView number, name, details;
    private Toolbar toolbar;

    private int value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_launch);

        imageView = findViewById(R.id.ivLargePatch);
        number = findViewById(R.id.actflight_number);
        name = findViewById(R.id.actmission_name);
        details = findViewById(R.id.actdetails);
        toolbar = findViewById(R.id.toolbarLaunch);

        GetDataFromIntent();
    }

    private void GetDataFromIntent() {
        if (getIntent().hasExtra("launch")) {

            Intent intent = getIntent();
            Launch launch = intent.getParcelableExtra("launch");
            Log.v("CALL8", "intent = " + launch.mission_name);
            Toast.makeText(this, "LAUNCH  " + launch.mission_name, Toast.LENGTH_SHORT).show();


            String imagePath = getIntent().getStringExtra("img");
            Glide.with(imageView.getContext())
                    .load(imagePath)
                    .into(imageView);

            number.setText(String.valueOf(intent.getIntExtra("num", 0)));
            Log.v("CALL8", "intent = " + getIntent().getStringExtra("num"));

            name.setText(getIntent().getStringExtra("name"));
            details.setText(getIntent().getStringExtra("details"));
            String title = getIntent().getStringExtra("name") + " / "
                    + String.valueOf(intent.getIntExtra("num", 0)
            );

            toolbar.setTitle(title);

        }
    }
}