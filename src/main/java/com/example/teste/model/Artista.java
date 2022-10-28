package com.example.teste.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table()
public class Artista {

    //Artista é a classe dominante do relacionamento N-N com músicas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_artista;

    @Column
    private String nome;

    @Column
    @ManyToMany
    private List<Musica> musicas;

    @Column
    @OneToMany
    private List<Album> albuns;

    public List<Album> getAlbuns() {
        return albuns;
    }

    public void setAlbuns(List<Album> albuns) {
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
