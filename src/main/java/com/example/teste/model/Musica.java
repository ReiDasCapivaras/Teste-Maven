package com.example.teste.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projeto-musica")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column
    private String nome;

    @Column
    private String album;

    @Column
    @ManyToMany
    private List<Artista> artista;

    @Column
    private double duracaoS;

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

    public List<Artista> getArtista() {
        return artista;
    }

    public void setArtista(List<Artista> artista) {
        this.artista = artista;
    }

    public double getDuracaoS() {
        return duracaoS;
    }

    public void setDuracaoS(double duracaoS) {
        this.duracaoS = duracaoS;
    }
}
