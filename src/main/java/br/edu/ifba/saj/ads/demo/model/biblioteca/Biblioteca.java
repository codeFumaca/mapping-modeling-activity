package br.edu.ifba.saj.ads.demo.model.biblioteca;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Biblioteca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Item> itens;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Item> itensEmprestados;

    public Biblioteca() {
        this.itens = new ArrayList<Item>();
        this.itensEmprestados = new ArrayList<Item>();
    }

    public List<Item> getItens() {
        return itens;
    }

    public List<Item> getItensEmprestados() {
        return itensEmprestados;
    }

    public void addItem(Item iten) {
        if (!itens.contains(iten)) itens.add(iten);
    }

    public void addItemEmprestado(Item iten) {
        if (!itensEmprestados.contains(iten)) itensEmprestados.add(iten);
    }

    public void removeItem(Item iten) {
        itens.remove(iten);
    }

    public void removeItemEmprestado(Item iten) {
        itensEmprestados.remove(iten);
    }

    public void listarItensDisponiveis() {
        System.out.println("Itens Disponíveis:");
        for (Item item : itens) {
            System.out.println(item.toString());
        }
    }

    public void listarItensIndisponiveis() {
        System.out.println("Itens Indisponíveis:");
        for (Item item : itensEmprestados) {
            System.out.println(item.toString());
        }
    }

    public void setItensEmprestados(List<Item> itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "id=" + id +
                ", itens=" + itens +
                ", itensEmprestados=" + itensEmprestados +
                '}';
    }
}