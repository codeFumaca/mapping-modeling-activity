package br.edu.ifba.saj.ads.demo.model.biblioteca;

import jakarta.persistence.*;

@Entity
public class Livro extends Item implements Emprestavel {

    private String ISBN;
    private int numPaginas;

    public Livro(String titulo, String autor, int ano, String isbn, int numPaginas) {
        super(titulo, autor, ano);
        this.ISBN = isbn;
        this.numPaginas = numPaginas;
    }

    public Livro() {}

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
        return diasAtraso * 0.5; // Multa simples de 0.5 por dia de atraso
    }

    @Override
    public String toString() {
        return "Livro: " + this.titulo + ", Autor: " + this.autor + ", Ano: " + this.ano +
                ", ISBN: " + ISBN + ", Páginas: " + numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
