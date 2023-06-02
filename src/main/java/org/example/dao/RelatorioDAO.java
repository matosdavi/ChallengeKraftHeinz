package org.example.dao;

import org.example.entity.Fabrica;
import org.example.entity.Relatorio;
import org.example.factory.ConnectionFactory;

import java.sql.*;

public class RelatorioDAO {

    private Connection conexao;

    public RelatorioDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Relatorio relatorio, Fabrica fabrica) throws SQLException {

        try {
            String sql = "insert into t_relatorio" +
                    "(id_relatorio," +
                    "ds_relatorio, "+
                    "dt_relatorio, " +
                    "id_fabrica" +
                    ") " +
                    "values" +
                    "(?, " +
                    "(?, " +
                    "(?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, relatorio.getIdRelatorio());
            stmt.setString(2, relatorio.getDescricao());
            stmt.setDate(3, Date.valueOf(relatorio.getData()));
            stmt.setInt(4, fabrica.getIdFabrica());

            stmt.execute();
            stmt.close();
        }  catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}