package com.delivery_api.Projeto.delivery.API.repository;

import com.delivery_api.Projeto.delivery.API.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Long> {

}
