package com.example.admin.bpalapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.admin.bpalapplication.R;

public class CreateProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);

        btnSubmit = findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == btnSubmit){
            Intent intent = new Intent(this,LandingActivity.class);
            startActivity(intent);
        }
    }
}
