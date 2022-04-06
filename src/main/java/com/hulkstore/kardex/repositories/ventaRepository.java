package com.hulkstore.kardex.repositories;



import com.hulkstore.kardex.models.ventaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ventaRepository extends CrudRepository<ventaModel, Long> {
 

}