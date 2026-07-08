package com.example.projeto_aoe.controller;

import com.example.projeto_aoe.dto.SolicitacaoManutencaoRequestDTO;
import com.example.projeto_aoe.dto.SolicitacaoManutencaoResponseDTO;
import com.example.projeto_aoe.model.SolicitacaoManutencaoModel;
import com.example.projeto_aoe.service.ManutencaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/manutencao")
@CrossOrigin(origins = "*")
public class ManutencaoController {

    @Autowired
    private ManutencaoService service;

    @PostMapping
    public ResponseEntity<SolicitacaoManutencaoResponseDTO> criarSolicitacao(@RequestBody SolicitacaoManutencaoRequestDTO dto) {

        // Converte o DTO que chegou na Entidade para salvar no banco
        SolicitacaoManutencaoModel entidade = new SolicitacaoManutencaoModel();
        entidade.setEquipamentoId(dto.getEquipamentoId());
        entidade.setCriticidade(dto.getCriticidade());
        entidade.setDescricaoFalha(dto.getDescricaoFalha());

        SolicitacaoManutencaoModel salva = service.registrarSolicitacao(entidade);

        // Converte a Entidade salva de volta para um Response DTO
        SolicitacaoManutencaoResponseDTO responseDTO = converterParaResponseDTO(salva);

        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<SolicitacaoManutencaoResponseDTO>> listarSolicitacoes() {
        List<SolicitacaoManutencaoResponseDTO> lista = service.listarTodas().stream()
                .map(this::converterParaResponseDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(lista);
    }


    private SolicitacaoManutencaoResponseDTO converterParaResponseDTO(SolicitacaoManutencaoModel entidade) {
        SolicitacaoManutencaoResponseDTO dto = new SolicitacaoManutencaoResponseDTO();
        dto.setId(entidade.getId());
        dto.setEquipamentoId(entidade.getEquipamentoId());
        dto.setCriticidade(entidade.getCriticidade());
        dto.setDescricaoFalha(entidade.getDescricaoFalha());
        dto.setDataSolicitacao(entidade.getDataSolicitacao());
        return dto;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarSolicitacao(@PathVariable Long id) {
        service.deletarSolicitacao(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<SolicitacaoManutencaoResponseDTO> atualizarSolicitacao(
            @PathVariable Long id,
            @RequestBody SolicitacaoManutencaoRequestDTO dto) {

        SolicitacaoManutencaoModel existente = service.buscarPorId(id);

        // Atualiza os dados
        existente.setEquipamentoId(dto.getEquipamentoId());
        existente.setCriticidade(dto.getCriticidade());
        existente.setDescricaoFalha(dto.getDescricaoFalha());

        SolicitacaoManutencaoModel atualizada = service.registrarSolicitacao(existente);

        return ResponseEntity.ok(converterParaResponseDTO(atualizada));
    }
}