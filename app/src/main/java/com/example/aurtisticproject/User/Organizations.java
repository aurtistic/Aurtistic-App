package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Organizations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizations);
    }

    public void call_foundation1(View view) {
        openurl("https://www.tanayfoundation.org/"); }

    public void call_foundation2(View view) {
        openurl("https://www.ace-india.org/"); }

    public void call_foundation3(View view) {
        openurl("http://alfaa.org.in/#:~:text=ALFAA%20is%20Assisted%20Living%20for,adults%20with%20Autism%20in%20India."); }

    public void call_foundation4(View view) {
        openurl("http://www.autism-india.org/"); }

    public void call_foundation5(View view) {
        openurl("https://www.autismspeaks.org/"); }

    public void call_foundation6(View view) {
        openurl("https://www.autism-society.org/"); }

    public void call_foundation7(View view) {
        openurl("https://www.thecolorofautism.org/"); }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}