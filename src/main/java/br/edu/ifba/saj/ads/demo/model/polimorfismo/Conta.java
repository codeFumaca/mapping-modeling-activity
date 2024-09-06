package br.edu.ifba.saj.ads.demo.model.polimorfismo;

import jakarta.persistence.*;

@Entity // Indica que esta classe é uma entidade JPA
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // Define a chave primária
    private Long id;

    private double saldo = 0;

    // Construtor padrão exigido pelo JPA
    public Conta() {}

    // Métodos da classe
    public void executarOperacao(Operacao opr) {
        saldo += opr.operar();
        // Aqui, as operações poderiam ser adicionadas às listas se necessário para fins de histórico
    }

    public double getSaldo() {
        return saldo;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}