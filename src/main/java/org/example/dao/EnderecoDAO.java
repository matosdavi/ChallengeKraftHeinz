package org.example.dao;

import org.example.entity.Endereco;
import org.example.entity.Fabrica;
import org.example.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

public class EnderecoDAO {

    private Connection conexao;

    public EnderecoDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Endereco endereco, Fabrica fabrica) throws SQLException {

        try {
            String sql = "insert into t_endereco" +
                    "(id_endereco," +
                    "ds_logradouro, " +
                    "ds_bairro, " +
                    "ds_cidade, " +
                    "ds_estado, " +
                    "ds_pais, " +
                    "id_fabrica" +
                    ") " +
                    "values" +
                    "(?, " +
                    "(?, " +
                    "(?, " +
                    "(?, " +
                    "(?, " +
                    "(?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, endereco.getIdEndereco());
            stmt.setString(2, endereco.getLogradouro());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, endereco.getCidade());
            stmt.setString(5, endereco.getEstado());
            stmt.setString(6, endereco.getPais());
            stmt.setInt(7, fabrica.getIdFabrica());

            stmt.execute();
            stmt.close();
        } catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}