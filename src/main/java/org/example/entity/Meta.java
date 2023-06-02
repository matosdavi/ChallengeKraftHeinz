package org.example.entity;

import java.time.LocalDate;

public class Meta {

    private int idMeta;
    private String nomeMeta;
    private String descMeta;
    private LocalDate prazoMeta;
    private Acao acao;
    private boolean status;

    public Meta(int idMeta, String nomeMeta, String descMeta, LocalDate prazoMeta, Acao acao, boolean status) {
        this.idMeta = idMeta;
        this.nomeMeta = nomeMeta;
        this.descMeta = descMeta;
        this.prazoMeta = prazoMeta;
        this.acao = acao;
        this.status = status;
    }

    public int getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(int idMeta) {
        this.idMeta = idMeta;
    }

    public String getNomeMeta() {
        return nomeMeta;
    }

    public void setNomeMeta(String nomeMeta) {
        this.nomeMeta = nomeMeta;
    }

    public String getDescMeta() {
        return descMeta;
    }

    public void setDescMeta(String descMeta) {
        this.descMeta = descMeta;
    }

    public LocalDate getPrazoMeta() {
        return prazoMeta;
    }

    public void setPrazoMeta(LocalDate prazoMeta) {
        this.prazoMeta = prazoMeta;
    }

    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}