package br.com.mx8sistemas.spring5petclinic.services;

import java.util.Set;

import br.com.mx8sistemas.spring5petclinic.model.Vet;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
