package org.example.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Monitoramento {
    private List<Fabrica> fabricas;

    public Monitoramento() {
    }

    public Monitoramento(List<Fabrica> fabricas) {
        this.fabricas = fabricas;
    }

    public void gerarRelatorio() {
        List<Relatorio> relatorios = new ArrayList<>();

        for (Fabrica fabrica : fabricas) {
            Relatorio relatorio = new Relatorio();
            relatorio.setFabrica(fabrica);
            relatorio.setDescricao("Relatório de monitoramento da fábrica " + fabrica.getNomeFabrica() + ".");
            relatorio.setData(LocalDate.now());

            List<Meta> metas = fabrica.getMetas();

            Indicadores indicadores = calcularIndicadores(metas);
            relatorio.setIndicadores(indicadores);

            relatorios.add(relatorio);
        }

        for (Relatorio relatorio : relatorios) {
            System.out.println(relatorio.toString());
        }
    }

    private Indicadores calcularIndicadores(List<Meta> metas) {

        return new Indicadores();
    }
}