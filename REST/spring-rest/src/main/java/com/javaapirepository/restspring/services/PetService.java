package com.javaapirepository.restspring.services;

import com.javaapirepository.restspring.model.Pet;
import com.javaapirepository.restspring.repository.PetRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PetService {
    private final PetRepository petRepository;

    public List<Pet> getAllPets() {
        return petRepository.getAllPets();
    }

    public Pet getPetById(int id) {
        return petRepository.getPetById(id);
    }

    public Pet addPet(Pet pet) {
        return petRepository.addPet(pet);
    }

    public Pet updatePet(Pet pet) {
        return petRepository.updatePet(pet);
    }

    public void deletePet(int id) {
        petRepository.deletePet(id);
    }
}
