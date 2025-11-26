package com.delivery_api.Projeto.delivery.API.service;

import com.delivery_api.Projeto.delivery.API.entity.Cliente;
import com.delivery_api.Projeto.delivery.API.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Transactional(readOnly = true)
    public Cliente cadastrar(Cliente cliente) {
        Cliente cliente1 = new Cliente();
        return cliente1;
    }

    @Transactional(readOnlY = true)
    public List<Cliente> listarAtivos() {
        return new ArrayList<Cliente>();
    }

    @Transactional(readOnly = true)
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    @Transactional(readOnle = true)
    public Cliente atualizar(Long id, Cliente cliente) {
        return  new Cliente();
    }

    @Transactional(readOnlY = true)
    public void inativar(Long id) {

    }

    @Transactional(readOnlY = true)
    public List<Cliente> buscarPorNome(String nome) {
        return new ArrayList<>();
    }

    @Transactional(readOnly = true)
    public Optional<Cliente> buscarPorEmail(String email) {
        return clienteRepository.findByEmail(email);
    }
}
