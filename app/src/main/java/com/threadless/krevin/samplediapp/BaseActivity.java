package com.threadless.krevin.samplediapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public SkimbotApplication getSkimbotApplication() {
        return (SkimbotApplication) getApplication();
    }
}
