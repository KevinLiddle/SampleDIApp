package com.threadless.krevin.samplediapp;

import android.os.Bundle;
import android.widget.TextView;

import com.threadless.krevin.conversations.Greeting;

import javax.inject.Inject;

public class GreetingActivity extends BaseActivity {

    @Inject
    Greeting mGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView view = (TextView) findViewById(R.id.greeting_text);
        String greeting = mGreeting.formulate();
        view.setText(greeting);
    }
}
