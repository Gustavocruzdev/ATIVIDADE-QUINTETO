package com.example.projeto_aoe.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

public record IncidenteRequestDTO(
        @NotBlank(message = "A gravidade é obrigatória")
        String gravidade,

        @NotNull(message = "A data e hora são obrigatórias")
        LocalDateTime dataHora,

        @NotBlank(message = "A plataforma é obrigatória")
        String plataforma,

        @NotBlank(message = "A descrição é obrigatória")
        String descricao,

        @NotBlank(message = "As ações imediatas são obrigatórias")
        String acoesImediatas
) {}