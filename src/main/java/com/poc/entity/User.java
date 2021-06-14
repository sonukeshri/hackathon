package com.poc.entity;

public class User {

    String greet(String name) {

        int [] x = new int[6];
        String argStr = x.toString(); // Noncompliant
        int argHash = x.hashCode(); // Noncompliant
        String capitalizedName = name.toUpperCase();
        return "Hello Mr./Ms "+capitalizedName;
    }
}
