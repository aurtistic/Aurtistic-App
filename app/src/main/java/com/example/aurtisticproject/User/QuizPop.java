package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aurtisticproject.R;

public class QuizPop extends AppCompatActivity {

    Button b1,b2,b3;//parent caretaker individual
    public static boolean valid= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_pop);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid=true;
                Intent intent = new Intent(getApplicationContext(),Section_6.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid=true;
                Intent intent = new Intent(getApplicationContext(),Section_6.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valid=false;
                Intent intent = new Intent(getApplicationContext(),Section_6.class);
                startActivity(intent);
            }
        });
    }
}