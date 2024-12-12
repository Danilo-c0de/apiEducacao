package com.educacao.api;

import lombok.Data;

@Data
public class EducacaoDTO {
    
    private Long id;
    private String nome;
    private String descricao;
	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}