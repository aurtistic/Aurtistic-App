package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Telangana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telangana);
    }
    public void call_school_Telangana1(View view){
        openurl("https://goo.gl/maps/rddPY5LPdSYqY1Ys7");}

    public void call_school_Telangana2(View view){
        openurl("https://goo.gl/maps/yS3Jgc5CJjiwTwRP7");}

    public void call_school_Telangana3(View view){
        openurl("https://goo.gl/maps/uCASnKLr7bFgN9Tg6");}

    public void call_school_Telangana4(View view){
        openurl("https://goo.gl/maps/wZzPwjZokACW5RZz7");}

    public void call_school_Telangana5(View view){
        openurl("https://g.page/SmilesFoundationIndia?share");}

    public void call_school_Telangana6(View view){
        openurl("https://goo.gl/maps/nBvyuPqpJ5N9HRKX7");}

    public void call_school_Telangana7(View view){
        openurl("https://goo.gl/maps/yjnSUBNqTC2hiB7m6");}

    public void call_school_Telangana8(View view){
        openurl("https://goo.gl/maps/cYjqhomt4x9iHAc8A");}

    public void call_school_Telangana9(View view){
        openurl("https://goo.gl/maps/eakPvtzcZeTSiV1W8");}

    public void call_school_Telangana10(View view){
        openurl("https://goo.gl/maps/ppgdAtc3XQCGHWN19");}

    public void call_school_Telangana11(View view){
        openurl("https://goo.gl/maps/PZCPokX95sRv6CRv5");}

    public void call_school_Telangana12(View view){
        openurl("https://goo.gl/maps/cMfAByPCFr5Y6i7T6");}

    public void call_school_Telangana13(View view){
        openurl("https://goo.gl/maps/j3K7a5RDSCqr7jjo9");}




    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}