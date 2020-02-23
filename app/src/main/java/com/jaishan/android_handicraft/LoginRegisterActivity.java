package com.jaishan.android_handicraft;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.jaishan.handicraftstore.ui.LoginActivity;
import com.jaishan.handicraftstore.ui.RegisterActivity;

public class LoginRegisterActivity extends AppCompatActivity {
    private Button btnOpenRegisterFragment, btnOpenLoginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_register);

        btnOpenRegisterFragment = findViewById(R.id.btnOpenRegisterFragment);
        btnOpenLoginFragment = findViewById(R.id.btnOpenLoginFragment);

        btnOpenRegisterFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(LoginRegisterActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnOpenLoginFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(LoginRegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
