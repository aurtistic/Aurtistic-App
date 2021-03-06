package com.example.aurtisticproject.User;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aurtisticproject.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserProfile extends AppCompatActivity {

    Button logout;
    TextView textView;
    static String user_name="Guest";
    FirebaseAuth mAuth;
    FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        textView =findViewById(R.id.textView2);
        mAuth = FirebaseAuth.getInstance();

//        textView.setText(Login.name);
//        Toast.makeText(UserProfile.this, Login.name, Toast.LENGTH_SHORT).show();
        showName();
        logout =findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Login.logout=true;
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
    }

    private void showName() {
//        Intent intent = getIntent();
        user= mAuth.getCurrentUser();
//        Toast.makeText(this, user.getDisplayName(), Toast.LENGTH_SHORT).show();
//        user_name = intent.getStringExtra("name");


        textView.setText("Hello " + user.getDisplayName());
    }


    @Override
    public void onBackPressed() {
            finishAffinity();
            Intent a = new Intent(getApplicationContext(), UserDashboard.class);
            startActivity(a);
        }
    }
