package org.example.dao;

import org.example.entity.Consumo;
import org.example.entity.Fabrica;
import org.example.factory.ConnectionFactory;

import java.sql.*;

public class FabricaDAO {

    private Connection conexao;

    public FabricaDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Fabrica fabrica, Consumo consumo) throws SQLException {

        try {
            String sql = "insert into t_fabrica" +
                    "(cd_fabrica," +
                    "nm_usuario, " +
                    "id_consumo, " +
                    ") " +
                    "values" +
                    "(?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, fabrica.getIdFabrica());
            stmt.setString(2, fabrica.getNomeFabrica());
            stmt.setInt(3, consumo.getIdConsumo());

            stmt.execute();
            stmt.close();
        }  catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}