package com.example.a5_laba;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity {

    VideoView videoPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoPlayer = findViewById(R.id.VideoView);
        Uri myVideoUri= Uri.parse( "android.resource://" + getPackageName() + "/" + R.raw.pepe);
        videoPlayer.setVideoURI(myVideoUri);
    }

    public void Play(View view){
        videoPlayer.start();
    }
    public void Pause(View view){
        videoPlayer.pause();
    }
    public void Stop(View view){
        videoPlayer.stopPlayback();
        videoPlayer.resume();
    }

}