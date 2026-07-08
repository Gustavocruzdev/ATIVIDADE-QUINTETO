package com.example.projeto_aoe.dto;

import com.example.projeto_aoe.model.ProducaoDiariaModel;

public class ProducaoDiariaResponseDTO {

    private Long id;
    private String plataforma;
    private String data;
    private int barrisPetroleo;
    private Double metrosCubicosGas;
    private Boolean metaAtingida; // <--- Alterado de int para Boolean

    public ProducaoDiariaResponseDTO() {
    }

    public ProducaoDiariaResponseDTO(Long id, String plataforma, String data, int barrisPetroleo, Double metrosCubicosGas, Boolean metaAtingida) {
        this.id = id;
        this.plataforma = plataforma;
        this.data = data;
        this.barrisPetroleo = barrisPetroleo;
        this.metrosCubicosGas = metrosCubicosGas;
        this.metaAtingida = metaAtingida;
    }

    // Corrigido: Agora preenche o DTO automaticamente quando o Service retornar o Model
    public ProducaoDiariaResponseDTO(ProducaoDiariaModel model) {
        this.id = model.getId();
        this.plataforma = model.getPlataforma();
        this.data = model.getData();
        this.barrisPetroleo = model.getBarrisPetroleo();
        this.metrosCubicosGas = model.getMetrosCubicosGas();
        this.metaAtingida = model.getMetaAtingida();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getBarrisPetroleo() {
        return barrisPetroleo;
    }

    public void setBarrisPetroleo(int barrisPetroleo) {
        this.barrisPetroleo = barrisPetroleo;
    }

    public Double getMetrosCubicosGas() {
        return metrosCubicosGas;
    }

    public void setMetrosCubicosGas(Double metrosCubicosGas) {
        this.metrosCubicosGas = metrosCubicosGas;
    }

    public Boolean getMetaAtingida() { // <--- Retorno alterado para Boolean
        return metaAtingida;
    }

    public void setMetaAtingida(Boolean metaAtingida) { // <--- Parâmetro alterado para Boolean
        this.metaAtingida = metaAtingida;
    }
}