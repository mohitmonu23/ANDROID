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

public class FoodCateory extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        ListView listView=getListView();
        ArrayAdapter<Food> listadapter=new ArrayAdapter<Food>(this,android.R.layout.simple_list_item_1,Food.food);
        listView.setAdapter(listadapter);
}
@Override
public void onListItemClick(ListView listView, View itemview,int position,long id){
        Intent intent1=new Intent(FoodCateory.this,FoodActivity.class);
        intent1.putExtra(FoodActivity.EXTRA_FNO,(int)id);
        startActivity(intent1);
}
}


