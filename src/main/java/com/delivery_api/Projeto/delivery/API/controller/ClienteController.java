package com.delivery_api.Projeto.delivery.API.controller;

import com.delivery_api.Projeto.delivery.API.entity.Cliente;
import com.delivery_api.Projeto.delivery.API.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = "*")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    /**
     * Cadastrar novo cliente
     */
    @PostMapping
    public ResponseEntity<?> cadastrar(@Validated @RequestBody Cliente cliente) {
        try {
            Cliente clienteSalvo = clienteService.cadastrar(cliente);
            return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
        } catch (IllegalAccessException e) {
            return ResponseEntity.badRequest().body("Erro:" + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Erro interno do servidor");
        }
    }

    // listar todos os clientes salvos


}
