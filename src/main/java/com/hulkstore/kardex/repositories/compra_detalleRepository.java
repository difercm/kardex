package com.hulkstore.kardex.repositories;



import com.hulkstore.kardex.models.compra_detalleModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface compra_detalleRepository extends CrudRepository<compra_detalleModel, Long> {
 

}