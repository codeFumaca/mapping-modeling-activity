package br.edu.ifba.saj.ads.demo.model.polimorfismo;

import jakarta.persistence.*;

@Entity // Indica que esta classe é uma entidade JPA
public class Correntista {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE) // Define a chave primária
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL) // Relacionamento um-para-um com Conta
    private Conta conta;

    // Construtor
    public Correntista(String nome) {
        this.nome = nome;
        this.conta = new Conta();
    }

    // Construtor padrão exigido pelo JPA
    public Correntista() {}

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Correntista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", conta=" + conta +
                '}';
    }
}

