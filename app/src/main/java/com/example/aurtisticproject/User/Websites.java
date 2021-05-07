package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Websites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_websites);
    }

    public void call_web1(View view) {
        openurl("https://www.autismspeaks.org/");
    }

    public void call_web2(View view) {
        openurl("https://www.autism-society.org/");
    }

    public void call_web3(View view) {
        openurl("https://www.disabilityscoop.com/");
    }

    public void call_web4(View view) {
        openurl("https://www.autismnj.org/");
    }

    public void call_web5(View view) {
        openurl("https://autism.com/");
    }

    public void call_web6(View view) {
        openurl("http://autismhwy.com/");
    }

    public void openurl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}