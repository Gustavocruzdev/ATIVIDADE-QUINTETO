package com.example.projeto_aoe.controller;

import com.example.projeto_aoe.dto.ProducaoDiariaRequestDTO;
import com.example.projeto_aoe.dto.ProducaoDiariaResponseDTO;
import com.example.projeto_aoe.service.ProducaoDiariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producao")
public class ProducaoDiariaController {

    @Autowired
    private ProducaoDiariaService service;

    @PostMapping
    public ResponseEntity<ProducaoDiariaResponseDTO> criar(@RequestBody ProducaoDiariaRequestDTO dto) {
        return ResponseEntity.ok(service.criar(dto));
    }

    @GetMapping
    public ResponseEntity<List<ProducaoDiariaResponseDTO>> listarTodos() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProducaoDiariaResponseDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProducaoDiariaResponseDTO> atualizar(@PathVariable Long id, @RequestBody ProducaoDiariaRequestDTO dto) {
        return ResponseEntity.ok(service.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}