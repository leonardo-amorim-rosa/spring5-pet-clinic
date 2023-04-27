package br.com.mx8sistemas.spring5petclinic.services;

import java.util.Set;

import br.com.mx8sistemas.spring5petclinic.model.Pet;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
