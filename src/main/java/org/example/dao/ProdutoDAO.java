package org.example.dao;

import org.example.entity.Marca;
import org.example.entity.Produto;
import org.example.factory.ConnectionFactory;

import java.sql.*;

public class ProdutoDAO {

    private Connection conexao;

    public ProdutoDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Produto produto, Marca marca) throws SQLException {

        try {
            String sql = "insert into t_produto" +
                    "(id_produto," +
                    "nm_produto, " +
                    "id_marca" +
                    ") " +
                    "values" +
                    "(?, " +
                    "(?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, produto.getIdProduto());
            stmt.setString(2, produto.getNomeProduto());
            stmt.setInt(3, marca.getIdMarca());

            stmt.execute();
            stmt.close();
        }  catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}