package com.hulkstore.kardex.repositories;



import com.hulkstore.kardex.models.localModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface localRepository extends CrudRepository<localModel, Long> {
 

}