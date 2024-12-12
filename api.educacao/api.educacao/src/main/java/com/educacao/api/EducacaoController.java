package com.educacao.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import EducacaoModel.EducacaoModel;

@RestController // Marca a classe como um controlador REST
@RequestMapping("/api/educacao") // Define o caminho base para os endpoints da API
public class EducacaoController {

    @Autowired
    private EducacaoService educacaoService;

    // Endpoint para listar todos os cursos ou itens educacionais
    @GetMapping
    public List<EducacaoModel> listarEducacoes() {
        return educacaoService.listarEducacoes(); // Chama o serviço para listar os dados
    }

    // Endpoint para buscar um item educacional pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<EducacaoModel> buscarEducacaoPorId(@PathVariable Long id) {
        Optional<EducacaoModel> educacao = educacaoService.buscarEducacaoPorId(id);
        // Se encontrado, retorna o item. Se não, retorna 404 (Not Found).
        return educacao.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint para criar um novo curso ou item educacional
    @PostMapping
    public ResponseEntity<EducacaoModel> salvarEducacao(@RequestBody EducacaoDTO educacaoDTO) {
        EducacaoModel educacaoModel = educacaoService.salvarEducacao(educacaoDTO); // Chama o serviço para salvar o dado
        return ResponseEntity.status(HttpStatus.CREATED).body(educacaoModel); // Retorna o item salvo com status 201
    }

    // Endpoint para excluir um item educacional pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirEducacao(@PathVariable Long id) {
        educacaoService.excluirEducacao(id); // Chama o serviço para excluir o dado
        return ResponseEntity.noContent().build(); // Retorna 204 (No Content) se a exclusão for bem-sucedida
    }
}