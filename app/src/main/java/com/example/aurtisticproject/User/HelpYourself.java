package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class HelpYourself extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_yourself);
    }

    public void call_books(View view){

         startActivity(new Intent(this, BooksContent.class));
    }

    public void call_orgs(View view){

         startActivity(new Intent(this, Organizations.class));
    }

    public void call_toys(View view){
         startActivity(new Intent(this, Toys.class));
    }

    public void call_apps(View view){
         startActivity(new Intent(this, Apps.class));
    }

    public void call_websites(View view){
         startActivity(new Intent(this, Websites.class));
    }

    public void call_videos(View view){
        openurl("https://www.youtube.com/playlist?list=PLWdP8ylcpXQYZ4yq7zAAzJxjz6eDzxu0a");
        // startActivity(new Intent(this, Social.class));
    }

    public void call_books_content(View view){
        openurl("https://drive.google.com/drive/folders/1kz3B0bxF9UEb29pXe7-wByZEaxkqv2SV?usp=sharing");
        // startActivity(new Intent(this, Social.class));
    }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}