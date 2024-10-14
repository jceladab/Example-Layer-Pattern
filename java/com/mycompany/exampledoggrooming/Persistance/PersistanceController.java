package com.mycompany.exampledoggrooming.Persistance;

import com.mycompany.exampledoggrooming.Logic.Owner;
import com.mycompany.exampledoggrooming.Logic.Pet;


public class PersistanceController {
    
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        
        //creamos el dueño en la bd
        ownerJpa.create(owner);
        //creamos la mascota en la bd
        petJpa.create(pet);
        
    }
    
}
