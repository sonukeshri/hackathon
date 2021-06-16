package com.poc.entity;

import java.math.BigDecimal;

public class User {

    // 1444 "public static" fields should be constant
    public static int x = 5;
    public String value;

    //1656: Variables should not be self-assigned
    public void setName(String value) {
        value = value;
    }

    String greet(String name) {

        //21116 Arrays
        int [] x = new int[6];
        String argStr = x.toString(); // Noncompliant
        int argHash = x.hashCode(); // Noncompliant


        //21111 Big Decimal
        double d = 1.1;

        BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant; same result

        //1854 Unused assignments should be removed

        int b;

        int i;

        i = 9 + 7; // Noncompliant; calculation result not used before value is overwritten
        i = compute();

        //2184: Math operands should be cast before
        float twoThirds = 2/3; // Noncompliant; int division. Yields 0.0
        long millisInYear = 1_000*3_600*24*365; // Noncompliant; int multiplication. Yields 1471228928
        long bigNum = Integer.MAX_VALUE + 2; // Noncompliant. Yields -2147483647
        long bigNegNum =  Integer.MIN_VALUE-1; //Noncompliant, gives a positive result instead of a negative one.


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
