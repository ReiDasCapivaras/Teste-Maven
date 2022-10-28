package com.example.teste.controller;


import com.example.teste.model.Album;
import com.example.teste.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/apiAlbum")
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping(value = "/albuns")
    public List<Album> buscarAlbuns()
    {
        return albumRepository.findAll();
    }
}
