package com.example.validateusercredentialsandperformlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
private EditText mailid;
private EditText passid;
private Button logid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mailid=findViewById(R.id.mail);
        passid=findViewById(R.id.pass);
        logid=findViewById(R.id.login);
        logid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mailid.getText().toString();
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("email",email);
                startActivity(intent);

            }
        });
    }
}