/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.Filial;
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
public class FilialDAO {

    public void save(Filial filial) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("INSERT INTO filial (nome) VALUES (?);");
            stmt.setString(1, filial.getNome());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public List<Filial> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Filial> filiais = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM FILIAL");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Filial filial = new Filial();

                filial.setId(rs.getInt("idFilial"));
                filial.setNome(rs.getString("nome"));
                filiais.add(filial);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return filiais;
    }

    public List<Filial> search(String nome) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Filial> filiais = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM FILIAL WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Filial filial = new Filial();

                filial.setNome(rs.getString("nome"));
                filiais.add(filial);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return filiais;
    }

    public void update(Filial filial) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE FILIAL SET nome = ? WHERE id = ?");

            stmt.setString(1, filial.getNome());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public void delete(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM FILIAL WHERE id = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }
}
