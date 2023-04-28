package com.robvega.zoo;

public class Bat extends Mammal {
    public Bat() {
        setEnergyLevel(300);
    }
    public void fly() {
        System.out.println("Bat is flying :O");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("Bat is easting a human D:!!");
        System.out.println("Well whatever");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("Bat is attacking a town T.T");
        energyLevel -= 100;
    }
}
