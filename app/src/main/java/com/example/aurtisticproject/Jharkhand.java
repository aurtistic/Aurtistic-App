package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Jharkhand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jharkhand);
    }

    public void call_school_jharkhand1(View view){
        openurl("https://goo.gl/maps/jkGeofij8u28dYW59");}

    public void call_school_jharkhand2(View view){
        openurl("https://goo.gl/maps/B97nFTDF9CZqQHuJA");}

    public void call_school_jharkhand3(View view){
        openurl("https://goo.gl/maps/cPe9cuL8roxhGXer8");}

    public void call_school_jharkhand4(View view){
        openurl("https://goo.gl/maps/3K5FmWXJnz8qXMVVA");}

    public void call_school_jharkhand5(View view){
        openurl("https://goo.gl/maps/dKuH3ihLs7wLaJwG6");}

    public void call_school_jharkhand6(View view){
        openurl("https://goo.gl/maps/2VKNepHEcsj9zTro6");}


    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}