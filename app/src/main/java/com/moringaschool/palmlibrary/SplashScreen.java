package com.moringaschool.palmlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashScreen extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.email) EditText email;
    @BindView(R.id.password) EditText password;
    @BindView(R.id.checkbox) CheckBox checkBox;
    @BindView(R.id.signin) ImageButton signIn;
    @BindView(R.id.signup) Button signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        ButterKnife.bind(this);

        signIn.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == signIn){
            Intent i = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(i);
            Toast.makeText(SplashScreen.this,"Sign In Button Clicked",Toast.LENGTH_LONG).show();
        }
        if (v == signUp){
            Intent i = new Intent(SplashScreen.this, SignUp.class);
            startActivity(i);
            Toast.makeText(SplashScreen.this,"Sign Up Button Clicked",Toast.LENGTH_LONG).show();
        }
    }


}