package com.example.mohit.coffee_shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SnacksActivity extends AppCompatActivity {
    public final static String EXTRA_SNO="snacksno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snacks);
        int snacksno=(Integer)getIntent().getExtras().get(EXTRA_SNO);
        Snacks foods=Snacks.snack[snacksno];

        ImageView imageView=(ImageView)findViewById(R.id.photo);
        imageView.setImageResource(foods.getimagereourceid());
        imageView.setContentDescription(foods.getDescription());

        TextView textView=(TextView)findViewById(R.id.name);
        textView.setText(foods.getName());

        TextView textView1=(TextView)findViewById(R.id.description);
        textView1.setText(foods.getDescription());

    }
}
