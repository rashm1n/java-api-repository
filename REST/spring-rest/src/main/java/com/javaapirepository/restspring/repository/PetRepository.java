package com.javaapirepository.restspring.repository;

import com.javaapirepository.restspring.model.Pet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PetRepository {
    private final List<Pet> petList = new ArrayList<>();

    public Pet addPet(Pet pet) {
        petList.add(pet);
        return pet;
    }

    public void deletePet(int id) {
        Pet oldPet = petList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
        petList.remove(oldPet);
    }

    public Pet updatePet(Pet pet) {
        Pet oldPet = petList.stream().filter(p -> p.getId() == pet.getId()).findFirst().orElse(null);
        if (oldPet != null) {
            int index = petList.indexOf(oldPet);
            petList.set(index, pet);
            return pet;
        }
        return null;
    }

    public Pet getPetById(int id) {
        return petList.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public List<Pet> getAllPets() {
        return petList;
    }
}
