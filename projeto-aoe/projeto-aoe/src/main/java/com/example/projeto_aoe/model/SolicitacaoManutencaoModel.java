package com.example.projeto_aoe.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "solicitacoes_manutencao")
public class SolicitacaoManutencaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "equipamento_id", nullable = false)
    private String equipamentoId;

    @Column(nullable = false)
    private String criticidade;

    @Column(name = "descricao_falha", nullable = false, columnDefinition = "TEXT")
    private String descricaoFalha;

    @Column(name = "data_solicitacao")
    private LocalDateTime dataSolicitacao;

    @PrePersist
    protected void onCreate() {
        this.dataSolicitacao = LocalDateTime.now();
    }

    // --- GETTERS E SETTERS ABAIXO --- (Você pode gerar na IDE apertando Alt + Insert)

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