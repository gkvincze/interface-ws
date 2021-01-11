package com.codecool.interfacews;

public class Bird implements Flying, Feeding, Speaking{
    private String name;
    private boolean isFemale;

    public Bird(String name, boolean isFemale) {
        this.isFemale = isFemale;
        this.name = name;

    }

    @Override
    public void fly() {
        System.out.println("Csájp, Csájp");

    }


    @Override
    public void feed() {
        speak("What a wonderful worm");
    }


}
