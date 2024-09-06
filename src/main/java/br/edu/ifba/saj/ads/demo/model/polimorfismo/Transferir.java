package br.edu.ifba.saj.ads.demo.model.polimorfismo;

import jakarta.persistence.*;

@Entity // Indica que esta classe é uma entidade JPA
public class Transferir extends Operacao {

    @ManyToOne // Relacionamento muitos-para-um com Conta de origem e destino
    private Conta origem;

    @ManyToOne // Uma transferência pode estar relacionada a várias contas de destino
    private Conta destino;
    @Id
    private Long id;

    // Construtor
    public Transferir(Conta contaOrigem, Conta contaDestino, double valor) {
        super(valor);
        this.origem = contaOrigem;
        this.destino = contaDestino;
    }

    public Transferir() {
        super();

    }

    @Override
    public double operar() {
        // Validações
        Debito d = new Debito(valor);
        origem.executarOperacao(d);
        return valor;
    }

    // Getters e Setters
    public Conta getOrigem() {
        return origem;
    }

    public void setOrigem(Conta origem) {
        this.origem = origem;
    }

    public Conta getDestino() {
        return destino;
    }

    public void setDestino(Conta destino) {
        this.destino = destino;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}