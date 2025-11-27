
package com.delivery_api.Projeto.delivery.API.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDTO {
    private String token;
    private String tipo;
    private Long expiracao;
    private com.deliverytech.delivery_api.dto.response.UsuarioResponseDTO usuario;
}