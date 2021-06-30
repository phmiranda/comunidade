/*
 * Author: Pedro
 * Project: comunidade
 * User Story: HUXXX - TITLE OF USER HISTORY
 * Description: DESCRIPTION OF USER HISTORY
 * Date: 28/06/2021
 */

package br.com.phmiranda.comunidade.domain.dto;

import br.com.phmiranda.comunidade.domain.Curso;

import java.util.List;
import java.util.stream.Collectors;

public class CursoDto {
    private Long id;
    private String nome;
    private String categoria;

    // CONSTRUTOR QUE RECEBE UMA ENTIDADE CURSO PARA SETAR INFORMAÇÕES
    public CursoDto(Curso curso) {
        this.id = curso.getId();
        this.nome = curso.getNome();
        this.categoria = curso.getCategoria();
    }

    // GETTERS e SETTERS
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public static List<CursoDto> converterDtoParaEntidade(List<Curso> cursos) {
        return cursos.stream().map(CursoDto::new).collect(Collectors.toList());

    }
}