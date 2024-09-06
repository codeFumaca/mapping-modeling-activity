package br.edu.ifba.saj.ads.demo.model.polimorfismo;

public class Debito extends Operacao{

    public Debito(double valor) {
        super(-valor);
    }

    @Override
    public double operar() {
        return this.valor;
    }
}
