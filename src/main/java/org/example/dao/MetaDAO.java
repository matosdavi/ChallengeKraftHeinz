package org.example.dao;

import org.example.entity.Meta;
import org.example.factory.ConnectionFactory;

import java.sql.*;

public class MetaDAO {

    private Connection conexao;

    public MetaDAO() throws ClassNotFoundException {
        this.conexao = new ConnectionFactory().conectar();
    }

    public void insert(Meta meta) throws SQLException {

        try {
            String sql = "insert into t_meta" +
                    "(id_meta," +
                    "nm_meta, " +
                    "ds_meta, " +
                    "dt_prazo, " +
                    "in_status, " +
                    ") " +
                    "values" +
                    "(?, " +
                    "?, " +
                    "?, " +
                    "?, " +
                    "?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, meta.getIdMeta());
            stmt.setString(2, meta.getNomeMeta());
            stmt.setString(3, meta.getDescMeta());
            stmt.setDate(4, Date.valueOf(meta.getPrazoMeta()));
            stmt.setBoolean(5, meta.isStatus());

            stmt.execute();
            stmt.close();
        }  catch (SQLSyntaxErrorException t) {
            System.out.println("Tabela não existente...");
            throw new RuntimeException(t);
        }
    }
}