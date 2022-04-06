package com.hulkstore.kardex.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.hulkstore.kardex.models.tipoModel;
import com.hulkstore.kardex.services.tipoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/tipo")
public class tipoController {
    @Autowired
    tipoService tipoService;

    @GetMapping()
    public ArrayList<tipoModel> obteneTipo(){
        return tipoService.obtenerTipo();
    }




   

}