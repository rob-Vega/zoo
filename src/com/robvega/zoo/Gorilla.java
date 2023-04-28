package com.robvega.zoo;

public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("gorilla has throw something");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("gorilla is eating a banana :D");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("gorilla is climbing a tree");
        energyLevel -= 10;
    }
}
