package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Odisha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odisha);
    }
    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public void call_school129(View view) {
        openurl("https://goo.gl/maps/ZnT8nZPjdYhn9JLC6");
    }

    public void call_school130(View view) {
        openurl("https://goo.gl/maps/eTregiz6Z9qreSFA8");
    }

    public void call_school131(View view) {
        openurl("https://goo.gl/maps/E8fvqK745VsjAbXC9");
    }

    public void call_school132(View view) {
        openurl("https://goo.gl/maps/SiLLQswfRBPBmhdG7");
    }

    public void call_school133(View view) {
        openurl("https://goo.gl/maps/Dowkj5mTP9Ru4ot2A");
    }

    public void call_school134(View view) {
        openurl("https://goo.gl/maps/1K9J5mgS4u7wSXkL9");
    }
}