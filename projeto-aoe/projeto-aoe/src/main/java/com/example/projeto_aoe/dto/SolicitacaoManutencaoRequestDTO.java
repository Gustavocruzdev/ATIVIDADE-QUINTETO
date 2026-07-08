package com.example.projeto_aoe.dto;

public class SolicitacaoManutencaoRequestDTO {

    private String equipamentoId;
    private String criticidade;
    private String descricaoFalha;

    // --- GETTERS E SETTERS ---
    public String getEquipamentoId() { return equipamentoId; }
    public void setEquipamentoId(String equipamentoId) { this.equipamentoId = equipamentoId; }

    public String getCriticidade() { return criticidade; }
    public void setCriticidade(String criticidade) { this.criticidade = criticidade; }

    public String getDescricaoFalha() { return descricaoFalha; }
    public void setDescricaoFalha(String descricaoFalha) { this.descricaoFalha = descricaoFalha; }
}