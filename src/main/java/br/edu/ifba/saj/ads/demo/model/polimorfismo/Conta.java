package br.edu.ifba.saj.ads.demo.model.polimorfismo;

import jakarta.persistence.*;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double saldo = 0;

    public Conta() {}

    public void executarOperacao(Operacao opr) {
        saldo += opr.operar();
        // Aqui, as operações poderiam ser adicionadas às listas se necessário para fins de histórico
    }

    public double getSaldo() {
        return saldo;
    }

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