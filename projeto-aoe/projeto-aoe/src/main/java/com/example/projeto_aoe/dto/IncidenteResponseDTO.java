package com.example.projeto_aoe.dto;

import com.example.projeto_aoe.model.IncidenteModel;
import java.time.LocalDateTime;

public record IncidenteResponseDTO(
        Long id,
        String gravidade,
        LocalDateTime dataHora,
        String plataforma,
        String descricao,
        String acoesImediatas
) {
    // Construtor que converte automaticamente o Modelo em DTO
    public IncidenteResponseDTO(IncidenteModel modelo) {
        this(
                modelo.getId(),
                modelo.getGravidade(),
                modelo.getDataHora(),
                modelo.getPlataforma(),
                modelo.getDescricao(),
                modelo.getAcoesImediatas()
        );
    }
}