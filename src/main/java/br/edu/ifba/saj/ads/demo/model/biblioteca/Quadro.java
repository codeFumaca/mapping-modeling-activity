package br.edu.ifba.saj.ads.demo.model.biblioteca;

import jakarta.persistence.*;

@Entity
public class Quadro extends Item {

    private String estilo;

    // Construtor com parâmetros
    public Quadro(String titulo, String autor, int ano, String estilo) {
        super(titulo, autor, ano);
        this.estilo = estilo;
    }

    public Quadro() {}

    @Override
    public String toString() {
        return "Quadro: " + this.titulo + ", Autor: " + this.autor + ", Estilo: " + estilo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}