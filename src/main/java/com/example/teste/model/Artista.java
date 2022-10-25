package com.example.teste.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "projeto_Artista")
public class Artista {

    //Artista é a classe dominante do relacionamento N-N com músicas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_artista;

    @Column
    private String nome;

    @Column
    @ManyToMany
    @JoinTable(name="artista_musica", joinColumns = {@JoinColumn(name = "")})
    private List<Musica> musicas;

    @Column
    private List<Album> albuns;

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
