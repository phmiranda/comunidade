/*
 * Author: Pedro
 * Project: comunidade
 * User Story: HU06 - BACKEND
 * Description: DESENVOLVIMENTO DO FLUXO DE AUTENTICAÇÃO DA API.
 * Date: 01/07/2021
 */

package br.com.phmiranda.comunidade.domain.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@Getter
@Setter
public class UsuarioAuthDto {
    private String email;
    private String senha;

    // CONVERSÃO DA ENTIDADE DE AUTENTICAÇÃO
    public UsernamePasswordAuthenticationToken converterAutenticacaoDtoParaEntidade() {
        return new UsernamePasswordAuthenticationToken(email, senha);
    }
}
