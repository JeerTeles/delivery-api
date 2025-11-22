package com.delivery_api.Projeto.delivery.API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;
@RestController

public class HealthController {

    @GetMapping("/health")
    public Map<String, String> health(){
        return Map.of(
                "status", "ok",
                "timestamp", LocalDateTime.now().toString(),
                "Service", "Delivery API"
        );
    }
}
