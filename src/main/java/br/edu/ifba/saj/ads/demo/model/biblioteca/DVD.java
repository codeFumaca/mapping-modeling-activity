package br.edu.ifba.saj.ads.demo.model.biblioteca;

import jakarta.persistence.*;

@Entity
public class DVD extends Item implements Emprestavel {

    private String genero;
    private int duracao;


    public DVD(String titulo, String autor, int ano, Biblioteca biblioteca, String genero, int duracao) {
        super(titulo, autor, ano, biblioteca);
        this.genero = genero;
        this.duracao = duracao;
    }

    public DVD() {}

    @Override
    public void emprestar() {
        this.biblioteca.removeItem(this);
        this.biblioteca.addItemEmprestado(this);
    }

    @Override
    public void devolver() {
        this.biblioteca.removeItemEmprestado(this);
        this.biblioteca.addItem(this);
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