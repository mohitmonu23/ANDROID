package com.example.mohit.coffee_shop;

/**
 * Created by mohit on 2/27/18.
 */

public class Food {
    private String name;
    private String description;
    private int imageresourceid;

    public static final Food[] food={new Food("panner butter masala","tasty and yummy dish",R.drawable.panner), new Food("Noodles","long dude",R.drawable.noodles),new Food("pizza","cheese and masala",R.drawable.piz)};

    private Food(String name, String description ,int imageresourceid ) {
        this.name=name;
        this.description=description;
        this.imageresourceid=imageresourceid;

    }
    public String getName()
    {
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getImageresourceid(){
        return imageresourceid;
    }

    public String toString(){
        return this.name;
    }
    
}
