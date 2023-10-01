package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView presentationTextView;
    Button cvButton, portfolioButton;
    ImageButton linkedinButton, emailButton, mobileButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);

        presentationTextView = findViewById(R.id.presentation);
        presentationTextView.setMovementMethod(new ScrollingMovementMethod());

        cvButton = findViewById(R.id.btn_cv);
        cvButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                cvButton();

            }
            public void cvButton() {
                cvButton.performClick();
            }
        });

        portfolioButton = findViewById(R.id.btn_portfolio);
        portfolioButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                portfolioButton();
            }
            public void portfolioButton() {
                portfolioButton.performClick();
            }
        });

        linkedinButton = findViewById(R.id.btn_linkedin);
        linkedinButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                linkedinButton();
            }
            public void linkedinButton() {
                linkedinButton.performClick();
            }
        });

        emailButton = findViewById(R.id.btn_email);
        emailButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                emailButton();
            }
            public void emailButton() {
                emailButton.performClick();
            }
        });

        mobileButton = findViewById(R.id.btn_mobile);
        mobileButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mobileButton();
            }
            public void mobileButton() {
                mobileButton.performClick();
            }
        });
    }
}