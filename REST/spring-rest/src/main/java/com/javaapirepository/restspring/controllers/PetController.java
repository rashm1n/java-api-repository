package com.javaapirepository.restspring.controllers;

import com.javaapirepository.restspring.model.Pet;
import com.javaapirepository.restspring.services.PetService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PetController {
    private final PetService petService;

    @GetMapping(path = "/pets/{id}")
    public ResponseEntity<Pet> getPetById(@PathVariable int id) {
        return ResponseEntity.ok(petService.getPetById(id));
    }

    @PostMapping(path = "/pets")
    public ResponseEntity<Pet> addPet(@RequestBody Pet pet) {
        return ResponseEntity.ok(petService.addPet(pet));
    }

    @PutMapping(path = "/pets")
    public ResponseEntity<Pet> updatePet(@RequestBody Pet pet) {
        return ResponseEntity.ok(petService.updatePet(pet));
    }

    @DeleteMapping(path = "/pets/{id}")
    public ResponseEntity deletePet(@PathVariable int id) {
        petService.deletePet(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(path = "/pets")
    public ResponseEntity<List<Pet>> getAllPets() {
        return ResponseEntity.ok(petService.getAllPets());
    }
}
