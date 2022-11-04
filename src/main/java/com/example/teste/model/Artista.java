package com.example.teste.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Artista implements Serializable {

    //Artista é a classe dominante do relacionamento N-N com músicas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_artista;

    @Column
    private String nome;

    @JsonIgnoreProperties ("artistas")
    @ManyToMany (mappedBy = "artistas")
    private List<Musica> musicas;

    @Column
    @OneToMany
    private Set<Album> albuns;

    public Set<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(Set<Album> albuns) {
        this.albuns = albuns;
    }

    public int getId_artista() {
        return id_artista;
    }

    public void setId_artista(int id_artista) {
        this.id_artista = id_artista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}
