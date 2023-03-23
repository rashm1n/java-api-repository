package com.javaapirepository.rest.jaxrsrest.service;

import com.javaapirepository.rest.jaxrsrest.model.Pet;
import com.javaapirepository.rest.jaxrsrest.repository.PetRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class PetService {
    private PetRepository petRepository;

    @Inject
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public PetService() {
    }

    public Pet getPetById(int id) {
        return petRepository.getPetById(id);
    }

    public Pet addPet(Pet pet) {
        return petRepository.addPet(pet);
    }

    public void deletePet(int id) {
        petRepository.deletePet(id);
    }

    public Pet updatePet(Pet pet) {
        return petRepository.updatePet(pet);
    }

    public List<Pet> getAllPets() {
        return petRepository.getAllPets();
    }
}
