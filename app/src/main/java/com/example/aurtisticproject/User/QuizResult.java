package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.aurtisticproject.R;

public class QuizResult extends AppCompatActivity {
    TextView tv;
    Button suggest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        tv= findViewById(R.id.score);
        suggest = findViewById(R.id.curr_sug);

        String s= "";
        s= s+ Section_6.CS;
        Section_6.CS = 0;
        tv.setText(s);



    }
}