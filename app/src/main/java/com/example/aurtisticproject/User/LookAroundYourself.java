package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.AndhraPradesh;
import com.example.aurtisticproject.R;

public class LookAroundYourself extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_around_yourself);
    }

    public void call_andhra(View view){
//        openurl("https://www.google.com/maps/search/action+for+autism/@28.4375046,77.0112926,11z/data=!3m1!4b1");
         startActivity(new Intent(this, AndhraPradesh.class));
    }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}