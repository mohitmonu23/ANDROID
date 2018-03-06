package com.example.mohit.coffee_shop;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mohit on 2/25/18.
 */

public class DrinkCategory extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ListView listdrinks=getListView();
        ArrayAdapter<Drink> listadapter=new ArrayAdapter<Drink>(this,android.R.layout.simple_list_item_1,Drink.drink);
        listdrinks.setAdapter(listadapter);


    }
@Override
    public void onListItemClick(ListView listView, View itemview, int position, long id) {
    Intent intent=new Intent(DrinkCategory.this,DrinkAcitivity.class);
    intent.putExtra(DrinkAcitivity.EXTRA_NO,(int)id);
    startActivity(intent);
    }

}

