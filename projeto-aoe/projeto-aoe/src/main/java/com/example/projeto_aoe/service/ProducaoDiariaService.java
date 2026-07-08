package com.example.projeto_aoe.service;

import com.example.projeto_aoe.dto.ProducaoDiariaRequestDTO;
import com.example.projeto_aoe.dto.ProducaoDiariaResponseDTO;
import com.example.projeto_aoe.model.ProducaoDiariaModel;
import com.example.projeto_aoe.repository.ProducaoDiariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProducaoDiariaService {

    @Autowired
    private ProducaoDiariaRepository repository;

    public ProducaoDiariaResponseDTO criar(ProducaoDiariaRequestDTO dto) {
        ProducaoDiariaModel model = new ProducaoDiariaModel();
        model.setPlataforma(dto.getPlataforma());
        model.setData(dto.getData());
        model.setBarrisPetroleo(dto.getBarrisPetroleo());
        model.setMetrosCubicosGas(dto.getMetrosCubicosGas());
        model.setMetaAtingida(dto.getMetaAtingida());

        ProducaoDiariaModel salvo = repository.save(model);
        return new ProducaoDiariaResponseDTO(salvo);
    }

    public List<ProducaoDiariaResponseDTO> listarTodos() {
        return repository.findAll().stream()
                .map(ProducaoDiariaResponseDTO::new)
                .collect(Collectors.toList());
    }

    public ProducaoDiariaResponseDTO buscarPorId(Long id) {
        ProducaoDiariaModel model = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produção não encontrada com id: " + id));
        return new ProducaoDiariaResponseDTO(model);
    }

    public ProducaoDiariaResponseDTO atualizar(Long id, ProducaoDiariaRequestDTO dto) {
        ProducaoDiariaModel model = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produção não encontrada com id: " + id));

        model.setPlataforma(dto.getPlataforma());
        model.setData(dto.getData());
        model.setBarrisPetroleo(dto.getBarrisPetroleo());
        model.setMetrosCubicosGas(dto.getMetrosCubicosGas());
        model.setMetaAtingida(dto.getMetaAtingida());

        ProducaoDiariaModel atualizado = repository.save(model);
        return new ProducaoDiariaResponseDTO(atualizado);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}