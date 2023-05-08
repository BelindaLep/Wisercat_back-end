package com.example.petsmanagement.service;

import com.example.petsmanagement.exception.PetNotFoundException;
import com.example.petsmanagement.model.Pet;
import com.example.petsmanagement.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    @Autowired
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public Pet addPet(Pet pet) {
        return petRepository.save(pet);
    }

    public List<Pet> findAllPets() {
        return petRepository.findAll();
    }

    public Pet updatePet(Pet pet) {
        return petRepository.save(pet);
    }

    public Pet findPetById(Long id) {
        return petRepository.findPetById(id).orElseThrow(() -> new PetNotFoundException("Pet by id " + id + " was not found."));
    }

    public void deletePet(Long id) {
        petRepository.deletePetById(id);
    }
}
