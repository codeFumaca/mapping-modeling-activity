package br.edu.ifba.saj.ads.demo.model.biblioteca;

import jakarta.persistence.*;

@Entity
public class Revista extends Item implements Emprestavel {

    private int edicao;
    private int anoPublicacao;

    // Construtor com parâmetros
    public Revista(String titulo, String autor, int ano, Biblioteca biblioteca, int edicao, int anoPublicacao) {
        super(titulo, autor, ano, biblioteca);
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }

    // Construtor padrão exigido pelo JPA
    public Revista() {}

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
        return diasAtraso * 0.25; // Multa de 0.25 por dia de atraso
    }

    @Override
    public String toString() {
        return "Revista: " + this.titulo + ", Edição: " + edicao + ", Data de Publicação: " + anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
