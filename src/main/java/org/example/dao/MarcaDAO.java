package org.example.dao;

import org.example.entity.Marca;
import org.example.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class MarcaDAO {

    private Connection conexao;

    public MarcaDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Marca marca) throws SQLException {

        try {
            String sql = "insert into t_marca" +
                    "(id_marca," +
                    "nm_marca, " +
                    ") " +
                    "values" +
                    "(?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, marca.getIdMarca());
            stmt.setString(2, marca.getNomeMarca());

            stmt.execute();
            stmt.close();
        }  catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}