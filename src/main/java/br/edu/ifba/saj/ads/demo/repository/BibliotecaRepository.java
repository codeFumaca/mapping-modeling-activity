package br.edu.ifba.saj.ads.demo.repository;

import br.edu.ifba.saj.ads.demo.model.biblioteca.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer> {
}
