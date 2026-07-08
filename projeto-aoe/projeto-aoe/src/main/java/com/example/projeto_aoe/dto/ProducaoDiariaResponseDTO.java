package com.example.projeto_aoe.dto;

import com.example.projeto_aoe.model.ProducaoDiariaModel;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public class ProducaoDiariaResponseDTO {

    private Long id;
    private String plataforma;
    private String data;
    private int barrisPetroleo;
    private Double metrosCubicosGas;
    private int metaAtingida;

    public ProducaoDiariaResponseDTO() {
    }

    public ProducaoDiariaResponseDTO(Long id, String plataforma, String data, int barrisPetroleo, Double metrosCubicosGas, int metaAtingida) {
        this.id = id;
        this.plataforma = plataforma;
        this.data = data;
        this.barrisPetroleo = barrisPetroleo;
        this.metrosCubicosGas = metrosCubicosGas;
        this.metaAtingida = metaAtingida;
    }

    public ProducaoDiariaResponseDTO(ProducaoDiariaModel model) {
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

    public int getMetaAtingida() {
        return metaAtingida;
    }

    public void setMetaAtingida(int metaAtingida) {
        this.metaAtingida = metaAtingida;
    }

}