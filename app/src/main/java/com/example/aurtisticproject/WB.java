package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class WB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_w_b);
    }

    public void call_school_wb1(View view){
        openurl("https://goo.gl/maps/gKcGZJjeQ8V3vXHk8");}

    public void call_school_wb2(View view){
        openurl("https://goo.gl/maps/qWqBLQMBsBbMZJJW8");}

    public void call_school_wb3(View view){
        openurl("https://goo.gl/maps/DtAvs97CpXMje9UG9");}

    public void call_school_wb4(View view){
        openurl("https://g.page/SparkSpecialLearning?share");}

    public void call_school_wb5(View view){
        openurl("https://goo.gl/maps/rKMS5tfRVjcsNX8H7");}

    public void call_school_wb6(View view){
        openurl("https://goo.gl/maps/PJPsrRboiheiFm518");}

    public void call_school_wb7(View view){
        openurl("https://goo.gl/maps/duibFXkATYDVNY4F8");}

    public void call_school_wb8(View view){
        openurl("https://goo.gl/maps/i6MjtZrFNBKV415S6");}

    public void call_school_wb9(View view){
        openurl("https://goo.gl/maps/DdqwW2ncchcyPCbJ9");}

    public void call_school_wb10(View view) {
        openurl("https://goo.gl/maps/3K4dtc1iGagF3Gmg9");
    }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}


}