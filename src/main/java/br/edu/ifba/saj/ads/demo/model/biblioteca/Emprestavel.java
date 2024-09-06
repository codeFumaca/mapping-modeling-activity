package br.edu.ifba.saj.ads.demo.model.biblioteca;

public interface Emprestavel {
    public void emprestar();
    public void devolver();
    public double calcMulta(int diasAtraso);
}
