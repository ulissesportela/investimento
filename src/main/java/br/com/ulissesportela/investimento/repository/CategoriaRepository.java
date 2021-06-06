package br.com.ulissesportela.investimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ulissesportela.investimento.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
