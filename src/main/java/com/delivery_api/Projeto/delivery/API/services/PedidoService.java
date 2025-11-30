package com.delivery_api.Projeto.delivery.API.services;

import java.math.BigDecimal;
import java.util.List;

import com.deliverytech.delivery_api.dto.request.ItemPedidoRequestDTO;
import com.deliverytech.delivery_api.dto.request.PedidoRequestDTO;
import com.deliverytech.delivery_api.dto.response.PedidoResponseDTO;
import com.deliverytech.delivery_api.enums.StatusPedido;



public interface PedidoService {

    <PedidoResponseDTO, PedidoRequestDTO> PedidoResponseDTO criarPedido(PedidoRequestDTO dto);

    <PedidoResponseDTO> PedidoResponseDTO buscarPorId(Long id);

    <PedidoResponseDTO> List<PedidoResponseDTO> listarPedidosPorCliente(Long clienteId);

    <PedidoResponseDTO, StatusPedido> PedidoResponseDTO atualizarStatusPedido(Long id, StatusPedido status);

    <ItemPedidoRequestDTO> BigDecimal calcularValorTotalPedido(List<ItemPedidoRequestDTO> itens );

    <PedidoResponseDTO> PedidoResponseDTO cancelarPedido(Long id);

}