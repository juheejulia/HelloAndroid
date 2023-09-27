package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //run 'my_profile.xml'
    TextView textView;
    Button helloButton;
    // Button helloButton = findViewById(R.id.btn_hello); instead helloButton = findViewById(R.id.btn_hello); under onCreate()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);
        //setContentView(android.layout.activity_main);

    //run 'activity_main.xml'
    /*
    TextView textView;
    Button helloButton;
    // Button helloButton = findViewById(R.id.btn_hello); instead helloButton = findViewById(R.id.btn_hello); under onCreate()
    EditText inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(android.layout.activity_main);

        textView = findViewById(R.id.tv_greeting);
        inputText = findViewById(R.id.message);
        textView.setText(R.string.hello_text);

        helloButton = findViewById(R.id.btn_hello);
        helloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View button){
            Toast.makeText(MainActivity.this,R.string.toast_text,Toast.LENGTH_LONG).show();
            getTextMessage();
            }
        });
    }
    public void getTextMessage() {
        String message = inputText.getText().toString();
        textView.setText(message);
    }
    */

    }
}