package com.hulkstore.kardex.repositories;



import com.hulkstore.kardex.models.productoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoRepository extends CrudRepository<productoModel, Long> {
 

}