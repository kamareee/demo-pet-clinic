package com.kamareee.demopetclinic.services;

import com.kamareee.demopetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
    
}
