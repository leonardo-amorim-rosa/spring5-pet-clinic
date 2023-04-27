package br.com.mx8sistemas.spring5petclinic.services;

import java.util.Set;

import br.com.mx8sistemas.spring5petclinic.model.Owner;

public interface OwnerService {
    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
