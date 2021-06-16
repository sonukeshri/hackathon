package com.poc.entity;


public class User {

    public String value;

    /*1656: Variables should not be self-assigned*/
    public void setName(String value) {
        this.value = value;
    }

    String greet(String name) {
        String s = name.toLowerCase();
        return s;
    }

    /*4973: Strings and Boxed types should be compared using "equals()"*/
    boolean compareObjects() {
        String firstName = "hackathon"; // String overrides equals
        String lastName = getLastName();

        if (firstName.equals(lastName)) {
            return true;
        }// Non-compliant;
        return false;
    }

    public String getLastName() {
        return "hackathon";
    }

    /*2142: "InterruptedException" should not be ignored*/
    public void run () {
        int a = 5;
        try {
            if (a == 5) {
                throw new InterruptedException("example");
            }
        }catch (InterruptedException e) { // Noncompliant; logging is not enough
            System.out.println("Exception occurred");
			java.lang.Thread.currentThread().interrupt();
        }
    }

    /*3067: "getClass" should not be used for synchronization*/
    public void doSomethingSynchronized(){
        synchronized (this.getClass()) {  // Noncompliant
            System.out.println("In synchronized block");
        }
    }





}
