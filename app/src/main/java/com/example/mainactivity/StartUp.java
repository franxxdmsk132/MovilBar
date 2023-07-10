package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class StartUp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
        VideoView video = findViewById(R.id.videoView);
        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ham);
        video.start();



        TimerTask StartUp = new TimerTask() {
            @Override
            public void run() {


                Intent intent = new Intent(StartUp.this, LoginActivity.class);
                startActivity(intent);
                finish();

            }

        };

        Timer tiempo = new Timer();
        tiempo.schedule(StartUp, 2000);

    }
}