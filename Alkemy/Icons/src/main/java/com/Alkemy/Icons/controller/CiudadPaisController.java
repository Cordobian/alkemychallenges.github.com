package com.Alkemy.Icons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/continente")
@CrossOrigin("*")

public class CiudadPaisController {
    @Autowired
    private IcontinenteService continenteService;
}
