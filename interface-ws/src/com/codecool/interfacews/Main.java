package com.codecool.interfacews;

public class Main {
    public static void main(String[] args) {
        Bird stork = new Bird("Csőri", false);
        Bird crow = new Bird("Gusztáv", false);
        LadyBird piros = new LadyBird("Babóca", true);
        LadyBird sárga = new LadyBird("Kata", true);
        stork.fly();
        crow.fly();
        piros.fly();
        sárga.fly();
        stork.feed();
        crow.feed();
        piros.feed();
        sárga.feed();
    }
}


/*
List<Flying> animals = new ArrayList();
animals.add(new LadyBird("Babóca", true));
+
+
+
for (Flying animal : animals) {
    animal.fly();
}
 */