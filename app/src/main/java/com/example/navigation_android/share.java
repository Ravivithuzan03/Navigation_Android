package com.example.navigation_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.navigation_android.ui.main.ShareFragment;

public class share extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ShareFragment.newInstance())
                    .commitNow();
        }
    }
}