package com.example.mohit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert=new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void onclickfindbeer(View view)
{
    TextView brands=(TextView) findViewById(R.id.brands);
    Spinner beer_color=(Spinner) findViewById(R.id.color);
    String col=String.valueOf(beer_color.getSelectedItem());
    brands.setText(col);
    List<String> brandlist=expert.getBrands(col);
    StringBuilder brandformatted=new StringBuilder();
    for(String brand : brandlist )
    {
        brandformatted.append(brand).append('\n');
    }
    brands.setText(brandformatted);
}
}

