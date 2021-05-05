package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Rajasthan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);

    }
    public void call_school_Rajasthan1(View view){
        openurl("https://goo.gl/maps/PgmjGoep9GChTrR19");}

    public void call_school_Rajasthan2(View view){
        openurl("https://g.page/Approach-Autism?share");}

    public void call_school_Rajasthan3(View view){
        openurl("https://goo.gl/maps/u3PBaRCdF1khhH7u5");}

    public void call_school_Rajasthan4(View view){
        openurl("https://goo.gl/maps/QqdoGrN15JAQtJYi6");}

    public void call_school_Rajasthan5(View view){
        openurl("https://goo.gl/maps/Ek8EwG1KfteaDfs2A");}

    public void call_school_Rajasthan6(View view){
        openurl("https://goo.gl/maps/eT6hVsce26v7Mpuz6");}

    public void call_school_Rajasthan7(View view){
        openurl("https://goo.gl/maps/Z9YFyJquGAaVPFCWA");}

    public void call_school_Rajasthan8(View view){
        openurl("https://goo.gl/maps/4kBCzWCD6x9iqDMM6");}

    public void call_school_Rajasthan9(View view){
        openurl("https://goo.gl/maps/hcPYthGbTRbgDEMM6");}

    public void call_school_Rajasthan10(View view){
        openurl("https://goo.gl/maps/b3pzUQqKjLQ486TDA");}

    public void call_school_Rajasthan11(View view){
        openurl("https://goo.gl/maps/QjhDtETWdgXMpvdx9");}

    public void call_school_Rajasthan12(View view){
        openurl("https://goo.gl/maps/arzs5knpngmKwkG27");}

    public void call_school_Rajasthan13(View view){
        openurl("https://g.page/lakshay-special-school?share");}

    public void call_school_Rajasthan14(View view){
        openurl("https://g.page/BestChildSpecialistinJaipur?share");}


    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}