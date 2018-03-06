package com.example.mohit.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner s=(Spinner)findViewById(R.id.spinnerlist);
        String si=String.valueOf(s.getSelectedItem());
    }

    public void ontogglebuttonclicked(View view) {
        TextView t = (TextView) findViewById(R.id.mohit);
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {

            t.setText("on");
        } else {
            t.setText("off");
        }

    }

    public void onclickradio(View view) {
        TextView t = (TextView) findViewById(R.id.mohit);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);
        int idd = radioGroup.getCheckedRadioButtonId();
        RadioButton r = (RadioButton) findViewById(idd);
        switch (idd)
        {
            case R.id.off :
                t.setText("off");
                break;
            case  R.id.on :
                t.setText("on");
        }

    }
}
