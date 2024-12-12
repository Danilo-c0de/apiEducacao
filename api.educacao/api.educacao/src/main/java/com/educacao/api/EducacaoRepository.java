package com.educacao.api;


import org.springframework.data.jpa.repository.JpaRepository;

import EducacaoModel.EducacaoModel;

// Repositório que extende JpaRepository para fornecer operações CRUD padrão para EducacaoModel
public interface EducacaoRepository extends JpaRepository<EducacaoModel, Long> {
}