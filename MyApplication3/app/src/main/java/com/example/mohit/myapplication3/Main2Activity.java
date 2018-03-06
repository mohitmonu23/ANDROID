package com.example.mohit.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;


public class Main2Activity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String var = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageview = (TextView) findViewById(R.id.message);
        messageview.setText(var);
    }
}
