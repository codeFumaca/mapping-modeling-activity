package br.edu.ifba.saj.ads.demo.model.polimorfismo;

import jakarta.persistence.*;

@MappedSuperclass // Define que esta classe serve de base para outras entidades JPA
public abstract class Operacao {

    protected double valor;

    // Construtor com valor
    public Operacao(double valor) {
        this.valor = valor;
    }

    // Construtor padrão exigido pelo JPA
    public Operacao() {}

    // Método abstrato que será implementado pelas subclasses
    public abstract double operar();

    // Getter e Setter para o valor
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}