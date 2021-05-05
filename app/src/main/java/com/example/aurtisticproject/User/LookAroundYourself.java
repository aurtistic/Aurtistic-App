package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.AndhraPradesh;
import com.example.aurtisticproject.ArunachalPradesh;
import com.example.aurtisticproject.Assam;
import com.example.aurtisticproject.Bihar;
import com.example.aurtisticproject.Chattisgarh;
import com.example.aurtisticproject.Goa;
import com.example.aurtisticproject.Gujarat;
import com.example.aurtisticproject.Haryana;
import com.example.aurtisticproject.HimachalPradesh;
import com.example.aurtisticproject.Jharkhand;
import com.example.aurtisticproject.R;

public class LookAroundYourself extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_around_yourself);
    }

    public void call_andhra(View view){
         startActivity(new Intent(this, AndhraPradesh.class));}

    public void call_arunachal(View view){
        startActivity(new Intent(this, ArunachalPradesh.class));}

    public void call_assam(View view){
        startActivity(new Intent(this, Assam.class));}

    public void call_bihar(View view){
        startActivity(new Intent(this, Bihar.class));}

    public void call_chattisgarh(View view){
        startActivity(new Intent(this, Chattisgarh.class));}

    public void call_goa(View view){
        startActivity(new Intent(this, Goa.class));}

    public void call_gujarat(View view){
        startActivity(new Intent(this, Gujarat.class));}

    public void call_haryana(View view){
        startActivity(new Intent(this, Haryana.class));}

    public void call_himachal(View view){
        startActivity(new Intent(this, HimachalPradesh.class));}

    public void call_jharkhand(View view){
        startActivity(new Intent(this, Jharkhand.class));}

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}