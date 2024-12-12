package com.educacao.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EducacaoModel.EducacaoModel;

@Service
public class EducacaoService {

    @Autowired
    private EducacaoRepository educacaoRepository;

    // Lista todas as educações
    public List<EducacaoModel> listarEducacoes() {
        return educacaoRepository.findAll();
    }

    // Busca uma educação por ID
    public Optional<EducacaoModel> buscarEducacaoPorId(Long id) {
        return educacaoRepository.findById(id);
    }

    // Salva uma nova educação
    public EducacaoModel salvarEducacao(EducacaoDTO educacaoDTO) {
        EducacaoModel educacaoModel = new EducacaoModel();
        educacaoModel.setNome(educacaoDTO.getNome());
        educacaoModel.setDescricao(educacaoDTO.getDescricao());

        return educacaoRepository.save(educacaoModel);
    }

    // Exclui uma educação
    public void excluirEducacao(Long id) {
        educacaoRepository.deleteById(id);
    }
}