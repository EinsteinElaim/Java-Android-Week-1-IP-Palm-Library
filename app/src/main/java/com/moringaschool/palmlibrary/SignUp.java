package com.moringaschool.palmlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
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

public class SignUp extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.email) EditText email;
    @BindView(R.id.name) EditText name;
    @BindView(R.id.password) EditText password;
    @BindView(R.id.termsandconditionschkbox) CheckBox checkBox;
    @BindView(R.id.signup) ImageButton signUp;
    @BindView(R.id.signin) Button signIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
    }


    @Override
    public void onClick(View v) {
        if (v == signUp) {
            Intent i = new Intent(SignUp.this, MainActivity.class);
            startActivity(i);
            Toast.makeText(SignUp.this,"Sign Up Button Clicked",Toast.LENGTH_LONG).show();
        }
        if (v == signIn) {
            Intent i = new Intent(SignUp.this, SplashScreen.class);
            startActivity(i);
            Toast.makeText(SignUp.this, "Sign In Button Clicked", Toast.LENGTH_LONG).show();
        }
    }


}