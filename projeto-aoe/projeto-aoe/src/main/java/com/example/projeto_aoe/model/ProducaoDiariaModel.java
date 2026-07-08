package com.example.projeto_aoe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_producaodiaria")
public class ProducaoDiariaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String plataforma;

    @Column(nullable = false)
    private String data;

    @Column(name = "barris_petroleo", nullable = false)
    private int barrisPetroleo;

    @Column(name = "metros_cubicos_gas", nullable = false)
    private double metrosCubicosGas;

    @Column(name = "meta_atingida", nullable = false)
    private Boolean metaAtingida; // <--- Alterado de int para Boolean

    public ProducaoDiariaModel() {
    }

    public ProducaoDiariaModel(Long id, String plataforma, String data, int barrisPetroleo, double metrosCubicosGas, Boolean metaAtingida) {
        this.id = id;
        this.plataforma = plataforma;
        this.data = data;
        this.barrisPetroleo = barrisPetroleo;
        this.metrosCubicosGas = metrosCubicosGas;
        this.metaAtingida = metaAtingida;
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

    public double getMetrosCubicosGas() {
        return metrosCubicosGas;
    }

    public void setMetrosCubicosGas(double metrosCubicosGas) {
        this.metrosCubicosGas = metrosCubicosGas;
    }

    public Boolean getMetaAtingida() { // <--- Alterado o retorno para Boolean
        return metaAtingida;
    }

    public void setMetaAtingida(Boolean metaAtingida) { // <--- Corrigido o método que estava vazio
        this.metaAtingida = metaAtingida;
    }
}