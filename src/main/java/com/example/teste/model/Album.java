package com.example.teste.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Album {

    @Id
    private int id_album;

    @OneToMany
    private List<Musica> musicas;

    @Column
    private String nome;


    @ManyToOne
    @JoinTable(name = "album_artista", joinColumns = {@JoinColumn(name = "id_album")}, inverseJoinColumns = {@JoinColumn(name = "id_artista")})
    @JsonIgnoreProperties("albuns")
    private Artista artista;


    public int getId_album() {
        return id_album;
    }

    public void setId_album(int id_album) {
        this.id_album = id_album;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }


}
