package org.example.entity;

import java.time.LocalDate;

public class Relatorio {

    private int idRelatorio;
    private String descricao;
    private LocalDate data;
    private Fabrica fabrica;
    private Indicadores indicadores;

    public Relatorio() {
    }

    public Relatorio(int idRelatorio, String descricao, LocalDate data, Fabrica fabrica, Indicadores indicadores) {
        this.idRelatorio = idRelatorio;
        this.descricao = descricao;
        this.data = data;
        this.fabrica = fabrica;
        this.indicadores = indicadores;
    }

    public int getIdRelatorio() {
        return idRelatorio;
    }

    public void setIdRelatorio(int idRelatorio) {
        this.idRelatorio = idRelatorio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Fabrica getFabrica() {
        return fabrica;
    }

    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }

    public Indicadores getIndicadores() {
        return indicadores;
    }

    public void setIndicadores(Indicadores indicadores) {
        this.indicadores = indicadores;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "idRelatorio=" + idRelatorio +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", fabrica=" + fabrica +
                ", indicadores=" + indicadores +
                '}';
    }
}