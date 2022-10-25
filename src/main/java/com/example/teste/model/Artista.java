package com.example.teste.model;

import javax.persistence.Entity;
import java.util.List;

public class Artista {

    private String nome;
    private int codigo;
    private List<Musica> musicas;
    private double duracaoS;

}
