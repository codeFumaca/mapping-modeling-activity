package br.edu.ifba.saj.ads.demo.model.polimorfismo;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Correntista> correntistas;

    @Basic
    private int qtdCorrentista;

    public Banco() {
        this.correntistas = new ArrayList<>();
        this.qtdCorrentista = 0;
    }

    public void addCorrentista(String nome) {
        correntistas.add(new Correntista(nome));
        qtdCorrentista++;
    }

    public Correntista getCorrentista(String nome) {
        return correntistas.stream().filter(c -> c.getNome().equals(nome)).findFirst().orElse(null);
    }

    public void debitar(String nomeCorrentista, double valor) {
        Debito d = new Debito(valor);
        getCorrentista(nomeCorrentista).getConta().executarOperacao(d);
    }

    public void creditar(String nomeCorrentista, double valor) {
        Credito c = new Credito(valor);
        getCorrentista(nomeCorrentista).getConta().executarOperacao(c);
    }

    public double getSaldo(String nomeCorrentista) {
        return getCorrentista(nomeCorrentista).getConta().getSaldo();
    }

    public void transferir(String nomeCorrentistaOrigem, String nomeCorrentistaDestino, double valor) {
        Transferir t = new Transferir(getCorrentista(nomeCorrentistaOrigem).getConta(), getCorrentista(nomeCorrentistaDestino).getConta(), valor);
        getCorrentista(nomeCorrentistaDestino).getConta().executarOperacao(t);
    }

    public Integer getId() {
        return Math.toIntExact(id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Correntista> getCorrentistas() {
        return correntistas;
    }

    public void setCorrentistas(List<Correntista> correntistas) {
        this.correntistas = correntistas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "id=" + id +
                ", correntistas=" + correntistas + '\'' +
                ", qtdCorrentista=" + qtdCorrentista + '\'' +
                '}';
    }
}
