/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author johnathan.mbmata
 */
public class EstoqueDAO {

    public void save(Estoque estoque) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("INSERT INTO ESTOQUE(ID_PRODUTO, QUANTIDADE) VALUES (?,?);");

            stmt.setInt(1, estoque.getIdProduto());
            stmt.setInt(2, estoque.getQuantidade());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public List<Estoque> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Estoque> estoques = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT E.ID_PRODUTO, P.NOME, E.QUANTIDADE FROM ESTOQUE AS E JOIN PRODUTO AS P ON E.ID_PRODUTO = P.ID WHERE P.HABILITADO = 1");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Estoque estoque = new Estoque();

                estoque.setIdProduto(rs.getInt("ID_PRODUTO"));
                estoque.setNome(rs.getString("NOME"));
                estoque.setQuantidade(rs.getInt("QUANTIDADE"));

                estoques.add(estoque);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return estoques;
    }

    public Estoque searchID(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Estoque estoque = new Estoque();

        try {
            stmt = connection.prepareStatement("SELECT E.*, P.NOME FROM ESTOQUE AS E JOIN PRODUTO AS P ON E.ID_PRODUTO = P.ID WHERE ID_PRODUTO LIKE ?;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {

                estoque.setIdProduto(rs.getInt("ID_PRODUTO"));
                estoque.setQuantidade(rs.getInt("QUANTIDADE"));
                estoque.setNome(rs.getString("NOME"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return estoque;
    }

    public boolean update(Estoque estoque) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        boolean cond;

        try {
            stmt = connection.prepareStatement("UPDATE ESTOQUE SET QUANTIDADE = ? WHERE ID_PRODUTO = ?");

            stmt.setInt(1, estoque.getQuantidade());
            stmt.setInt(2, estoque.getIdProduto());

            stmt.executeUpdate();

            cond = true;

        } catch (SQLException ex) {
            Logger.getLogger(EstoqueDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }
        return cond;
    }

}
