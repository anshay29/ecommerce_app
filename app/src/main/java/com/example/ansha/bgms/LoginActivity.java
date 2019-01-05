package com.example.ansha.bgms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText _email, _password;
    Button _login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        _email = findViewById(R.id.email);
        _password = findViewById(R.id.password);
        _login = findViewById(R.id.login);

        _login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = _email.getText().toString().replaceAll("\\s", "").toLowerCase();
                String password = _password.getText().toString();
            }
        });
    }
}
