package com.developer.robortservice.entity;


import jakarta.persistence.*;

@Entity
public class Resource {

    @Id
    private int id;
    private boolean water;
    private boolean food;
    private boolean medication;
    private boolean ammunition;
    @OneToOne
    private Survivor survivor;

    public Resource(boolean water, boolean food, boolean medication, boolean ammunition, int id) {
        this.water = water;
        this.food = food;
        this.medication = medication;
        this.ammunition = ammunition;
        this.id = id;
    }

    public Resource() {

    }



    public boolean isWater() {
        return water;
    }

    public boolean isFood() {
        return food;
    }

    public boolean isMedication() {
        return medication;
    }

    public boolean isAmmunition() {
        return ammunition;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public void setFood(boolean b) {
    }

    public void setMedication(boolean b) {
   }

    public void setAmmunition(boolean b) {
   }

    public boolean hasRequiredResources() {
       return false;
    }
}
