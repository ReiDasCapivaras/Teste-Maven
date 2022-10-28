package com.example.teste.controller;


import com.example.teste.model.Artista;
import com.example.teste.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/apiArtista")
public class ArtistaController {

    @Autowired
    ArtistaRepository artistaRepository;

    @GetMapping(value = "/artistas")
    public List<Artista> buscarArtista()
    {
        return artistaRepository.findAll();
    }

}
