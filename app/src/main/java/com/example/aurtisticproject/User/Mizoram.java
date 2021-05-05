package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Mizoram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mizoram);
    }
    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    public void call_school119(View view) {
        openurl("https://goo.gl/maps/uKTubabfvor1tvtw6");
    }


    public void call_school141(View view) {
        openurl("https://goo.gl/maps/TgwF455qHug1WrEx5");
    }

    public void call_school142(View view) {
        openurl("https://goo.gl/maps/pSe5iq9yuct1ytWQ6");
    }

    public void call_school143(View view) {
        openurl("https://goo.gl/maps/QXUY9FEhsUTYPd436");
    }
}