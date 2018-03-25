/**
 * 
 */
package com.algaworks.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algamoneyapi.model.Lancamento;

/**
 * @author silvan
 *
 */
public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
