package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Bihar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bihar);
    }

    public void call_school_bihar1(View view){
        openurl("https://goo.gl/maps/kQvY43U3mV2yzR6G7");}

    public void call_school_bihar2(View view){
        openurl("https://goo.gl/maps/Dfbmta6YkfHXfuFM9");}

    public void call_school_bihar3(View view){
        openurl("https://goo.gl/maps/dEhEYmmgKJct8Yx99");}

    public void call_school_bihar4(View view){
        openurl("https://goo.gl/maps/k72rnvJmJuoCTHkA8");}

    public void call_school_bihar5(View view){
        openurl("https://goo.gl/maps/CZeeyvx3pLqeRqPY8");}

    public void call_school_bihar6(View view){
        openurl("https://goo.gl/maps/ouu8K6WxAXT2JMXQ7");}

    public void call_school_bihar7(View view){
        openurl("https://goo.gl/maps/ym9tEWUVG6UoJKHb8");}

    public void call_school_bihar8(View view){
        openurl("https://goo.gl/maps/xYSMpamyzgVo6kqv6");}

    public void call_school_bihar9(View view){
        openurl("https://goo.gl/maps/HGYnW5npFC3yJg7B8");}

    public void call_school_bihar10(View view){
        openurl("https://goo.gl/maps/25j74mcEC1YhQBjd7");}

    public void call_school_bihar11(View view){
        openurl("https://goo.gl/maps/CRqofwpa7Lji2QKf7");}

    public void call_school_bihar12(View view){
        openurl("https://goo.gl/maps/EAbYq2x3PoD84Xq86");}

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}