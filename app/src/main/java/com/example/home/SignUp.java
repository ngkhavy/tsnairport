package com.example.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {
    Button btnSignUp,btnBackToSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUp=findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity_1();
            }
        });



        btnBackToSignIn=findViewById(R.id.btnBacktoLogin);
        btnBackToSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToSignIn();
            }
        });
    }

    public void openMainActivity_1(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private void backToSignIn() {
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
    }
}