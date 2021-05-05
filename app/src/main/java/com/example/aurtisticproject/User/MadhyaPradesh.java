package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class MadhyaPradesh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madhya_pradesh);
    }

    public void call_school111(View view) {
        openurl("https://goo.gl/maps/zdu6eSmAN4Pvg9WN8");
    }

    public void call_school112(View view) {
        openurl("https://goo.gl/maps/fDgeCREkCWYp97p16");
    }


    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void call_school135(View view) {
        openurl("https://goo.gl/maps/gnmtnWwBJQt1EpaG8");
    }

    public void call_school136(View view) {
        openurl("https://goo.gl/maps/etJFa9bFWUVBsVNe7");
    }
}