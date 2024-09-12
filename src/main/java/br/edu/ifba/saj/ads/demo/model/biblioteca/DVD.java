package br.edu.ifba.saj.ads.demo.model.biblioteca;

import jakarta.persistence.*;

@Entity
public class DVD extends Item implements Emprestavel {

    private String genero;
    private int duracao;


    public DVD(String titulo, String autor, int ano, String genero, int duracao) {
        super(titulo, autor, ano);
        this.genero = genero;
        this.duracao = duracao;
    }

    public DVD() {}

    @Override
    public void emprestar() {
        this.emprestado = true;
    }

    @Override
    public void devolver() {
        // validar se o item está emprestado
        this.emprestado = false;
    }

    @Override
    public double calcMulta(int diasAtraso) {
        return diasAtraso; // Exemplo simples, pode ajustar a lógica da multa
    }

    @Override
    public String toString() {
        return "DVD: " + this.titulo + ", Diretor: " + this.autor + ", Gênero: " + genero + ", Duração: " + duracao + " min";
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}