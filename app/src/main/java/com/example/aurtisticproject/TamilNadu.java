package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class TamilNadu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_nadu);
    }
   public void call_school_tamilnadu1(View view){
    openurl("https://goo.gl/maps/jWjC2rthzNsgUsz2A");}

    public void call_school_tamilnadu2(View view){
        openurl("https://goo.gl/maps/KndACCN1v7ChPmTM6");}

    public void call_school_tamilnadu3(View view){
        openurl("https://goo.gl/maps/nEjiVdMAELSXxsCU7");}

    public void call_school_tamilnadu4(View view){
        openurl("https://goo.gl/maps/DuK7AzU9kKrJ1rro7");}

    public void call_school_tamilnadu5(View view){
        openurl("https://goo.gl/maps/ku6eDbZ5gZZuz1Gq7");}

    public void call_school_tamilnadu6(View view){
        openurl("https://goo.gl/maps/iVhjBTnYmFwg9y4E8");}

    public void call_school_tamilnadu7(View view){
        openurl("https://goo.gl/maps/kwSSooherLZn9ztT8");}

    public void call_school_tamilnadu8(View view){
        openurl("https://goo.gl/maps/cTSvRNYATahTWVix8");}

    public void call_school_tamilnadu9(View view){
        openurl("https://goo.gl/maps/E5Njhs3ZrHaQvhbv6");}

    public void call_school_tamilnadu10(View view){
        openurl("https://goo.gl/maps/yFvCxpfKm2PVSJyCA");}




    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}