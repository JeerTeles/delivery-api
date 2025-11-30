package com.delivery_api.Projeto.delivery.API.services;

import java.util.List;

import com.deliverytech.delivery_api.dto.request.ClienteRequestDTO;
import com.deliverytech.delivery_api.dto.response.ClienteResponseDTO;

public interface ClienteService {

    <ClienteResponseDTO, ClienteRequestDTO> ClienteResponseDTO cadastrar(ClienteRequestDTO dto);

    <ClienteResponseDTO> ClienteResponseDTO buscarPorId(Long id);

    <ClienteResponseDTO> ClienteResponseDTO buscarPorEmail(String email);

    <ClienteResponseDTO, ClienteRequestDTO> ClienteResponseDTO atualizar(Long id, ClienteRequestDTO dto);

    <ClienteResponseDTO> ClienteResponseDTO ativarDesativarCliente(Long id);

    <ClienteResponseDTO> List<ClienteResponseDTO> listarAtivos();

    <ClienteResponseDTO> List<ClienteResponseDTO> buscarPorNome(String nome);

}