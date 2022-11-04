package com.example.teste.controller;


import com.example.teste.model.Musica;
import com.example.teste.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/apiMusica")
public class MusicaController {

    @Autowired
    MusicaRepository musicaRepository;

    @GetMapping(value = "/musicas")
    public List<Musica> listarMusicas()
    {
        return musicaRepository.findAll();
    }

    @PostMapping("/inserir")
    public void inserirMusica(@RequestBody Musica musica)
    {
        musicaRepository.save(musica);
    }

}
