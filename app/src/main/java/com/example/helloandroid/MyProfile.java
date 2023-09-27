package com.example.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyProfile extends AppCompatActivity {

    TextView textView;
    Button helloButton;
    // Button helloButton = findViewById(R.id.btn_hello); instead helloButton = findViewById(R.id.btn_hello); under onCreate()
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
        //setContentView(android.layout.activity_main);

        textView = findViewById(R.id.text);
        textView.setText(R.string.hello_text);

        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button){
                Toast.makeText(MyProfile.this,R.string.toast_text,Toast.LENGTH_LONG).show();
                getTextMessage();
            }
        });
    }
    public void getTextMessage() {
        String message = inputText.getText().toString();
        textView.setText(message);
    }
}