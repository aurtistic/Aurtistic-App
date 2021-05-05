package com.example.aurtisticproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Gujarat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarat);
    }

    public void call_school_gujarat1(View view){
        openurl("https://goo.gl/maps/jaEcS8Nw5pUxJQBMA");}

    public void call_school_gujarat2(View view){
        openurl("https://goo.gl/maps/Pr7u9hDd9QypreoE9");}

    public void call_school_gujarat3(View view){
        openurl("https://g.page/sairesidentialschool?share");}

    public void call_school_gujarat4(View view){
        openurl("https://goo.gl/maps/Er8bHtU626b7cq8JA");}

    public void call_school_gujarat5(View view){
        openurl("https://goo.gl/maps/LPtp57o7iTRED4bG8");}

    public void call_school_gujarat6(View view){
        openurl("https://goo.gl/maps/vzXLTyUjA9QqHhB76");}

    public void call_school_gujarat7(View view){
        openurl("https://g.page/pearlspecialneedsfoundation?share");}

    public void call_school_gujarat8(View view){
        openurl("https://goo.gl/maps/opStj3nhEHGxjY1t7");}

    public void call_school_gujarat9(View view){
        openurl("https://g.page/samvedna-learning-centre-for-spe?share");}

    public void call_school_gujarat10(View view){
        openurl("https://goo.gl/maps/TY1unDGn3ZBmnSnx9");}

    public void call_school_gujarat11(View view){
        openurl("https://goo.gl/maps/8FVroiYhJqTUjtp4A");}

    public void call_school_gujarat12(View view){
        openurl("https://goo.gl/maps/oWSqUJtaubk8o3Ye7");}



    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));}
}