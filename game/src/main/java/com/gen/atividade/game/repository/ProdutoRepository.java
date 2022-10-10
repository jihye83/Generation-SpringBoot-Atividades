package com.gen.atividade.game.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gen.atividade.game.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeProdContainingIgnoreCase(@Param("produto")String nomeProd);
	
	public List<Produto> findByData(LocalDate data);
	
	public List<Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	
	public List<Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
}
