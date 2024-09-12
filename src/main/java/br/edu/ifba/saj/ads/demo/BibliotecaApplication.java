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

        // Criação de objetos
//        Livro livro = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 2023, "123456789", 1000);
//        Quadro quadro = new Quadro("Mona Lisa", "Leonardo da Vinci", 1503, "Renascimento");
//        Revista revista = new Revista("Veja", "Abril", 2021,123, 1);
//        DVD dvd = new DVD("Vingadores", "Marvel", 2012,"ação", 120);

//        BibliotecaRepository.save(livro);
//        BibliotecaRepository.save(quadro);
//        BibliotecaRepository.save(revista);
//        BibliotecaRepository.save(dvd);

        // Procurar item por Autor
//        BibliotecaRepository.findByAutor("J. K. Rowling").forEach(System.out::println);
        // Procurar item por Título
//        BibliotecaRepository.findByTitulo("Mona Lisa").forEach(System.out::println);

    }

}