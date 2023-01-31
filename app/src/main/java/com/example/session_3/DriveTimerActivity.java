package com.example.session_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.session_3.databinding.ActivityDriveTimerBinding;

public class DriveTimerActivity extends Activity {

    ActivityDriveTimerBinding binding;

    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive_timer);

        binding = ActivityDriveTimerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        btnStop = findViewById(R.id.button);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DriveTimerActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}