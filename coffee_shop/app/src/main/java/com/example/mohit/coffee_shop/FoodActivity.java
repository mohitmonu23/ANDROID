package com.example.mohit.coffee_shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    public final static String EXTRA_FNO="foodNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodNo=(Integer)getIntent().getExtras().get(EXTRA_FNO);
        Food foods=Food.food[foodNo];

        ImageView imageView=(ImageView)findViewById(R.id.photo);
        imageView.setImageResource(foods.getImageresourceid());
        imageView.setContentDescription(foods.getDescription());

        TextView textView=(TextView)findViewById(R.id.name);
        textView.setText(foods.getName());

        TextView textView1=(TextView) findViewById(R.id.description);
        textView1.setText(foods.getDescription());
    }
}
