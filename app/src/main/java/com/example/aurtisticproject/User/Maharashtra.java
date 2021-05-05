package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Maharashtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra);
    }


    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void call_school113(View view) {
        openurl("https://goo.gl/maps/gvPs5BzYcVTP61Wg9");
    }


    public void call_school114(View view) {
        openurl("https://goo.gl/maps/R8S7DhFJyYKCHNgU9");
    }

    public void call_school115(View view) {
        openurl("https://goo.gl/maps/Hd3oAQG4H3G84dEz7");
    }

    public void call_school116(View view) {
        openurl("https://goo.gl/maps/TZoguuEwafgMss166");

    }

    public void call_school117(View view) {
        openurl("https://goo.gl/maps/HUC51YjLVRXuwHX49");
    }

    public void call_school118(View view) {
        openurl("https://goo.gl/maps/tZiszkavgkWUD2rFA");
    }

    public void call_school137(View view) {
        openurl("https://goo.gl/maps/zifEVytRG2o42xx66");
    }

    public void call_school138(View view) {
        openurl("https://goo.gl/maps/ZrCegFs4VyZ1jJ2v7");
    }
}