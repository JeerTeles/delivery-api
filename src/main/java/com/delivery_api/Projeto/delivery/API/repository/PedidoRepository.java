package com.delivery_api.Projeto.delivery.API.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deliverytech.delivery_api.entity.Pedido;
import com.deliverytech.delivery_api.enums.StatusPedido;

@Repository
public interface PedidoRepository extends JpaRepository <Pedido, Long> {

    // Buscar pedidos por cliente ID
    <Pedido> List<Pedido> findByClienteIdOrderByDataPedidoDesc(Long clienteId);

    // Pedidos por cliente
    <Pedido> List<Pedido> findByClienteId(Long clienteId);

    // Pedidos por status
    <Pedido, StatusPedido> List<Pedido> findByStatus(StatusPedido status);

    // 10 pedidos mais recentes
    <Pedido> List<Pedido> findTop10ByOrderByDataPedidoDesc();

    // Pedidos por período
    <Pedido> List<Pedido> findByDataPedidoBetween(LocalDateTime inicio, LocalDateTime fim);

}