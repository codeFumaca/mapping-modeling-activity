package br.edu.ifba.saj.ads.demo.model.biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 2023, "123456789", 1000);
        Quadro quadro = new Quadro("Mona Lisa", "Leonardo da Vinci", 1503, "Renascimento");
        Revista revista = new Revista("Veja", "Abril", 2021,123, 1);
        DVD dvd = new DVD("Vingadores", "Marvel", 2012,"ação", 120);

        biblioteca.addItem(livro);
        biblioteca.addItem(quadro);
        biblioteca.addItem(revista);
        biblioteca.addItem(dvd);

        livro.emprestar();

        biblioteca.listarItensDisponiveis();
        biblioteca.listarItensIndisponiveis();
    }
}
