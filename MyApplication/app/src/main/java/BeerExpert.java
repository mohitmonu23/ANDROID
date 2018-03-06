package com.example.mohit.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohit on 1/14/18.
 */

public class BeerExpert {
    List<String> getBrands(String color)
    {
        List<String> ee=new ArrayList<>();
        if(color.equals("light")){
            ee.add("mohit");
            ee.add("fdd");
        }
        else
        {
            ee.add("nffd");
            ee.add("kdjsk");
        }
        return ee;
    }

}
