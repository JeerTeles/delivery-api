package com.delivery_api.Projeto.delivery.API.services;


import com.deliverytech.delivery_api.dto.request.RestauranteRequestDTO;
import com.deliverytech.delivery_api.dto.response.RestauranteResponseDTO;
import com.deliverytech.delivery_api.projection.RelatorioVendas;

import java.math.BigDecimal;
import java.util.List;

public interface RestauranteService {

    <RestauranteResponseDTO, RestauranteRequestDTO> RestauranteResponseDTO cadastrar(RestauranteRequestDTO dto);

    <RestauranteResponseDTO> RestauranteResponseDTO buscarPorId(Long id);

    <RestauranteRequestDTO, RestauranteResponseDTO> RestauranteResponseDTO atualizar(Long id, RestauranteRequestDTO dto);

    <RestauranteResponseDTO> RestauranteResponseDTO ativarDesativarRestaurante(Long id);

    <RestauranteResponseDTO> RestauranteResponseDTO buscarPorNome(String nome);

    <RestauranteResponseDTO> List<RestauranteResponseDTO> buscarPorCategoria(String categoria);

    <RestauranteResponseDTO> List<RestauranteResponseDTO> buscarPorPreco(BigDecimal precoMinimo, BigDecimal precoMaximo);

    <RestauranteResponseDTO> List<RestauranteResponseDTO> listarAtivos();

    <RestauranteResponseDTO> List<RestauranteResponseDTO> listarTop5PorNome();

    <RelatorioVendas> List<RelatorioVendas> relatorioVendasPorRestaurante();

    <RestauranteResponseDTO> List<RestauranteResponseDTO> buscarPorTaxaEntrega(BigDecimal taxaEntrega);

    <RestauranteResponseDTO> RestauranteResponseDTO inativarRestaurante(Long id);
}