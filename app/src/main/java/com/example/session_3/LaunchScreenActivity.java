package com.example.session_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.session_3.databinding.ActivityLaunchScreenBinding;

public class LaunchScreenActivity extends Activity {

    private ActivityLaunchScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        binding = ActivityLaunchScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(LaunchScreenActivity.this, SignInActivity.class);
                startActivity(i);
                finish();
            }
        }, 2200);
    }
}