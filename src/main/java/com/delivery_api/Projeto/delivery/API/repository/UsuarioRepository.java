package com.delivery_api.Projeto.delivery.API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository<Usuario> extends JpaRepository<Usuario, Long> {

    <Usuario> Optional<Usuario> findByEmail(String email);

    boolean existsByEmail(String email);

    <Usuario> Optional<Usuario> findByEmailAndAtivo(String email, boolean ativo);
}