package com.robvega.zoo;

public class Mammal {
    protected int energyLevel = 100;

    public int displayEnergy() {
        System.out.println("current energy: " + this.energyLevel);
        return this.energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
}
