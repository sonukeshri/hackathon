package com.poc.entity;

import java.math.BigDecimal;

public class User {


    public static final int x = 5;
    public String value;


    public void setName(String value) {
        this.value = value;
    }

    String greet(String name) {


        int [] x = new int[6];



        double d = 1.1;



        int b;

        int i;



        String capitalizedName = name.toUpperCase();
        return "Hello Mr./Ms "+capitalizedName;
    }

    int compute() {
        return 7;
    }


}
