package com.poc.entity;

public class User {

    String greet(String name) {
        String val = "hello";
        String argStr = val.toString(); // Noncompliant
        int argHash = val.hashCode(); // Noncompliant
        String capitalizedName = name.toUpperCase();
        return "Hello Mr./Ms "+capitalizedName;
    }
}
