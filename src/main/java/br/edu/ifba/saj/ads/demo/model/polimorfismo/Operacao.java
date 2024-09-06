package br.edu.ifba.saj.ads.demo.model.polimorfismo;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class Operacao {

    protected double valor;

    public Operacao(double valor) {
        this.valor = valor;
    }

    public Operacao() {}

    // Metodo abstrato que será implementado pelas subclasses
    public abstract double operar();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}