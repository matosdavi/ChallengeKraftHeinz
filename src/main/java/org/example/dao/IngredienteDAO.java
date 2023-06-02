package org.example.dao;

import org.example.entity.Ingrediente;
import org.example.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class IngredienteDAO {

    private Connection conexao;

    public IngredienteDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Ingrediente ingrediente) throws SQLException {

        try {
            String sql = "insert into t_ingrediente" +
                    "(cd_ingrediente," +
                    "nm_ingrediente, " +
                    "qt_ingrediente " +
                    "in_sustentavel" +
                    ") " +
                    "values" +
                    "(?, " +
                    "(?, " +
                    "(?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, ingrediente.getIdIngrediente());
            stmt.setString(2, ingrediente.getNomeIngrediente());
            stmt.setDouble(3, ingrediente.getQuantidadeIngrediente());
            stmt.setBoolean(4, ingrediente.isSustentavel());

            stmt.execute();
            stmt.close();
        }  catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}