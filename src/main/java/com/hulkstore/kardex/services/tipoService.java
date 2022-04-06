package com.hulkstore.kardex.services;

import java.util.ArrayList;
import java.util.Optional;

import com.hulkstore.kardex.models.tipoModel;
import com.hulkstore.kardex.repositories.tipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class tipoService {
    @Autowired
    tipoRepository tipoRepository;
    
    public ArrayList<tipoModel> obtenerTipo(){
        return (ArrayList<tipoModel>) tipoRepository.findAll();
    }

 




    
}