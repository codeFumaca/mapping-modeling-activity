package br.edu.ifba.saj.ads.demo.repository;

import br.edu.ifba.saj.ads.demo.model.polimorfismo.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<Banco, Integer> {
}
