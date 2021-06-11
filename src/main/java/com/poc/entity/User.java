package com.poc.entity;

public class User {

    String greet(String name) {
        String capitalizedName = name.toUpperCase();
        return "Hello Mr./Ms "+capitalizedName;
    }
}
