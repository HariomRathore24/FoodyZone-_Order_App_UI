package com.example.myapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class RegistrationPage extends AppCompatActivity {
 Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        final TextView tvt = (TextView) findViewById(R.id.signin);

        tvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegistrationPage.this, LoginActivity.class));
            }
        });
        button = (Button) findViewById(R.id.btnregister);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                startActivity(new Intent(RegistrationPage.this, MainActivity.class));

            }
        });

    }

}