package br.edu.ifba.saj.ads.demo.model.biblioteca;

import jakarta.persistence.*;

@Entity
public class Revista extends Item implements Emprestavel {

    private int edicao;
    private int anoPublicacao;

    // Construtor com parâmetros
    public Revista(String titulo, String autor, int ano, int edicao, int anoPublicacao) {
        super(titulo, autor, ano);
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }

    // Construtor padrão exigido pelo JPA
    public Revista() {}


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
