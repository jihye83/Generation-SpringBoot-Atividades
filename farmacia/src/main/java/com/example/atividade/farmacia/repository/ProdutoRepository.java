package com.example.atividade.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.atividade.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("produto") String nome);
	//qdo é numero tirar o ContainingIgnoreCase - isso é para ignorar a Letra maiscula
	public List<Produto> findAllByPreco(@Param("produto") BigDecimal preco);

}
