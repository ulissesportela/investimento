package br.com.ulissesportela.investimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ulissesportela.investimento.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
