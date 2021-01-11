package com.codecool.interfacews;

public class LadyBird implements Flying, Feeding, Speaking{
    private String name;
    private boolean isFemale;


    public LadyBird(String name, boolean isFemale) {
        this.isFemale = isFemale;
        this.name = name;

    }

    @Override
    public void fly() {
        System.out.println("Buzz, Buzz");

    }

    @Override
    public void feed() {
        speak("I love aphid");
    }


}
