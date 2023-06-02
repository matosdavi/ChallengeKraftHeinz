package org.example.entity;

import java.util.List;

public class Marca {

    private int idMarca;
    private String nomeMarca;
    private Produto produto;
    private List<Meta> metas;

    public Marca(int idMarca, String nome, Produto produto, List<Meta> metas) {
        this.idMarca = idMarca;
        this.nomeMarca = nome;
        this.produto = produto;
        this.metas = metas;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Meta> getMetas() {
        return metas;
    }

    public void setMetas(List<Meta> metas) {
        this.metas = metas;
    }
}