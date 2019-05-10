/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.Funcionario;
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
public class FuncionarioDao {

    public void save(Funcionario funcionario) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("INSERT INTO FUNCIONARIO(nome,cpf,telefone,email) VALUES (?,?,?,?);");
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getEmail());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public List<Funcionario> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM FUNCIONARIO");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setEmail(rs.getString("email"));

                funcionarios.add(funcionario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return funcionarios;
    }

    public List<Funcionario> search(String nome) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM FUNCIONARIO WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setNome(rs.getString("nome"));
                funcionario.setCpf(rs.getString("cpf"));
                funcionario.setTelefone(rs.getString("telefone"));
                funcionario.setEmail(rs.getString("email"));

                funcionarios.add(funcionario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return funcionarios;
    }

    public void update(Funcionario funcionario) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE FUNCIONARIO SET nome = ?, cpf = ?, telefone = ?, email = ? WHERE id = ?");

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getTelefone());
            stmt.setString(4, funcionario.getEmail());
            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public void delete(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM FUNCIONARIO WHERE id = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }
}
