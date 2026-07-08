package com.example.projeto_aoe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "escala_tripulante")
public class EscalaTripulanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String plataforma;

    @Column(name = "nome_funcionario", nullable = false)
    private String nomeFuncionario;

    @Column(nullable = false)
    private String funcao;

    @Column(name = "data_inicio", nullable = false)
    private String dataInicio;

    @Column(name = "data_fim", nullable = false)
    private String dataFim;

    public EscalaTripulanteModel() {
    }

    public EscalaTripulanteModel(Long id, String plataforma, String nomeFuncionario, String funcao, String dataInicio, String dataFim) {
        this.id = id;
        this.plataforma = plataforma;
        this.nomeFuncionario = nomeFuncionario;
        this.funcao = funcao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
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