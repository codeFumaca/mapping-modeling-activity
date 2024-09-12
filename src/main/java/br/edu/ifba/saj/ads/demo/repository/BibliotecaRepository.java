package br.edu.ifba.saj.ads.demo.repository;

import br.edu.ifba.saj.ads.demo.model.biblioteca.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BibliotecaRepository extends JpaRepository<Item, Integer> {

    List<Item> findByTitulo(String titulo);

    List<Item> findByAutor(String autor);

    List<Item> findByAnoPublicacao(Integer anoPublicacao);

    List<Item> findByEmprestado(Boolean emprestado);
}
