package br.edu.ifba.saj.ads.demo.model.polimorfismo;

import jakarta.persistence.*;

@Entity
public class Correntista {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    // Construtor
    public Correntista(String nome) {
        this.nome = nome;
        this.conta = new Conta();
    }

    public Correntista() {}

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

