package br.edu.ifba.saj.ads.demo;

import br.edu.ifba.saj.ads.demo.model.biblioteca.*;
import br.edu.ifba.saj.ads.demo.repository.BibliotecaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication implements CommandLineRunner {

    @Autowired
    private BibliotecaRepository BibliotecaRepository;

    public static void main(String[] args) {
        SpringApplication.run(BibliotecaApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien",biblioteca, 2023, "123456789", 1000);
        Quadro quadro = new Quadro("Mona Lisa", "Leonardo da Vinci", 1503,biblioteca, "Renascimento");
        Revista revista = new Revista("Veja", "Abril", 2021, biblioteca,123, 1);
        DVD dvd = new DVD("Vingadores", "Marvel", 2012, biblioteca,"ação", 120);

        biblioteca.addItem(livro);
        biblioteca.addItem(quadro);
        biblioteca.addItem(revista);
        biblioteca.addItem(dvd);

        livro.emprestar();

        BibliotecaRepository.save(biblioteca);

        System.out.println("Lista de Bibliotecas:");
        BibliotecaRepository.findAll().forEach(System.out::println);
    }

}