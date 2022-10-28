package com.example.teste.model;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
@Table()
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column
    private String nome;

    @Column
    private String album;

    @ManyToMany
    private List<Artista> artista_id;

    @Column
    private String artista;

    public List<Artista> getArtista_id() {
        return artista_id;
    }

    public void setArtista_id(List<Artista> artista_id) {
        this.artista_id = artista_id;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
