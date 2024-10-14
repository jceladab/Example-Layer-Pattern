package com.mycompany.exampledoggrooming.Logic;

import com.mycompany.exampledoggrooming.Persistance.PersistanceController;

public class Controller {
    
    PersistanceController persisCtrl = new PersistanceController();

    public void save(String namePet, String contactPet, String colorPet, 
            String racePet, String ownerPet, String observationsPet, 
            String allergicPet, String specAtnPet) {
        
        //se crea el dueño y se le asignan sus valores desde la UI
        Owner owner = new Owner();
        owner.setName(ownerPet);
        owner.setPhoneOwner(contactPet);
        
        //se crea la mascota y se le asignan sus valores desde la UI
        Pet pet = new Pet();
        pet.setName(namePet);
        pet.setRace(racePet);
        pet.setColor(colorPet);
        pet.setAllergic(allergicPet);
        pet.setSpecialAtention(specAtnPet);
        pet.setObservations(observationsPet);
        pet.setNewOwner(owner);
        
        persisCtrl.save(owner,pet);
        
    }
    
}
