package com.Alkemy.Icons.controller;

import com.Alkemy.Icons.entity.ContinenteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("continente")
@CrossOrigin("*")

public class ContinenteController {

    private ContienteService continenteService;

    @Autowired
    public  ContinenteController(ContienteService continenteService) { this.continenteService = continenteService;}

    @GetMapping
    public @ResponseBody
    List<ContinenteEntity> getAll() {
        List<ContinenteEntity> continentes = this.continenteService.getAllContinentes();
        return continentes;
    }

}
