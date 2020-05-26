
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.signUpBtn);
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    loginButton.setEnabled(false);
                    Intent intent =  new Intent(LoginActivity.this, HamActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Account Created",Toast.LENGTH_SHORT).show();
                    Handler trueButton= new Handler();
                    trueButton.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            loginButton.setEnabled(true);
                        }
                    },2000L);
            }
        });
    }
}
