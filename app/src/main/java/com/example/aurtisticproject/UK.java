package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class UK extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_k);
    }

    public void call_school_Uttrakhand1(View view){
        openurl("https://goo.gl/maps/uRxRuZLm2KtAJ4YJA");}

    public void call_school_Uttrakhand2(View view){
        openurl("https://goo.gl/maps/s2swniGuJWgW6ry68");}

    public void call_school_Uttrakhand3(View view){
        openurl("https://goo.gl/maps/dbrfZwuTiHoiW9mZ7");}

    public void call_school_Uttrakhand4(View view){
        openurl("https://goo.gl/maps/3QXtfv7CAnhk9EYR7");}

    public void call_school_Uttrakhand5(View view){
        openurl("https://goo.gl/maps/NaEWFsxUr9gwWmho8");}

    public void call_school_Uttrakhand6(View view){
        openurl("https://g.page/soran-kids-foundation?share");}

    public void call_school_Uttrakhand7(View view){
        openurl("https://goo.gl/maps/toRNiYrAQszmXzVf7");}

    public void call_school_Uttrakhand8(View view){
        openurl("https://goo.gl/maps/t5nhYdcTmTbnn8yn8");}




    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}