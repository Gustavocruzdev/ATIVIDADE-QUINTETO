package com.example.projeto_aoe.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_incidentes")
public class IncidenteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "A gravidade é obrigatória")
    private String gravidade;

    @NotNull(message = "A data e hora são obrigatórias")
    private LocalDateTime dataHora;

    @NotBlank(message = "A plataforma é obrigatória")
    private String plataforma;

    @NotBlank(message = "A descrição é obrigatória")
    @Column(columnDefinition = "TEXT")
    private String descricao;

    @NotBlank(message = "As ações imediatas são obrigatórias")
    @Column(columnDefinition = "TEXT")
    private String acoesImediatas;

    // Construtor Padrão (Obrigatório para o Hibernate)
    public IncidenteModel() {
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGravidade() {
        return gravidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAcoesImediatas() {
        return acoesImediatas;
    }

    public void setAcoesImediatas(String acoesImediatas) {
        this.acoesImediatas = acoesImediatas;
    }
}