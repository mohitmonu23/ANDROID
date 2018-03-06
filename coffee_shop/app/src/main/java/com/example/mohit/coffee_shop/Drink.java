package com.example.mohit.coffee_shop;

/**
 * Created by mohit on 2/25/18.
 */

public class Drink {
    private String name;
    private String description;
    private int imageresourceid;

    //drinks is an array of Drinks
    public static final Drink[] drink = {
            new Drink("Latte", "A couple of espresso shots with steamed milk",
                    R.drawable.cap),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk foam",
                    R.drawable.da),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.back)
    };

    //Each Drink has a name, description, and an image resource
    private Drink(String name, String description, int imageresourceid) {
        this.name = name;
        this.description = description;
        this.imageresourceid = imageresourceid;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageresourceid() {
        return imageresourceid;
    }

    public String toString(){
        return this.name;
    }
}
