package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Chattisgarh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattisgarh);
    }

    public void call_school_chattisgarh1(View view){
        openurl("https://goo.gl/maps/jV5VCjr2Y2XKkq3M7");}

    public void call_school_chattisgarh2(View view){
        openurl("https://goo.gl/maps/eQELL87ag1SJqgjd6");}

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}