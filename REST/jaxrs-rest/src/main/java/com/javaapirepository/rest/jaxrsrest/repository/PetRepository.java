package com.javaapirepository.rest.jaxrsrest.repository;

import com.javaapirepository.rest.jaxrsrest.model.Pet;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PetRepository {

    private final List<Pet> petList = new ArrayList<>();

    public Pet getPetById(int id) {
        return petList.stream().filter(pet -> pet.getId() == id).findFirst().orElse(null);
    }

    public List<Pet> getAllPets() {
        return petList;
    }

    public Pet addPet(Pet pet) {
        petList.add(pet);
        return pet;
    }

    public void deletePet(int id) {
        petList.removeIf(pet -> pet.getId() == id);
    }

    public Pet updatePet(Pet pet) {
        petList.stream().filter(p -> p.getId() == pet.getId()).findFirst().ifPresent(p -> {
            p.setName(pet.getName());
            p.setAgeInMonths(pet.getAgeInMonths());
            p.setColour(pet.getColour());
            p.setType(pet.getType());
        });

        return pet;
    }

    public PetRepository() {
        petList.add(new Pet(1, "Fido", "Dog", 12, "Brown"));
        petList.add(new Pet(2, "Mittens", "Cat", 6, "White"));
        petList.add(new Pet(3, "Bubbles", "Fish", 1, "Blue"));
    }

}
