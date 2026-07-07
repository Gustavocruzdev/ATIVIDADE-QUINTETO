package com.example.projeto_aoe.controller;

import com.example.projeto_aoe.dto.IncidenteRequestDTO;
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

    @PostMapping
    public ResponseEntity<IncidenteModel> criar(@Valid @RequestBody IncidenteRequestDTO dto) {
        IncidenteModel novo = new IncidenteModel();
        copiarDtoParaModelo(dto, novo);
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(novo));
    }

    @GetMapping
    public List<IncidenteModel> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<IncidenteModel> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<IncidenteModel> atualizar(@PathVariable Long id, @Valid @RequestBody IncidenteRequestDTO dto) {
        Optional<IncidenteModel> existente = service.buscarPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        IncidenteModel modelo = existente.get();
        copiarDtoParaModelo(dto, modelo);
        return ResponseEntity.ok(service.salvar(modelo));
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