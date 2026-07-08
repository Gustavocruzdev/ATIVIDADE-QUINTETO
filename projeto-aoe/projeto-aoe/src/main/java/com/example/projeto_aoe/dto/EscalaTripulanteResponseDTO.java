package com.example.projeto_aoe.dto;

import com.example.projeto_aoe.model.EscalaTripulanteModel;

public class EscalaTripulanteResponseDTO {

    private Long id;
    private String plataforma;
    private String nomeFuncionario;
    private String funcao;
    private String dataInicio;
    private String dataFim;

    public EscalaTripulanteResponseDTO() {
    }

    public EscalaTripulanteResponseDTO(Long id, String plataforma, String nomeFuncionario, String funcao, String dataInicio, String dataFim) {
        this.id = id;
        this.plataforma = plataforma;
        this.nomeFuncionario = nomeFuncionario;
        this.funcao = funcao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public EscalaTripulanteResponseDTO(EscalaTripulanteModel salvo) {
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

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }
}