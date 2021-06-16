package com.poc.entity;

import java.math.BigDecimal;

public class User {


    public static int x = 5;
    public String value;


    public void setName(String value) {
        value = value;
    }

    String greet(String name) {


        int [] x = new int[6];
        String argStr = java.util.Arrays.toString(x); // Noncompliant
        int argHash = java.util.Arrays.hashCode(x); // Noncompliant



        double d = 1.1;

        BigDecimal bd1 = BigDecimal.valueOf(d); // Noncompliant; see comment above
        BigDecimal bd2 = BigDecimal.valueOf(1.1); // Noncompliant; same result



        int b;

        int i;

        i = 9 + 7; // Noncompliant; calculation result not used before value is overwritten
        i = compute();


        float twoThirds = 2/3; // Noncompliant; int division. Yields 0.0
        long millisInYear = 1_000*3_600*24*365; // Noncompliant; int multiplication. Yields 1471228928



        String capitalizedName = name.toUpperCase();
        return "Hello Mr./Ms "+capitalizedName;
    }

    int compute() {
        return 7;
    }


}
