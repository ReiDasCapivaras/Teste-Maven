package com.example.teste.model;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "projeto_Artista")
public class Artista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column
    private String nome;

    @Column
    @ManyToMany
    private List<Musica> musicas;

    @Column
    private List<Album> albuns;

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

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}
