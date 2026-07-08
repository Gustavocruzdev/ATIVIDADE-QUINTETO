package com.example.projeto_aoe.repository;


import com.example.projeto_aoe.model.SolicitacaoManutencaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManutencaoRepository extends JpaRepository<SolicitacaoManutencaoModel, Long> {
}