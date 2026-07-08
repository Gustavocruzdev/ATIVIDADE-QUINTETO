package com.example.projeto_aoe.dto;

import java.time.LocalDateTime;

public class SolicitacaoManutencaoResponseDTO {

    private Long id;
    private String equipamentoId;
    private String criticidade;
    private String descricaoFalha;
    private LocalDateTime dataSolicitacao;

    // --- GETTERS E SETTERS ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEquipamentoId() { return equipamentoId; }
    public void setEquipamentoId(String equipamentoId) { this.equipamentoId = equipamentoId; }

    public String getCriticidade() { return criticidade; }
    public void setCriticidade(String criticidade) { this.criticidade = criticidade; }

    public String getDescricaoFalha() { return descricaoFalha; }
    public void setDescricaoFalha(String descricaoFalha) { this.descricaoFalha = descricaoFalha; }

    public LocalDateTime getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(LocalDateTime dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }
}