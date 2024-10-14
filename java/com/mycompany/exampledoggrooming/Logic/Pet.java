package com.mycompany.exampledoggrooming.Logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) 
    private int numOwner;
    private String name;
    private String race;
    private String color;
    private String allergic;
    private String specialAtention;
    private String observations;
    
    @OneToOne
    private Owner newOwner;

    public Pet() {
    }

    public Pet(int numOwner, String name, String race, String color, String allergic, String specialAtention, String observations, Owner newOwner) {
        this.numOwner = numOwner;
        this.name = name;
        this.race = race;
        this.color = color;
        this.allergic = allergic;
        this.specialAtention = specialAtention;
        this.observations = observations;
        this.newOwner = newOwner;
    }

    public int getNumOwner() {
        return numOwner;
    }

    public void setNumOwner(int numOwner) {
        this.numOwner = numOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAllergic() {
        return allergic;
    }

    public void setAllergic(String allergic) {
        this.allergic = allergic;
    }

    public String getSpecialAtention() {
        return specialAtention;
    }

    public void setSpecialAtention(String specialAtention) {
        this.specialAtention = specialAtention;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public Owner getNewOwner() {
        return newOwner;
    }

    public void setNewOwner(Owner newOwner) {
        this.newOwner = newOwner;
    }
    
    
    
}
