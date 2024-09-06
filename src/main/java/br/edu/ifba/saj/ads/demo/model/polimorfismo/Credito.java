package br.edu.ifba.saj.ads.demo.model.polimorfismo;

public class Credito extends Operacao{
    public Credito(double valor) {
        super(valor);
    }

    @Override
    public double operar() {
        return this.valor;
    }
}