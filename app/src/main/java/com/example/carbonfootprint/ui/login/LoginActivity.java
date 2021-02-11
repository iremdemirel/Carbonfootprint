package com.example.carbonfootprint.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.carbonfootprint.R;
import com.example.carbonfootprint.ui.register.RegisterActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView register;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        register = (TextView) findViewById(R.id.btnRegister);
        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegister:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }
}
