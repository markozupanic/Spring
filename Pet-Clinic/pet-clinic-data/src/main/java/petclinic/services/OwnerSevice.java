package petclinic.services;

import petclinic.model.Owner;

import java.util.Set;

public interface OwnerSevice {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
