package com.example.validateusercredentialsandperformlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
private TextView sow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sow=findViewById(R.id.show);
        sow.setText(getIntent().getStringExtra("email"));
    }
}