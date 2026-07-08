package com.example.projeto_aoe.service;

import com.example.projeto_aoe.dto.EscalaTripulanteRequestDTO;
import com.example.projeto_aoe.dto.EscalaTripulanteResponseDTO;
import com.example.projeto_aoe.model.EscalaTripulanteModel;
import com.example.projeto_aoe.repository.EscalaTripulanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EscalaTripulanteService {

    @Autowired
    private EscalaTripulanteRepository repository;

    public EscalaTripulanteResponseDTO criar(EscalaTripulanteRequestDTO dto) {
        EscalaTripulanteModel model = new EscalaTripulanteModel();
        model.setPlataforma(dto.getPlataforma());
        model.setNomeFuncionario(dto.getNomeFuncionario());
        model.setFuncao(dto.getFuncao());
        model.setDataInicio(dto.getDataInicio());
        model.setDataFim(dto.getDataFim());

        EscalaTripulanteModel salvo = repository.save(model);
        return new EscalaTripulanteResponseDTO(salvo);
    }

    public List<EscalaTripulanteResponseDTO> listarTodos() {
        return repository.findAll().stream()
                .map(EscalaTripulanteResponseDTO::new)
                .collect(Collectors.toList());
    }

    public EscalaTripulanteResponseDTO buscarPorId(Long id) {
        EscalaTripulanteModel model = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Escala não encontrada com id: " + id));
        return new EscalaTripulanteResponseDTO(model);
    }

    public EscalaTripulanteResponseDTO atualizar(Long id, EscalaTripulanteRequestDTO dto) {
        EscalaTripulanteModel model = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Escala não encontrada com id: " + id));

        model.setPlataforma(dto.getPlataforma());
        model.setNomeFuncionario(dto.getNomeFuncionario());
        model.setFuncao(dto.getFuncao());
        model.setDataInicio(dto.getDataInicio());
        model.setDataFim(dto.getDataFim());

        EscalaTripulanteModel atualizado = repository.save(model);
        return new EscalaTripulanteResponseDTO(atualizado);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}