package com.example.teste.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table()
public class Musica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_musica;

    @Column
    private String nome;

    @Column
    private String album;

    @ManyToMany
    @JsonIgnoreProperties({"musicas", "albuns"})
    @JoinTable(name = "musica_artista", joinColumns = {@JoinColumn(name = "id_musica") }, inverseJoinColumns = {@JoinColumn(name = "id_artista")})
    private Set<Artista> artistas;

    public int getId_musica() {
        return id_musica;
    }

    public void setId_musica(int id_musica) {
        this.id_musica = id_musica;
    }

    public Set<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(Set<Artista> artistas) {
        this.artistas = artistas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }


}
