package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.aurtisticproject.R;

public class BooksContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_content);
    }

    public void call_amazon1(View view) {
        openurl("https://www.amazon.com/Teaching-Raising-Children-Aspergers-Expanded/dp/1935274066");
    }

    public void call_amazon2(View view) {
        openurl("https://www.amazon.in/Parents-Teachers-Guide-Book-Autism/dp/B084HHQKGP");
    }

    public void call_amazon3(View view) {
        openurl("https://www.amazon.com/Reason-Jump-Inner-Thirteen-Year-Old-Autism/dp/081298515X/ref=sr_1_1?s=books&ie=UTF8&qid=1535656405&sr=1-1&keywords=The+Reason+I+Jump&pldnSite=1");
    }

    public void call_amazon4(View view) {
        openurl("https://www.amazon.in/Thinking-Pictures-Expanded-Life-Autism/dp/0307275655");
    }

    public void call_amazon5(View view) {
        openurl("https://www.amazon.in/Curious-Incident-Dog-Night-time/dp/0099450259");
    }

    public void call_amazon6(View view) {
        openurl("https://www.amazon.com/All-My-Stripes-Children-Autism/dp/1433819171");
    }

    public void call_amazon7(View view) {
        openurl("https://www.amazon.in/Yellow-Frisbee-Woodbine-Special-Needs-Collection/dp/0933149832");
    }

    public void call_amazon8(View view) {
        openurl("https://www.amazon.in/Autism-Acceptance-Book-Friend-Someone/dp/0975986821/ref=sr_1_1?dchild=1&keywords=the+autism+acceptance+book&qid=1620304571&s=books&sr=1-1");
    }


    public void call_pdf1(View view) {
        openurl("https://www.readpbn.com/pdf/1001-Great-Ideas-for-Teaching-and-Raising-Children-with-Autism-or-Asperger's-Sample-Pages.pdf"); }

    public void call_pdf2(View view) {
        openurl("https://www.neurogenbsi.com/assets/frontend/pdf/books/6-Parent-and-Teacher-Guidebook-for-Autism-2nd-edition.pdf"); }

    public void call_pdf4(View view) {
        openurl("http://iwtf.ie/wp-content/uploads/2014/05/TEMPLE-GRANDIN-Thinking-In-Pictures.pdf"); }

    public void call_pdf5(View view) {
        openurl("https://docs.google.com/viewer?a=v&pid=sites&srcid=ZGVmYXVsdGRvbWFpbnxzaG9ydHN0b3J5MTAxbmVmdXxneDo3NmZkNGFjZGI2MzZmMjE5"); }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}