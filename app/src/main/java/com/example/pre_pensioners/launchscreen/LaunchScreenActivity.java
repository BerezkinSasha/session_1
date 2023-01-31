package com.example.pre_pensioners.launchscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

import com.example.pre_pensioners.MainActivity;
import com.example.pre_pensioners.R;
import com.example.pre_pensioners.signin.SignInActivity;

public class LaunchScreenActivity extends AppCompatActivity {

    Handler h = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(LaunchScreenActivity.this, SignInActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }
}