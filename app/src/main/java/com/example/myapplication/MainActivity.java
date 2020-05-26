package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Button loginButton;
    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginBtn);

            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    loginButton.setEnabled(false);                                                  // one click button, disables button after one click
                    Intent intent = new Intent(MainActivity.this, HamActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);// removes this activity from history
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Registered Data",Toast.LENGTH_SHORT).show();
                    Handler trueButton= new Handler();                                              // one click button, enables button after 2sec
                        trueButton.postDelayed(new Runnable() {
                                                   @Override
                                                   public void run() {
                                                       loginButton.setEnabled(true);
                                                   }
                                               },2000L);

                }
            });
        signUpButton = findViewById(R.id.signUp);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpButton.setEnabled(false);
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),"Registered Data",Toast.LENGTH_SHORT).show();
                Handler trueButton= new Handler();
                trueButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        signUpButton.setEnabled(true);
                    }
                },2000L);
            }
        });
            }
}
