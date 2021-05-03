package com.example.aurtisticproject.User;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aurtisticproject.R;
import com.example.aurtisticproject.User.Signup;
import com.example.aurtisticproject.User.UserProfile;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

public class Login extends AppCompatActivity {

    Button CallSignUp, login_btn;

    ImageView image, G_signin , fb_signin;

    static String user;
    TextView logoText, sloganText;
      private GoogleSignInClient mGoogleSignInClient;
      private final static int RC_SIGN_IN=123;
      private FirebaseAuth mAuth;

    TextInputLayout username, password;

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user!=null)
        {
            Intent intent = new Intent(getApplicationContext(),UserProfile.class);
            startActivity(intent);
        }
    }

    private void handleFacebookAccessToken(AccessToken token) {
        Log.d("TAG", "handleFacebookAccessToken:" + token);

        AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("TAG", "signInWithCredential:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Log.i("TAG", "onComplete: login completed with user: " + user);

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("TAG", "signInWithCredential:failure", task.getException());
                            Toast.makeText(getApplicationContext(), "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start_up_screen);
        //Hooks
        CallSignUp = findViewById(R.id.sign_up_screen);
        image = findViewById(R.id.logo_image);
//        logoText = findViewById(R.id.logo_name);
        sloganText = findViewById(R.id.slogan_name);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login_btn = findViewById(R.id.Login_btn);
        G_signin = findViewById(R.id.gsignin1);
//        fb_signin = findViewById(R.id.fsignin1);
        LoginButton fbloginButton = findViewById(R.id.fsignin);

        CallbackManager mCallbackManager = CallbackManager.Factory.create();

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        gSignIn();

        G_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

        //facebook
        //Facebook signin
        fbloginButton.registerCallback(mCallbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                //Sign in completed
                Log.i("TAG", "onSuccess: logged in successfully");
                handleFacebookAccessToken(loginResult.getAccessToken());

                //Getting the user information
                GraphRequest request = GraphRequest.newMeRequest(loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject object, GraphResponse response) {
                        // Application code
                        Log.i("TAG", "onCompleted: response: " + response.toString());
                        try {
                            String email = object.getString("email");
                            String birthday = object.getString("birthday");

                            Log.i("TAG", "onCompleted: Email: " + email);
                            Log.i("TAG", "onCompleted: Birthday: " + birthday);

                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.i("TAG", "onCompleted: JSON exception");
                        }
                    }
                });

                Bundle parameters = new Bundle();
                parameters.putString("fields", "id,name,email,gender,birthday");
                request.setParameters(parameters);
                request.executeAsync();

            }

            @Override
            public void onCancel() {
                Log.d("TAG", "facebook:onCancel");
            }

            @Override
            public void onError(FacebookException error) {
                Log.d("TAG", "facebook:onError", error);
            }
        });


//        CallSignUp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Login.this, Signup.class);
//                startActivity(intent);
//
//
////                Pair[] pairs = new Pair[7];
////                pairs[0] = new Pair<View, String>(image, "logo_img");
////                pairs[1]=new Pair<View,String>(logoText, "logo_text");
////                pairs[2]=new Pair<View,String>(sloganText, "heading_trans");
////                pairs[3]=new Pair<View,String>(username, "username_trans");
////                pairs[4]=new Pair<View,String>(password, "pass_trans");
////                pairs[5]=new Pair<View,String>(login_btn, "go_trans");
////                pairs[6]=new Pair<View,String>(CallSignUp, "sign_up_trans");
////
////                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
////                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this, pairs);
////                    startActivity(intent, options.toBundle());
////                }
//            }
//        });

//        login_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                loginUser(v);
//            }
//        });

    }

    private void gSignIn() {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();


        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuthWithGoogle(account);
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately
//                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();

            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount acct) {
        AuthCredential credential = GoogleAuthProvider.getCredential(acct.getIdToken(), null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information

                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent intent = new Intent(Login.this,UserProfile.class);
                            startActivity(intent);

                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(Login.this, "Auth Failed", Toast.LENGTH_SHORT).show();

                        }
                    }
                });
    }

//    private Boolean validatePassword() {
//        String val = password.getEditText().getText().toString(); //imp*******
//        if(val.isEmpty()) {
//            password.setError("Field cannot be empty");
//            return false;
//        }
//        else {
//            password.setError(null);
//            password.setErrorEnabled(false);
//            return true;
//        }
//    }
//
//    private Boolean validateUsername() {
//        String val = username.getEditText().getText().toString(); //imp*******
//
//        if(val.isEmpty()) {
//            username.setError("Field cannot be empty");
//            return false;
//        }
//        else{
//            username.setError(null);
//            username.setErrorEnabled(false);
//            return true;
//        }
//    }
//
//    public void loginUser(View view) {
//        //Validate Login Info
//        if( !validatePassword() | !validateUsername())
//            return;
//        else{
//            isUser();
//        }
//    }
//
//    private void isUser() {
//        final String userEnteredUsername = username.getEditText().getText().toString();
//        final String userEnteredPassword = password.getEditText().getText().toString();
//
////        Toast.makeText(this, userEnteredUsername, Toast.LENGTH_SHORT).show();
////        Toast.makeText(this, userEnteredPassword, Toast.LENGTH_SHORT).show();
//        DatabaseReference reference= FirebaseDatabase.getInstance().getReference("users");
//
//        Query checkUser = reference.orderByChild("username").equalTo(userEnteredUsername);
//
//        checkUser.addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot snapshot) {
//
//                if ( snapshot.exists()){
//
//                    user = userEnteredUsername;
//                    username.setError(null);
//                    username.setErrorEnabled(false);
//
//                    String passwordformDB = snapshot.child(userEnteredUsername).child("password").getValue(String.class);
////                    String s = passwordformDB;
////                    Toast.makeText(Login.this,s, Toast.LENGTH_SHORT).show();
////                    assert passwordformDB != null;
//                    if(passwordformDB.equals(userEnteredPassword)){
//
//                        username.setError(null);
//                        username.setErrorEnabled(false);
//
//                        String nameformDB = snapshot.child(userEnteredUsername).child("name").getValue(String.class);
//                        String usernameformDB = snapshot.child(userEnteredUsername).child("username").getValue(String.class);
//                        String phoneNoformDB = snapshot.child(userEnteredUsername).child("phoneNo").getValue(String.class);
//                        String emailformDB = snapshot.child(userEnteredUsername).child("email").getValue(String.class);
//                        String cs = snapshot.child(userEnteredUsername).child("cScore").getValue(String.class);
//                        String qt = snapshot.child(userEnteredUsername).child("quiz_taken").getValue(String.class);
//
//                        Intent intent = new Intent(getApplicationContext(), UserProfile.class);
//
//                        intent.putExtra("name",nameformDB);
//                        intent.putExtra("username",usernameformDB);
//                        intent.putExtra("email",emailformDB);
//                        intent.putExtra("phoneNo",phoneNoformDB);
//                        intent.putExtra("password",passwordformDB);
//                        intent.putExtra("cScore", cs);
//                        intent.putExtra("quiz_taken", qt);
//
//                        //intent.putExtra("",);
//
//                        startActivity(intent);
//                    }
//                    else{
//                        password.setError("Wrong Password");
//                        password.requestFocus();
//                    }
//
//                }
//                else{
//                    username.setError("No User found");
//                    username.requestFocus();
//                }
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });
//
//    }
    public void onBackPressed() {
        finish();
        super.onBackPressed();
    }
}