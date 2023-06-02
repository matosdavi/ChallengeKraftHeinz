package org.example.entity;

public class Ingrediente {

    private int idIngrediente;
    private String nomeIngrediente;
    private double quantidadeIngrediente;
    private boolean sustentavel;

    public Ingrediente(int idIngrediente, String nome, double quantidade, boolean sustentavel) {
        this.idIngrediente = idIngrediente;
        this.nomeIngrediente = nome;
        this.quantidadeIngrediente = quantidade;
        this.sustentavel = sustentavel;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNomeIngrediente() {
        return nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public double getQuantidadeIngrediente() {
        return quantidadeIngrediente;
    }

    public void setQuantidadeIngrediente(double quantidadeIngrediente) {
        this.quantidadeIngrediente = quantidadeIngrediente;
    }

    public boolean isSustentavel() {
        return sustentavel;
    }

    public void setSustentavel(boolean sustentavel) {
        this.sustentavel = sustentavel;
    }
}