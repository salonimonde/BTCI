package com.example.admin.bpalapplication.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.admin.bpalapplication.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private RelativeLayout relativeLayoutLoginScreen;
    private RelativeLayout relativeLayoutCongratulationsScreen;
    private Button btnLetsCreateBpalProfile;
    private Button btnLoginWithGoogle;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mContext = this;
        relativeLayoutLoginScreen = findViewById(R.id.relative_layout_login_screen);
        relativeLayoutCongratulationsScreen = findViewById(R.id.relative_layout_congratulaions_screen);
        btnLoginWithGoogle = findViewById(R.id.btn_login_with_google);
        btnLoginWithGoogle.setOnClickListener(this);
        btnLetsCreateBpalProfile = findViewById(R.id.btn_lets_create_bpal_profile);
        btnLetsCreateBpalProfile.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view == btnLoginWithGoogle){
            relativeLayoutCongratulationsScreen.setVisibility(View.VISIBLE);
        }
        if (view == btnLetsCreateBpalProfile){
            Intent intent = new Intent(mContext,CreateProfileActivity.class);
            startActivity(intent);
        }

    }
}
