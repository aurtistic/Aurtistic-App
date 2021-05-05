package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Karnataka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka);
    }
    public void call_school100(View view){
        openurl("https://goo.gl/maps/NL1xor97X8hjwcb68");}

    public void call_school101(View view){
        openurl("https://g.page/PoornimaBhat?share");}


    public void call_school102(View view) {
        openurl("https://goo.gl/maps/LQSYJi8iR66h9pMr5");}

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    public void call_school103(View view) {
        openurl("https://g.page/bechangecentre?share");
    }

    public void call_school104(View view) {
        openurl("https://goo.gl/maps/UqtrNpJAwSsRgZih9");
    }

    public void call_school105(View view) {
        openurl("https://g.page/colourslearningcentre?share");
    }
}
