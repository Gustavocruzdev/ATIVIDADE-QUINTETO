package com.example.projeto_aoe.controller;

import com.example.projeto_aoe.dto.IncidenteRequestDTO;
import com.example.projeto_aoe.dto.IncidenteResponseDTO;
import com.example.projeto_aoe.model.IncidenteModel;
import com.example.projeto_aoe.service.IncidenteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/incidentes")
public class IncidenteController {

    @Autowired
    private IncidenteService service;

    // POST - Retorna o ResponseDTO
    @PostMapping
    public ResponseEntity<IncidenteResponseDTO> criar(@Valid @RequestBody IncidenteRequestDTO dto) {
        IncidenteModel novo = new IncidenteModel();
        copiarDtoParaModelo(dto, novo);
        IncidenteModel salvo = service.salvar(novo);
        return ResponseEntity.status(HttpStatus.CREATED).body(new IncidenteResponseDTO(salvo));
    }

    // GET Geral - Converte a lista de Modelos para lista de ResponseDTOs
    @GetMapping
    public List<IncidenteResponseDTO> listar() {
        return service.listarTodos().stream().map(IncidenteResponseDTO::new).toList();
    }

    // GET por ID - Retorna o ResponseDTO se achar
    @GetMapping("/{id}")
    public ResponseEntity<IncidenteResponseDTO> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(modelo -> ResponseEntity.ok(new IncidenteResponseDTO(modelo)))
                .orElse(ResponseEntity.notFound().build());
    }

    // PUT - Retorna o ResponseDTO atualizado
    @PutMapping("/{id}")
    public ResponseEntity<IncidenteResponseDTO> atualizar(@PathVariable Long id, @Valid @RequestBody IncidenteRequestDTO dto) {
        Optional<IncidenteModel> existente = service.buscarPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        IncidenteModel modelo = existente.get();
        copiarDtoParaModelo(dto, modelo);
        IncidenteModel atualizado = service.salvar(modelo);

        return ResponseEntity.ok(new IncidenteResponseDTO(atualizado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (service.buscarPorId(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    private void copiarDtoParaModelo(IncidenteRequestDTO dto, IncidenteModel modelo) {
        modelo.setGravidade(dto.gravidade());
        modelo.setDataHora(dto.dataHora());
        modelo.setPlataforma(dto.plataforma());
        modelo.setDescricao(dto.descricao());
        modelo.setAcoesImediatas(dto.acoesImediatas());
    }
}