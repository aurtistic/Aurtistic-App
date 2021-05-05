package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class UP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_p);
    }

    public void call_school_UttarPradesh1(View view){
        openurl("https://g.page/isupportfoundationlko?share");}

    public void call_school_UttarPradesh2(View view){
        openurl("https://goo.gl/maps/sGNrF58PU5Dsh6FEA");}

    public void call_school_UttarPradesh3(View view){
        openurl("https://g.page/skills-and-interest-development?share");}

    public void call_school_UttarPradesh4(View view){
        openurl("https://goo.gl/maps/sZTmxgMTkRPeo1qa8");}

    public void call_school_UttarPradesh5(View view){
        openurl("https://g.page/Rosalinchilddevelopment?share");}

    public void call_school_UttarPradesh6(View view){
        openurl("https://goo.gl/maps/UfrF9NkbkroqQBM7A");}

    public void call_school_UttarPradesh7(View view){
        openurl("https://g.page/ArambHAutism?share");}

    public void call_school_UttarPradesh8(View view){
        openurl("https://goo.gl/maps/RA3J4Vr8USmgLGUp7");}

    public void call_school_UttarPradesh9(View view){
        openurl("https://goo.gl/maps/wgXGur3cRW3hhPGF7");}


    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}