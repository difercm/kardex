package com.hulkstore.kardex.repositories;



import com.hulkstore.kardex.models.compraModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface compraRepository extends CrudRepository<compraModel, Long> {
 

}