package com.hulkstore.kardex.repositories;



import com.hulkstore.kardex.models.proveedorModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface proveedorRepository extends CrudRepository<proveedorModel, Long> {
 

}