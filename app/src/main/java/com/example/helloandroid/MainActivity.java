package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView profilePicture;
    TextView myFullName;
    TextView jobRole;
    Button cvButton;
    Button portfolio;
    TextView presentation;
    ImageButton linkedinButton;
    ImageButton emailButton;
    ImageButton mobileButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile);

        profilePicture = findViewById(R.id.profile_picture);
        myFullName = findViewById(R.id.full_name);
        jobRole = findViewById(R.id.job_role);
        portfolio = findViewById(R.id.btn_portfolio);
        presentation = findViewById(R.id.presentation);
        linkedinButton = findViewById(R.id.btn_linkedin);
        emailButton = findViewById(R.id.btn_email);
        mobileButton = findViewById(R.id.btn_mobile);

        cvButton = findViewById(R.id.btn_cv);
        cvButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                simulateButtonClick();
            }
            public void simulateButtonClick() {
                cvButton.performClick();
            }
            public void getTextMessage() {
            }
        });
    }
}