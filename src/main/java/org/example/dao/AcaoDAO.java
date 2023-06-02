package org.example.dao;

import org.example.entity.Acao;
import org.example.factory.ConnectionFactory;

import java.sql.*;

public class AcaoDAO {

    private Connection conexao;

    public AcaoDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Acao acao) throws SQLException {

        try {
            String sql = "insert into t_acao" +
                    "(id_acao," +
                    "ds_acao, " +
                    "dt_acao " +
                    ") " +
                    "values" +
                    "(?, " +
                    "(?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, acao.getIdAcao());
            stmt.setString(2, acao.getDescAcao());
            stmt.setDate(3, Date.valueOf(acao.getDataAcao()));

            stmt.execute();
            stmt.close();
        }  catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}