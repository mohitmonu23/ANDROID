package com.example.mohit.myapplication3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendmessage(View view)
    {
        Intent intent=new Intent(Intent.ACTION_SEND);
        //Intent intent=new Intent(this,Main2Activity.class);
        EditText message=(EditText) findViewById(R.id.message);
        String messagetext=message.getText().toString();
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,messagetext);
        //intent.putExtra(Intent.EXTRA_MESSAGE,messagetext);
        //startActivity(intent);
        String choosertitle=getString(R.string.chooser);
        Intent intent1=Intent.createChooser(intent,choosertitle);
        startActivity(intent1);
    }

}
