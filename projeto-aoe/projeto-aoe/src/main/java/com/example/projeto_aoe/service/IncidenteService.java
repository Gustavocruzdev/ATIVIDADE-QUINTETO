package com.example.projeto_aoe.service;

import com.example.projeto_aoe.model.IncidenteModel;
import com.example.projeto_aoe.repository.IncidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncidenteService {

    @Autowired
    private IncidenteRepository repository;

    public IncidenteModel salvar(IncidenteModel incidente) {
        return repository.save(incidente);
    }
}