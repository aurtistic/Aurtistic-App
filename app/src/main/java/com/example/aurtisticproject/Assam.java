package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Assam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assam);
    }

    public void call_school_assam1(View view){
        openurl("https://goo.gl/maps/bag95F9ozR1BRqo16");}

    public void call_school_assam2(View view){
        openurl("https://goo.gl/maps/RUG2F7Qmrd5vegPB7");}

    public void call_school_assam3(View view){
        openurl("https://goo.gl/maps/fzqdmBgnwYFWr6fE9");}

    public void call_school_assam4(View view){
        openurl("https://goo.gl/maps/JgQxE2yJ2J2GRJWB7");}

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}