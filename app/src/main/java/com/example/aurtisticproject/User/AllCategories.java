package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.aurtisticproject.R;

public class AllCategories extends AppCompatActivity {

    ImageView backBtn;


   // RelativeLayout quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_categories);

//        //Hooks
       // quiz= findViewById(R.id.quizTime);
        backBtn = findViewById(R.id.back_pressed);


//        quiz.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), Section_6.class);
//                startActivity(intent);
//            }
//        });


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AllCategories.super.onBackPressed();
            }
        });
    }
    public void call_quiz(View view){
        startActivity(new Intent(getApplicationContext(), Section_6.class));
    }
}