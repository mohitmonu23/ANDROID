package com.example.mohit.coffee_shop;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkAcitivity extends Activity{
public  final static String EXTRA_NO="drinkno";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_acitivity);
       //getting drinkno
        int drinkno=(Integer)getIntent().getExtras().get(EXTRA_NO);
        Drink drink=Drink.drink[drinkno];
       //set image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageresourceid());
        photo.setContentDescription(drink.getName());
       //set name on activity
        TextView textView=(TextView)findViewById(R.id.name);
        textView.setText(drink.getName());
       //set description on activity
        TextView textView1=(TextView)findViewById(R.id.description);
        textView1.setText(drink.getDescription());

    }
}


