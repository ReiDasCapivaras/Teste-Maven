package com.example.teste.repository;

import com.example.teste.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository <Album, Integer> {
}
