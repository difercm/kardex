package com.hulkstore.kardex.repositories;



import com.hulkstore.kardex.models.clienteModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface clienteRepository extends CrudRepository<clienteModel, Long> {
 

}