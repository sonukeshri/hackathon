package com.poc.entity;

public class User {

    String greet(String name) {

        int [] x = new int[6];
        String argStr = java.util.Arrays.toString(x); // Noncompliant
        int argHash = java.util.Arrays.hashCode(x); // Noncompliant
        String capitalizedName = name.toUpperCase();
        return "Hello Mr./Ms "+capitalizedName;
    }
}
