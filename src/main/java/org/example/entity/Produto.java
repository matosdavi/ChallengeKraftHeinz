package org.example.entity;

import java.util.List;

public class Produto {

    private int idProduto;
    private String nomeProduto;
    private List<Ingrediente> ingredientes;

    public Produto(int idProduto, String nome, List<Ingrediente> ingredientes) {
        this.idProduto = idProduto;
        this.nomeProduto = nome;
        this.ingredientes = ingredientes;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
}