package com.example.projeto_aoe.controller;

import com.example.projeto_aoe.dto.EscalaTripulanteRequestDTO;
import com.example.projeto_aoe.dto.EscalaTripulanteResponseDTO;
import com.example.projeto_aoe.service.EscalaTripulanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/escala")
public class EscalaTripulanteController {

    @Autowired
    private EscalaTripulanteService service;

    @PostMapping
    public ResponseEntity<EscalaTripulanteResponseDTO> criar(@RequestBody EscalaTripulanteRequestDTO dto) {
        return ResponseEntity.ok(service.criar(dto));
    }

    @GetMapping
    public ResponseEntity<List<EscalaTripulanteResponseDTO>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EscalaTripulanteResponseDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EscalaTripulanteResponseDTO> atualizar(@PathVariable Long id, @RequestBody EscalaTripulanteRequestDTO dto) {
        return ResponseEntity.ok(service.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}