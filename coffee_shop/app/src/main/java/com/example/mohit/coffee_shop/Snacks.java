package com.example.mohit.coffee_shop;

/**
 * Created by mohit on 2/27/18.
 */

public class Snacks {
    private String name;
    private String description;
    private int imagereourceid;

    public static final Snacks[] snack={new Snacks("samosa","this is made by potato",R.drawable.samosa),new Snacks("roll","veg roll dude",R.drawable.roll),new Snacks("cookies","tasty and yumy",R.drawable.cookies)};

    public  Snacks(String name,String description,int imagereourceid)
    {
        this.name=name;
        this.description=description;
        this.imagereourceid=imagereourceid;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getimagereourceid(){
        return imagereourceid;
    }
    public String toString(){
        return this.name;
    }

}
