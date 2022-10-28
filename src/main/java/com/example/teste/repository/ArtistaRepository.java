package com.example.teste.repository;

import com.example.teste.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository <Artista, Integer> {
}
