package petclinic.services;

import petclinic.model.Owner;


public interface OwnerSevice extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);


}
