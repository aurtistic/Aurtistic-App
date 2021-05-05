package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Goa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);
    }

    public void call_school_goa1(View view){
        openurl("https://goo.gl/maps/xDvvQpH2LYpQsWTf6");}

    public void call_school_goa2(View view){
        openurl("https://goo.gl/maps/ZcyzsTqkxfPT1geeA");}

    public void call_school_goa3(View view){
        openurl("https://g.page/TheOwlHouseGoa?share");}

    public void call_school_goa4(View view){
        openurl("https://goo.gl/maps/3CfUdZyipQVFsA9T9");}

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}