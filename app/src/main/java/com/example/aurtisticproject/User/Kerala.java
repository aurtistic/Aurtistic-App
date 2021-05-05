package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Kerala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);
    }
    public void call_school106(View view){
        openurl("https://g.page/cadrre?share");}

    public void call_school107(View view){
        openurl("https://goo.gl/maps/6UzZgnUDjDgZqhK2A");}


    public void call_school108(View view) {
        openurl("https://goo.gl/maps/7gRnbkUGc1gSepFs5");}

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    public void call_school109(View view) {
        openurl("https://goo.gl/maps/xVmQFfs17htnqzPY8");
    }

    public void call_school110(View view) {
        openurl("https://goo.gl/maps/33US8zPfL36kThDh6");
    }




}