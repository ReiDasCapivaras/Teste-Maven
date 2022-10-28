package com.example.teste.repository;


import com.example.teste.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository <Musica, Integer> {
}
