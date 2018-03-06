package com.example.mohit.coffee_shop;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mohit on 2/27/18.
 */

public class SnacksCateory extends ListActivity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView=getListView();
        ArrayAdapter<Snacks> arrayAdapter=new ArrayAdapter<Snacks>(this,android.R.layout.simple_list_item_1,Snacks.snack);
        listView.setAdapter(arrayAdapter);
    }
@Override
public void onListItemClick(ListView listView, View itemview,int position,long id){
    Intent intent1=new Intent(SnacksCateory.this,SnacksActivity.class);
    intent1.putExtra(SnacksActivity.EXTRA_SNO,(int)id);
    startActivity(intent1);
}
}
