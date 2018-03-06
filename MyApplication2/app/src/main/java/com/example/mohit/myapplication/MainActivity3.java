package com.example.mohit.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private int second=0;
    private boolean running;
    private boolean wasrunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        if(savedInstanceState!=null)
        {
            second=savedInstanceState.getInt("second");
            running=savedInstanceState.getBoolean("running");
            wasrunning=savedInstanceState.getBoolean("wasrunning");
        }
        runtimer();
    }
    @Override
    public void onsaveInstanceState(Bundle savedInstanceState)
    {
        savedInstanceState.putBoolean("running",running);
        savedInstanceState.putInt("second",second);
        savedInstanceState.putBoolean("wasrunning",wasrunning);

    }
    @Override
    protected void onStop()
    {
        super.onStop();
        wasrunning=running;
        running=false;
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        if(wasrunning)
        {
            running=true;
        }
    }
    @Override
    protected  void onPause()
    {
        super.onPause();
        wasrunning=running;
        running=false;
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        if(wasrunning) {
            running = true;
        }
    }


    public void onclickstart(View view)
    {
    running=true;
    }
    public void onclickstop(View view)
    {
        running=false;
    }
    public void onclickreset(View view)
    {
        running=false;

        second=0;
    }

    private void runtimer() {
        final TextView timeview = (TextView) findViewById(R.id.textView);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = second / 3600;
                int minutes = (second % 3600) / 60;
                int secs = second % 60;
                String time = String.format("%d:%02d:%02d", hours, minutes, secs);
                timeview.setText(time);
                if (running) {
                    second++;
                }
                handler.postDelayed(this, 1000);

            }
        });


    }
}
