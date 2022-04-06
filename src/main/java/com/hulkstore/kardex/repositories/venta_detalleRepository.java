package com.hulkstore.kardex.repositories;



import com.hulkstore.kardex.models.venta_detalleModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface venta_detalleRepository extends CrudRepository<venta_detalleModel, Long> {
 

}