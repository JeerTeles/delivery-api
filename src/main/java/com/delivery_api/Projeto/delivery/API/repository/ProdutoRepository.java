package com.deliverytech.delivery_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.entity.Produto;

import java.math.BigDecimal;
import java.util.List;


@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    // buscar produto por restaurante ID
    <Produto> List<Produto> findByRestauranteId(Long restauranteId);

    // Apenas produtos disponíveis
    <Produto> List<Produto> findByDisponivelTrue();

    // Produtos por categoria
    <Produto> List<Produto> findByCategoria(String categoria);

    // Por faixa de preço (menor ou igual)
    <Produto> List<Produto> findByPrecoLessThanEqual(BigDecimal preco);

    // Buscar produto por nome
    <Produto> Produto findByNome(String nome);

}