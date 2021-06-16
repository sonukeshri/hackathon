package com.poc.entity;

import java.math.BigDecimal;

public class User {


    public static int x = 5;
    public String value;

    /*1656: Variables should not be self-assigned*/
    public void setName(String value) {
        value = value;
    }

    String greet(String name) {


        int [] x = new int[6];
        String argStr = x.toString(); // Noncompliant
        int argHash = x.hashCode(); // Noncompliant

        System.out.println("Args Str "+argStr+" and ArgHash "+argHash);

        double d = 1.1;

        BigDecimal bd1 = BigDecimal.valueOf(d); // Noncompliant; see comment above
        BigDecimal bd2 = BigDecimal.valueOf(1.1); // Noncompliant; same result

        System.out.println("Big Decimal values are "+bd1+" and "+bd2);

        int b;
        int i;

        i = 9 + 7; // Noncompliant; calculation result not used before value is overwritten
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
