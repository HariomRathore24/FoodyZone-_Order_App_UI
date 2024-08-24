package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class WelcomeActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        addListenerOnButton();

    }
    public void addListenerOnButton() {



        button = (Button) findViewById(R.id.registerbtn);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(WelcomeActivity.this, RegistrationPage.class));

            }
        });

        button = (Button) findViewById(R.id.registerbtn1);

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                startActivity(new Intent(WelcomeActivity.this, LoginActivity.class));

            }
        });

    }
}
