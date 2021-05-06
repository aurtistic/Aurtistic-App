package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class Toys extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toys);
    }

    public void call_toy1(View view) {
        openurl("https://www.amazon.com/Sensory-Anti-Anxiety-Anxiety-Birthday-Classroom/dp/B08V4SFT1F/ref=sr_1_6?dchild=1&keywords=autism+toy&qid=1620314847&sr=8-6");
    }

    public void call_toy2(View view) {
        openurl("https://www.amazon.in/CraftDev-Intellectual-Geometric-Matching-Educational/dp/B01N4646N8?ref_=Oct_s9_apbd_orecs_hd_bw_b1VHTBn&pf_rd_r=SXNKJSSHVVHEZMNYEBF2&pf_rd_p=21dfd081-0d68-5bdb-b7cd-655baff165e9&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=1378363031");
    }

    public void call_toy3(View view) {
        openurl("https://www.amazon.in/ButterflyFields-Alphabets-Construction-Educational-Preschool/dp/B08HNB7WG3?ref_=Oct_s9_apbd_orecs_hd_bw_b1VHTBn&pf_rd_r=SXNKJSSHVVHEZMNYEBF2&pf_rd_p=21dfd081-0d68-5bdb-b7cd-655baff165e9&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=1378363031");
    }

    public void call_toy4(View view) {
        openurl("https://www.amazon.in/PROF-SIMON-Soroban-Plastic-Multicolour/dp/B08J89H8FP?ref_=Oct_s9_apbd_orecs_hd_bw_b1VHTBn&pf_rd_r=SXNKJSSHVVHEZMNYEBF2&pf_rd_p=21dfd081-0d68-5bdb-b7cd-655baff165e9&pf_rd_s=merchandised-search-10&pf_rd_t=BROWSE&pf_rd_i=1378363031");
    }

    public void call_toy5(View view) {
        openurl("https://www.amazon.com/Kidoozie-Foam-Pogo-Jumper-Encourages/dp/B00704IO48/?tag=thebump-generic-20");
    }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}