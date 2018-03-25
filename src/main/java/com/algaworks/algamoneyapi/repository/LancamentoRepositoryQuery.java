/**
 * 
 */
package com.algaworks.algamoneyapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.algaworks.algamoneyapi.model.Lancamento;
import com.algaworks.algamoneyapi.repository.filter.LancamentoFilter;
import com.algaworks.algamoneyapi.repository.projection.ResumoLancamento;

/**
 * @author silvan
 *
 */
public interface LancamentoRepositoryQuery {
	public Page<Lancamento> filtrar(LancamentoFilter filter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
