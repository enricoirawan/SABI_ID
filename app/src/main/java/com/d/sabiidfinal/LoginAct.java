package com.d.sabiidfinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginAct extends AppCompatActivity {

    TextView tvRegister;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvRegister = findViewById(R.id.tvRegister);
        buttonLogin = findViewById(R.id.buttonLogin);

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toRegisterAct = new Intent(LoginAct.this, RegisterAct.class);
                startActivity(toRegisterAct);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toHomeAct = new Intent(LoginAct.this, MainActivity.class);
                startActivity(toHomeAct);
            }
        });
    }
}
