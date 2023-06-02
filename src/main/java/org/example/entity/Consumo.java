package org.example.entity;

import java.time.LocalDate;

public class Consumo {

    private int idConsumo;
    private String nomeConsumo;
    private String descConsumo;
    private LocalDate data;
    private double valorConsumo;

    public Consumo(String nome, LocalDate data, double valor) {
        this.nomeConsumo = nome;
        this.data = data;
        this.valorConsumo = valor;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public String getNomeConsumo() {
        return nomeConsumo;
    }

    public void setNomeConsumo(String nomeConsumo) {
        this.nomeConsumo = nomeConsumo;
    }

    public String getDescConsumo() {
        return descConsumo;
    }

    public void setDescConsumo(String descConsumo) {
        this.descConsumo = descConsumo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValorConsumo() {
        return valorConsumo;
    }

    public void setValorConsumo(double valorConsumo) {
        this.valorConsumo = valorConsumo;
    }
}