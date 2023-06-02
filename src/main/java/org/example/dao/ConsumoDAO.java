package org.example.dao;

import org.example.entity.Consumo;
import org.example.entity.Fabrica;
import org.example.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class ConsumoDAO {

    private Connection conexao;

    public ConsumoDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Consumo consumo, Fabrica fabrica) throws SQLException {

        try {
            String sql = "insert into t_consumo" +
                    "(id_fabrica," +
                    "(id_consumo," +
                    "nm_consumo, "+
                    "ds_consumo, " +
                    "vl_consumo, " +
                    ") " +
                    "values" +
                    "(?, " +
                    "(?, " +
                    "(?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, fabrica.getIdFabrica());
            stmt.setInt(2, consumo.getIdConsumo());
            stmt.setString(3, consumo.getNomeConsumo());
            stmt.setString(4, consumo.getDescConsumo());
            stmt.setDouble(5, consumo.getValorConsumo());

            stmt.execute();
            stmt.close();
        }  catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}