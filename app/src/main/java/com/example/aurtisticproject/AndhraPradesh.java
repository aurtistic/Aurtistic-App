package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AndhraPradesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andhra_pradesh);
    }

    public void call_school1(View view){
        openurl("https://goo.gl/maps/mJr4TSi97BBPAJgTA");}

    public void call_school2(View view){
        openurl("https://goo.gl/maps/rVqnTrvrv1Kqoe6MA");}

    public void call_school3(View view){
        openurl("https://goo.gl/maps/owwCosG1zTFywA3U6");}

    public void call_school4(View view){
        openurl("https://goo.gl/maps/cVk9ZK1uxgRFetaJ7");}

    public void call_school5(View view){
        openurl("https://goo.gl/maps/tYpUsxFzX1CTht7i8");}

    public void call_school6(View view){
        openurl("https://goo.gl/maps/rTNfbjCRNR6oVUR9A");}

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}