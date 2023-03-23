package com.javaapirepository.rest.jaxrsrest.resource;

import com.javaapirepository.rest.jaxrsrest.model.Pet;
import com.javaapirepository.rest.jaxrsrest.service.PetService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import java.util.List;

@Path("/pets")
@ApplicationScoped
public class PetResource {
    private PetService petService;

    public PetResource() {
    }

    @Inject
    public PetResource(PetService petService) {
        this.petService = petService;
    }

    @GET
    @Produces("text/plain")
    @Path("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GET
    @Produces("application/json")
    @Path("/{id}")
    public Pet getPetById(@PathParam("id") int id) {
        return petService.getPetById(id);
    }

    @GET
    @Produces("application/json")
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Pet addPet(final Pet pet) {
        return petService.addPet(pet);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public Pet updatePet(final Pet pet) {
        return petService.updatePet(pet);
    }

    @DELETE
    @Path("/{id}")
    public void deletePet(@PathParam("id") int id) {
        petService.deletePet(id);
    }

}