package com.example.projeto_aoe.dto;

public class EscalaTripulanteRequestDTO {

    private String plataforma;
    private String nomeFuncionario;
    private String funcao;
    private String dataInicio;
    private String dataFim;

    public EscalaTripulanteRequestDTO() {
    }

    public EscalaTripulanteRequestDTO(String plataforma, String nomeFuncionario, String funcao, String dataInicio, String dataFim) {
        this.plataforma = plataforma;
        this.nomeFuncionario = nomeFuncionario;
        this.funcao = funcao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
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