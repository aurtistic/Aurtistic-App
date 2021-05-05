package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class HimachalPradesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachal_pradesh);
    }

    public void call_school_hp1(View view){
        openurl("https://goo.gl/maps/JQwMFhmCAgJoh2c37");}

    public void call_school_hp2(View view){
        openurl("https://goo.gl/maps/y1dgB5BLujhsL9Hi7");}


    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}