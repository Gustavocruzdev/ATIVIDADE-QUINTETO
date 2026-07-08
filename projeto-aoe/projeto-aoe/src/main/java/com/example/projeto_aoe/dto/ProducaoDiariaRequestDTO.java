package com.example.projeto_aoe.dto;

public class ProducaoDiariaRequestDTO {

    private String plataforma;
    private String data;
    private int barrisPetroleo;
    private Double metrosCubicosGas;
    private Boolean metaAtingida; // <--- Alterado de int para Boolean

    public ProducaoDiariaRequestDTO() {
    }

    public ProducaoDiariaRequestDTO(String plataforma, String data, int barrisPetroleo, Double metrosCubicosGas, Boolean metaAtingida) {
        this.plataforma = plataforma;
        this.data = data;
        this.barrisPetroleo = barrisPetroleo;
        this.metrosCubicosGas = metrosCubicosGas;
        this.metaAtingida = metaAtingida;
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