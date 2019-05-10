/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.Login;
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
public class LoginDAO {

    public void save(Login login) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("INSERT INTO login (idfuncionario,login,senha,permicao,habilitado) VALUES (?,?,?,?,?);");
            stmt.setInt(1, login.getIdFuncionario());
            stmt.setString(2, login.getLogin());
            stmt.setString(3, login.getSenha());
            stmt.setInt(4, login.getPermicao());
            stmt.setBoolean(5, login.isHabilitado());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public List<Login> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Login> logins = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM LOGIN");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Login login = new Login();

                login.setIdLogin(rs.getInt("idLogin"));
                login.setIdFuncionario(rs.getInt("idFuncionario"));
                login.setLogin(rs.getString("login"));
                login.setSenha(rs.getString("senha"));
                login.setPermicao(rs.getInt("permicao"));
                login.setHabilitado(rs.getBoolean("habilitado"));
                logins.add(login);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return logins;
    }

    public List<Login> search(String nome) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Login> logins = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM LOGIN WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Login login = new Login();

                login.setIdFuncionario(rs.getInt("idFuncionario"));
                login.setLogin(rs.getString("login"));
                login.setSenha(rs.getString("senha"));
                login.setPermicao(rs.getInt("permicao"));
                login.setHabilitado(rs.getBoolean("habilitado"));

                logins.add(login);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return logins;
    }

    public boolean searchOne(String nome, String senha) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean condicao = false;

        try {
            stmt = connection.prepareStatement("SELECT * FROM LOGIN WHERE login = ? AND senha = ?;");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                condicao = true;
            } 

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return condicao;
    }

    public void update(Login login) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE LOGIN SET idfuncionario = ?, login = ?, senha = ?, permicao = ?, habilitado = ? WHERE id = ?");

            stmt.setInt(1, login.getIdFuncionario());
            stmt.setString(2, login.getLogin());
            stmt.setString(3, login.getSenha());
            stmt.setInt(4, login.getPermicao());
            stmt.setBoolean(5, login.isHabilitado());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public void delete(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM LOGIN WHERE id = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }
}
