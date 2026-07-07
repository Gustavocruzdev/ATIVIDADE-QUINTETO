package com.example.projeto_aoe.controller;

import com.example.projeto_aoe.model.IncidenteModel;
import com.example.projeto_aoe.service.IncidenteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/incidentes")
public class IncidenteController {

    @Autowired
    private IncidenteService service;

    @PostMapping
    public ResponseEntity<IncidenteModel> criar(@Valid @RequestBody IncidenteModel incidente) {
        IncidenteModel novoIncidente = service.salvar(incidente);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoIncidente);
    }
}