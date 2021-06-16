package com.poc.entity;

import java.math.BigDecimal;

public class User {


    public static final int x = 5;
    public String value;

    /*1656: Variables should not be self-assigned*/
    public void setName(String value) {
        this.value = value;
    }

    String greet(String name) {


        int [] x = new int[6];
        String argStr = java.util.Arrays.toString(x); // Noncompliant
        int argHash = java.util.Arrays.hashCode(x); // Noncompliant

        System.out.println("Args Str "+argStr+" and ArgHash "+argHash);

        double d = 1.1;

        BigDecimal bd1 = BigDecimal.valueOf(d); // Noncompliant; see comment above
        BigDecimal bd2 = BigDecimal.valueOf(1.1); // Noncompliant; same result

        System.out.println("Big Decimal values are "+bd1+" and "+bd2);

        int b;
        int i;
        i = compute();

        b = i +8;

        System.out.println("Value of b is "+b);


        float twoThirds = 2/3; // Noncompliant; int division. Yields 0.0
        long millisInYear = 1_000*3_600*24*365; // Noncompliant; int multiplication. Yields 1471228928

        System.out.println("Two-Thirds is "+twoThirds);
        System.out.println("MillisInYear "+millisInYear);


        String capitalizedName = name.toUpperCase();
        return "Hello Mr./Ms "+capitalizedName;
    }

    int compute() {
        return 7;
    }


}
