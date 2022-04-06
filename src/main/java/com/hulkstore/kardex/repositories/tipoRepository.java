package com.hulkstore.kardex.repositories;

import java.util.ArrayList;

import com.hulkstore.kardex.models.tipoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoRepository extends CrudRepository<tipoModel, Long> {
 

}
