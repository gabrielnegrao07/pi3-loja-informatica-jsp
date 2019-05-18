/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.Categoria;
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
 * @author Johnathan
 */
public class CategoriaDAO {

    public boolean save(Categoria categoria) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        boolean cond;
        try {
            stmt = connection.prepareStatement("INSERT INTO CATEGORIA (nome) VALUES (?);");
            stmt.setString(1, categoria.getNome());

            stmt.executeUpdate();
            cond = true;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }

        return cond;
    }

    public List<Categoria> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Categoria> categorias = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM CATEGORIA");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();

                categoria.setId(rs.getInt("id"));
                categoria.setNome(rs.getString("nome"));
                categorias.add(categoria);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return categorias;
    }

    public List<Categoria> search(String nome) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Categoria> categorias = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM CATEGORIAS WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria categoria = new Categoria();

                categoria.setNome(rs.getString("nome"));
                categorias.add(categoria);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return categorias;
    }

    public Categoria searchID(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Categoria categoria = new Categoria();

        try {
            stmt = connection.prepareStatement("SELECT * FROM CATEGORIA WHERE ID LIKE ?;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {

                categoria.setId(rs.getInt("ID"));
                categoria.setNome(rs.getString("NOME"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return categoria;
    }

    public void update(Categoria categoria) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE CATEGORIA SET nome = ? WHERE id = ?");

            stmt.setString(1, categoria.getNome());
            stmt.setInt(2, categoria.getId());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public void delete(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM CATEGORIA WHERE id = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }
}
