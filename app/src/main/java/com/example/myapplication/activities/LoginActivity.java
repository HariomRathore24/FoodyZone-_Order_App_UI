package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final TextView tvt = (TextView) findViewById(R.id.signup);

        tvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegistrationPage.class));
            }
        });
    }

    public void mainActivity(View view) {
        startActivity(new Intent(LoginActivity.this , MainActivity.class));
    }
}