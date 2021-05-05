package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Tripura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripura);
    }
    public void call_school_Tripura1(View view){
        openurl("https://goo.gl/maps/cTnkQATVMmLZ25B27");}

    public void call_school_Tripura2(View view){
        openurl("https://goo.gl/maps/4a6uZc49QuSop8EW8");}
    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}