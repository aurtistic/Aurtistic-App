package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Delhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
    }

    public void call_school120(View view) {
        openurl("https://g.page/Delhispecialschool?share");

    }
    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void call_school121(View view) {
        openurl("https://goo.gl/maps/fF7aFQH5x47Y8xYQ8");
    }

    public void call_school122(View view) {
        openurl("https://goo.gl/maps/kjCXZK64CDERToqh9");
    }

    public void call_school123(View view) {
        openurl("https://goo.gl/maps/zUmxzNq3XAz1WixQA");
    }

    public void call_school124(View view) {
        openurl("https://goo.gl/maps/oTKVihYqauyrNhkt8");
    }

    public void call_school125(View view) {
        openurl("https://goo.gl/maps/JA3w2UvbHXePRCbBA");
    }

    public void call_school126(View view) {
        openurl("https://g.page/nishtha-special-school-dilshad?share");
    }

    public void call_school127(View view) {
        openurl("https://g.page/sampoorandss?share");
    }

    public void call_school128(View view) {
        openurl("https://goo.gl/maps/hK7STraPFUQu1peKA");
    }
}