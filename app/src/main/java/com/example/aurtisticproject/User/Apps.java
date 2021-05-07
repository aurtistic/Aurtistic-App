package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Apps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
    }

    public void call_app1(View view) {
        openurl("https://play.google.com/store/apps/details?id=com.originatorkids.EndlessReader&hl=en");
    }

    public void call_app2(View view) {
        openurl("https://play.google.com/store/apps/details?id=com.otsimo.app");
    }

    public void call_app3(View view) {
        openurl("https://play.google.com/store/apps/details?id=com.shmoontz.commboards.lite");
    }

    public void call_app4(View view) {
        openurl("https://play.google.com/store/apps/details?id=com.dokye.abcautismo&hl=en_IN&gl=US");
    }

    public void call_app5(View view) {
        openurl("https://play.google.com/store/apps/details?id=de.appnotize.letmetalk&hl=en_IN&gl=US");
    }

    public void call_app6(View view) {
        openurl("https://play.google.com/store/apps/details?id=com.specialiapps.specialwords&hl=en_IN&gl=US");
    }

    public void call_app7(View view) {
        openurl("https://play.google.com/store/apps/details?id=com.binarylabs.dexteria&hl=en_IN&gl=US");
    }

    public void openurl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }
}