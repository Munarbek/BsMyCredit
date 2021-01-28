package com.bssoft.bsmycredit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SingUpActivity extends AppCompatActivity {
    private EditText editTextName,editTextPassword,editTextPhoneNumber;
    private Button singUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

    }
}