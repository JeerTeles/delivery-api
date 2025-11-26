package com.delivery_api.Projeto.delivery.API.repository;

import com.delivery_api.Projeto.delivery.API.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Long> {

    // Buscar por email (método derivado)

    Optional<Cliente> findByEmail(String email);

    //Verificar se email já existe
    boolean existsByEmail(String email);

    //Buscar cleintes ativos
    List<Cliente> findByAtivoTrue();

    // Buscar cleintes por nome (contendo)
    List<Cliente> findByAtivoContaining(String nome);
}
