package org.example.entity;

import java.util.List;

public class Fabrica {

    private int idFabrica;
    private String nomeFabrica;
    private Endereco endereco;
    private  Consumo consumo;
    private List<Meta> metas;

    public Fabrica(int idFabrica, String nomeFabrica, Endereco endereco, Consumo consumo, List<Meta> metas) {
        this.idFabrica = idFabrica;
        this.nomeFabrica = nomeFabrica;
        this.endereco = endereco;
        this.consumo = consumo;
        this.metas = metas;
    }

    public int getIdFabrica() {
        return idFabrica;
    }

    public void setIdFabrica(int idFabrica) {
        this.idFabrica = idFabrica;
    }

    public String getNomeFabrica() {
        return nomeFabrica;
    }

    public void setNomeFabrica(String nomeFabrica) {
        this.nomeFabrica = nomeFabrica;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Consumo getConsumo() {
        return consumo;
    }

    public void setConsumo(Consumo consumo) {
        this.consumo = consumo;
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }
}