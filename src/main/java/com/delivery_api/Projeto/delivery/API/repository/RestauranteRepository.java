package com.deliverytech.delivery_api.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.deliverytech.delivery_api.projection.RelatorioVendas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RestauranteRepository<Restaurante> extends JpaRepository <Restaurante, Long>{
    // Buscar por nome
    <Restaurante> Optional<Restaurante> findByNome(String nome);

    //buscar por nome e ativo
    <Restaurante> Restaurante findByNomeAndAtivoTrue(String nome);

    // Buscar restaurantes ativos
    <Restaurante> List<Restaurante> findByAtivoTrue();

    // Buscar por categoria
    <Restaurante> List<Restaurante> findByCategoria(String categoria);

    // Por taxa de entrega menor ou igual
    <Restaurante> List<Restaurante> findByTaxaEntregaLessThanEqual(BigDecimal taxa);

    // Top 5 restaurantes por nome (ordem alfabética)
    <Restaurante> List<Restaurante> findTop5ByOrderByNomeAsc();

    // No RestauranteRepository:
    @Query("SELECT r.nome as nomeRestaurante, " +
            "SUM(p.valorTotal) as totalVendas, " +
            "COUNT(p.id) as quantidePedidos " +
            "FROM Restaurante r " +
            "LEFT JOIN Pedido p ON r.id = p.restaurante.id " +
            "GROUP BY r.id, r.nome")
    <RelatorioVendas>
    List<RelatorioVendas> relatorioVendasPorRestaurante();

    List<Restaurante> findByTaxaEntregaBetween(BigDecimal precoMinimo, BigDecimal precoMaximo);
}