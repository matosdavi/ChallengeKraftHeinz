package org.example.entity;

import java.time.LocalDate;

public class Acao {

    private int idAcao;
    private String descAcao;
    private LocalDate dataAcao;

    public Acao(int idAcao, String descAcao, LocalDate data) {
        this.idAcao = idAcao;
        this.descAcao = descAcao;
        this.dataAcao = data;
    }

    public int getIdAcao() {
        return idAcao;
    }

    public void setIdAcao(int idAcao) {
        this.idAcao = idAcao;
    }

    public String getDescAcao() {
        return descAcao;
    }

    public void setDescAcao(String descAcao) {
        this.descAcao = descAcao;
    }

    public LocalDate getDataAcao() {
        return dataAcao;
    }

    public void setData(LocalDate dataAcao) {
        this.dataAcao = dataAcao;
    }
}