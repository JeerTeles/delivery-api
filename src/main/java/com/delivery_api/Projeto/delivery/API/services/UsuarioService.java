
package com.delivery_api.Projeto.delivery.API.services;


import com.deliverytech.delivery_api.dto.request.LoginRequestDTO;
import com.deliverytech.delivery_api.dto.request.UsuarioRequestDTO;
import com.deliverytech.delivery_api.dto.response.LoginResponseDTO;
import com.deliverytech.delivery_api.dto.response.UsuarioResponseDTO;

public interface UsuarioService {

    <UsuarioResponseDTO, UsuarioRequestDTO> UsuarioResponseDTO cadastrar(UsuarioRequestDTO dto);

    <LoginRequestDTO, LoginResponseDTO> LoginResponseDTO login(LoginRequestDTO dto);

}
