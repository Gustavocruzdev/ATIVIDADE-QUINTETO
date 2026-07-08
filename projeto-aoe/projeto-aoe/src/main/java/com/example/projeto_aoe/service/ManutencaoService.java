package com.example.projeto_aoe.service;


import com.example.projeto_aoe.model.SolicitacaoManutencaoModel;
import com.example.projeto_aoe.repository.ManutencaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManutencaoService {

    @Autowired
    private ManutencaoRepository repository;

    public SolicitacaoManutencaoModel registrarSolicitacao(SolicitacaoManutencaoModel solicitacao) {
        // Aqui poderiam entrar regras de negócio, validações extras, etc.
        return repository.save(solicitacao);
    }

    public List<SolicitacaoManutencaoModel> listarTodas() {
        return repository.findAll();
    }


    public void deletarSolicitacao(Long id) {
        repository.deleteById(id);
    }


    public SolicitacaoManutencaoModel buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Solicitação não encontrada"));
    }
}