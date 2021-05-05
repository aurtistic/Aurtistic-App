package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Haryana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryana);
    }

    public void call_school_haryana1(View view){
        openurl("https://goo.gl/maps/zmDbAt2Rspe6qwMa6");}

    public void call_school_haryana2(View view){
        openurl("https://goo.gl/maps/75NbrX68CtS8xESD9");}

    public void call_school_haryana3(View view){
        openurl("https://g.page/urja-school-for-special-needs-ch?share");}

    public void call_school_haryana4(View view){
        openurl("https://goo.gl/maps/3vaczKEW8E4PojQC7");}

    public void call_school_haryana5(View view){
        openurl("https://goo.gl/maps/PGHmLQLRFkAGRZ8k8");}

    public void call_school_haryana6(View view){
        openurl("https://goo.gl/maps/v81s1AiM1iWnN6MYA");}

    public void call_school_haryana7(View view){
        openurl("https://goo.gl/maps/5XT8J27ZSRspJsHw6");}

    public void call_school_haryana8(View view){
        openurl("https://goo.gl/maps/8AvoRGREgkMRWK2R9");}

    public void call_school_haryana9(View view){
        openurl("https://goo.gl/maps/m9eqZ6zQ6h3z77rD8");}

    public void call_school_haryana10(View view){
        openurl("https://goo.gl/maps/tcSdHvhnAmiNPVDn9");}


        public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}