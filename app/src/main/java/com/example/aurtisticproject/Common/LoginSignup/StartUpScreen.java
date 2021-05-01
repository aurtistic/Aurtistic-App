package com.example.aurtisticproject.Common.LoginSignup;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.aurtisticproject.R;
import com.example.aurtisticproject.User.Login;
import com.example.aurtisticproject.User.Section_4;
import com.example.aurtisticproject.User.Signup;

public class StartUpScreen extends AppCompatActivity {

//    private VideoView videoView;
//    FrameLayout videoFrame;
//    LayoutInflater inflater;
////    int mCurrentVideoPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        videoFrame = (FrameLayout) findViewById(R.id.videoFrameLayout);
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start_up_screen);

//        // create an object of media controller
//        MediaController mediaController = new MediaController(this);
//// initiate a video view
//        VideoView simpleVideoView = (VideoView) findViewById(R.id.your_video_view);
//// set media controller object for a video view
//        simpleVideoView.setMediaController(mediaController);
//
////        videoView = (VideoView) inflater.inflate(R.layout.your_video_view, null);
////        MediaController mediaController = new MediaController(this);
////        mediaController.setAnchorView(videoView);
////        videoView.setMediaController(mediaController);
////        videoView.setVideoPath(String.valueOf(R.raw.video_updated));
////        videoFrame.addView(videoView);
////        videoView.start();
//
//        // initiate a video view
//      //  VideoView simpleVideoView = (VideoView) findViewById(R.id.your_video_view);
//        simpleVideoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_updated));
//        simpleVideoView.start();


//        video = (VideoView) findViewById(R.id.video);
//
//
//
////        String path = "android.resources://com.example.aurtisticproject.Common.LoginSignup/"+R.raw.video_updated;
////        Uri u = Uri.parse(path);
////        video.setVideoURI(u);
//        video.start();
//
//        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//            @Override
//            public void onPrepared(MediaPlayer mp) {
//                mp.setLooping(true);
//                if (mCurrentVideoPosition != 0){
//                    mp.seekTo(mCurrentVideoPosition);
//                    mp.start();
//                }
//            }
//        });
//    }
//
//    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
//    @Override
//    public void onPause() {
//        super.onPause();
//        if (video.isPlaying()) {
//            // Argument equals true to notify the system that the activity
//            // wishes to be visible behind other translucent activities
//            if (! requestVisibleBehind(true)) {
//                // App-specific method to stop playback and release resources
//                // because call to requestVisibleBehind(true) failed
//                video.stopPlayback();
//            }
//        } else {
//            // Argument equals false because the activity is not playing
//            requestVisibleBehind(false);
//        }
//    }
//
//    @Override
//    public void onVisibleBehindCanceled() {
//        // App-specific method to stop playback and release resources
//        video.stopPlayback();
//        super.onVisibleBehindCanceled();
//    }
//
//    @Override
//    protected void onResume() {
//        video.resume();
//        super.onResume();
//    }
//
////    @Override
////    protected void onPause() {
////        video.suspend();
////        super.onPause();
////    }
//
//    @Override
//    protected void onDestroy() {
//        video.stopPlayback();
//        super.onDestroy();
//    }
    }


        public void callLogin (View view){
            startActivity(new Intent(getApplicationContext(), Login.class));
        }

        public void callSignup (View view){
            startActivity(new Intent(getApplicationContext(), Signup.class));
        }
    }


