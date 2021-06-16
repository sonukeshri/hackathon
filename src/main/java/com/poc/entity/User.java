package com.poc.entity;

import java.math.BigDecimal;

public class User {

    // 1444 "public static" fields should be constantpublic static final int x = 5;
    public String value;

    //1656: Variables should not be self-assigned
    public void setName(String value) {
        this.value = value;
    }

    String greet(String name) {

        //21116 Arrays
        int [] x = new int[6];


        //21111 Big Decimal
        double d = 1.1;

        //1854 Unused assignments should be removed

        int b;

        int i;


        String capitalizedName = name.toUpperCase();
        return "Hello Mr./Ms "+capitalizedName;
    }

    int compute() {
        return 7;
    }

  // 2225: "toString()" and "clone()" methods should not return null
  public String toString() {
        return null;
  }
}
