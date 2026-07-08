package com.example.projeto_aoe.service;

import com.example.projeto_aoe.model.IncidenteModel;
import com.example.projeto_aoe.repository.IncidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IncidenteService {

    @Autowired
    private IncidenteRepository repository;

    public IncidenteModel salvar(IncidenteModel incidente) {
        return repository.save(incidente);
    }

    public List<IncidenteModel> listarTodos() {
        return repository.findAll();
    }

    public Optional<IncidenteModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}