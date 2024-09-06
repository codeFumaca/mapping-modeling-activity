package br.edu.ifba.saj.ads.demo.model.biblioteca;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Inheritance
public abstract class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected String titulo;

    protected String autor;

    protected int ano;

    @ManyToOne(fetch = FetchType.LAZY) // Relacionamento Many-to-One com a entidade Biblioteca// Define a chave estrangeira
    protected Biblioteca biblioteca;

    public Item(String titulo, String autor, int ano, Biblioteca biblioteca) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.biblioteca = biblioteca;
    }

    public Item() {}

    public abstract String toString();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}