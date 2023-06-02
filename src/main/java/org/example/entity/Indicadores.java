package org.example.entity;

import java.util.List;

public class Indicadores {

    private double indicador1;
    private double indicador2;
    private int totalMetas;
    private int metasAlcancadas;
    private int metasNaoAlcancadas;
    private double porcentagemMetasAlcancadas;
    private double porcentagemMetasNaoAlcancadas;

    public Indicadores() {
    }

    public Indicadores(int indicador1, int indicador2) {
        this.indicador1 = indicador1;
        this.indicador2 = indicador2;
    }

    private Indicadores calcularIndicadores(List<Meta> metas) {
        int totalMetas = metas.size();
        int metasAlcancadas = 0;
        int metasNaoAlcancadas = 0;

        for (Meta meta : metas) {
            if (meta.isStatus()) {
                metasAlcancadas++;
            } else {
                metasNaoAlcancadas++;
            }
        }

        double porcentagemMetasAlcancadas = (metasAlcancadas / (double) totalMetas) * 100;
        double porcentagemMetasNaoAlcancadas = (metasNaoAlcancadas / (double) totalMetas) * 100;

        Indicadores indicadores = new Indicadores();
        indicadores.setTotalMetas(totalMetas);
        indicadores.setMetasAlcancadas(metasAlcancadas);
        indicadores.setMetasNaoAlcancadas(metasNaoAlcancadas);
        indicadores.setPorcentagemMetasAlcancadas(porcentagemMetasAlcancadas);
        indicadores.setPorcentagemMetasNaoAlcancadas(porcentagemMetasNaoAlcancadas);

        return indicadores;
    }

    public void setTotalMetas(int totalMetas) {
        this.totalMetas = totalMetas;
    }

    public int getTotalMetas() {
        return totalMetas;
    }

    public void setMetasAlcancadas(int metasAlcancadas) {
        this.metasAlcancadas = metasAlcancadas;
    }

    public int getMetasAlcancadas() {
        return metasAlcancadas;
    }

    public void setMetasNaoAlcancadas(int metasNaoAlcancadas) {
        this.metasNaoAlcancadas = metasNaoAlcancadas;
    }

    public int getMetasNaoAlcancadas() {
        return metasNaoAlcancadas;
    }

    public void setPorcentagemMetasAlcancadas(double porcentagemMetasAlcancadas) {
        this.porcentagemMetasAlcancadas = porcentagemMetasAlcancadas;
    }

    public double getPorcentagemMetasAlcancadas() {
        return porcentagemMetasAlcancadas;
    }

    public void setPorcentagemMetasNaoAlcancadas(double porcentagemMetasNaoAlcancadas) {
        this.porcentagemMetasNaoAlcancadas = porcentagemMetasNaoAlcancadas;
    }

    public double getPorcentagemMetasNaoAlcancadas() {
        return porcentagemMetasNaoAlcancadas;
    }
}