
package com.deliverytech.delivery_api.services;


import com.deliverytech.delivery_api.dto.request.ProdutoRequestDTO;
import com.deliverytech.delivery_api.dto.response.ProdutoResponseDTO;

import java.math.BigDecimal;
import java.util.List;

public interface ProdutoService {

    <ProdutoResponseDTO, ProdutoRequestDTO> ProdutoResponseDTO cadastrar(ProdutoRequestDTO dto);

    <ProdutoResponseDTO> ProdutoResponseDTO buscarPorId(Long id);

    <ProdutoResponseDTO, ProdutoRequestDTO> ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto);

    <ProdutoResponseDTO> ProdutoResponseDTO ativarDesativarProduto(Long id);

    <ProdutoResponseDTO> ProdutoResponseDTO buscarPorNome(String nome);

    <ProdutoResponseDTO> List<ProdutoResponseDTO>  buscarPorRestaurante(Long restauranteId);

    <ProdutoResponseDTO> List<ProdutoResponseDTO> buscarPorCategoria(String categoria);

    <ProdutoResponseDTO> List<ProdutoResponseDTO> buscarPorPreco(BigDecimal precoMinimo, BigDecimal precoMaximo);

    <ProdutoResponseDTO> List<ProdutoResponseDTO> buscarTodosProdutos();

    <ProdutoResponseDTO> List<ProdutoResponseDTO> buscarPorPrecoMenorOuIgual(BigDecimal valor);
}