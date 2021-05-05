package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Manipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipur);
    }
    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    public void call_school139(View view) {
        openurl("https://goo.gl/maps/utsx7LpRdd4Dy8xM6");
    }

    public void call_school140(View view) {
        openurl("https://goo.gl/maps/4ku2oL1Pq6xPmmwp9");
    }
}