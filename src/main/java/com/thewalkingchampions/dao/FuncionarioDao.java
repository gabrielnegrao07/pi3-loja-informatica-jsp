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
            stmt = connection.prepareStatement("INSERT INTO funcionario (NOME, CPF, RG, ENDERECO, NUMERO, COMPLEMENTO, CIDADE, BAIRRO, ESTADO, CEP, EMAIL, TELEFONE, CELULAR, FILIAL, CARGO, HABILITADO) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getRg());
            stmt.setString(4, funcionario.getEndereco());
            stmt.setString(5, funcionario.getNumero());
            stmt.setString(6, funcionario.getComplemento());
            stmt.setString(7, funcionario.getCidade());
            stmt.setString(8, funcionario.getBairro());
            stmt.setString(9, funcionario.getEstado());
            stmt.setString(10, funcionario.getCep());
            stmt.setString(11, funcionario.getEmail());
            stmt.setString(12, funcionario.getTelefone());
            stmt.setString(13, funcionario.getCelular());
            stmt.setInt(14, funcionario.getFilial());
            stmt.setString(15, funcionario.getCargo());
            stmt.setBoolean(16, funcionario.isHabilitado());

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
            stmt = connection.prepareStatement("SELECT * FROM funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setId(rs.getInt("ID"));
                funcionario.setNome(rs.getString("NOME"));
                funcionario.setCpf(rs.getString("CPF"));
                funcionario.setRg(rs.getString("RG"));
                funcionario.setEndereco(rs.getString("ENDERECO"));
                funcionario.setNumero(rs.getString("NUMERO"));
                funcionario.setComplemento(rs.getString("COMPLEMENTO"));
                funcionario.setCidade(rs.getString("CIDADE"));
                funcionario.setBairro(rs.getString("BAIRRO"));
                funcionario.setEstado(rs.getString("ESTADO"));
                funcionario.setCep(rs.getString("CEP"));
                funcionario.setEmail(rs.getString("EMAIL"));
                funcionario.setTelefone(rs.getString("TELEFONE"));
                funcionario.setCelular(rs.getString("CELULAR"));
                funcionario.setFilial(rs.getInt("FILIAL"));
                funcionario.setCargo(rs.getString("CARGO"));
                funcionario.setHabilitado(rs.getBoolean("HABILITADO"));

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
            stmt = connection.prepareStatement("SELECT * FROM funcionario WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario funcionario = new Funcionario();

                funcionario.setNome(rs.getString("NOME"));
                funcionario.setCpf(rs.getString("CPF"));
                funcionario.setRg(rs.getString("RG"));
                funcionario.setEndereco(rs.getString("ENDERECO"));
                funcionario.setNumero(rs.getString("NUMERO"));
                funcionario.setComplemento(rs.getString("COMPLEMENTO"));
                funcionario.setCidade(rs.getString("CIDADE"));
                funcionario.setBairro(rs.getString("BAIRRO"));
                funcionario.setEstado(rs.getString("ESTADO"));
                funcionario.setCep(rs.getString("CEP"));
                funcionario.setEmail(rs.getString("EMAIL"));
                funcionario.setTelefone(rs.getString("TELEFONE"));
                funcionario.setCelular(rs.getString("CELULAR"));
                funcionario.setFilial(rs.getInt("FILIAL"));
                funcionario.setCargo(rs.getString("CARGO"));
                funcionario.setHabilitado(rs.getBoolean("HABILITADO"));

                funcionarios.add(funcionario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return funcionarios;
    }

    public Funcionario searchID(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Funcionario funcionario = new Funcionario();

        try {
            stmt = connection.prepareStatement("SELECT * FROM funcionario WHERE ID LIKE ?;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {

                funcionario.setId(rs.getInt("ID"));
                funcionario.setNome(rs.getString("NOME"));
                funcionario.setCpf(rs.getString("CPF"));
                funcionario.setRg(rs.getString("RG"));
                funcionario.setEndereco(rs.getString("ENDERECO"));
                funcionario.setNumero(rs.getString("NUMERO"));
                funcionario.setComplemento(rs.getString("COMPLEMENTO"));
                funcionario.setCidade(rs.getString("CIDADE"));
                funcionario.setBairro(rs.getString("BAIRRO"));
                funcionario.setEstado(rs.getString("ESTADO"));
                funcionario.setCep(rs.getString("CEP"));
                funcionario.setEmail(rs.getString("EMAIL"));
                funcionario.setTelefone(rs.getString("TELEFONE"));
                funcionario.setCelular(rs.getString("CELULAR"));
                funcionario.setFilial(rs.getInt("FILIAL"));
                funcionario.setBairro(rs.getString("BAIRRO"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return funcionario;
    }

    public boolean update(Funcionario funcionario) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        boolean cond;

        try {
            stmt = connection.prepareStatement("UPDATE funcionario SET NOME = ?, CPF = ?, RG = ?, ENDERECO = ?, NUMERO = ?, COMPLEMENTO = ?, CIDADE = ?, BAIRRO = ?, ESTADO = ?, CEP = ?, EMAIL = ?, TELEFONE = ?, CELULAR = ? , FILIAL = ?, CARGO = ?, HABILITADO = ? WHERE ID = ?");

            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getRg());
            stmt.setString(4, funcionario.getEndereco());
            stmt.setString(5, funcionario.getNumero());
            stmt.setString(6, funcionario.getComplemento());
            stmt.setString(7, funcionario.getCidade());
            stmt.setString(8, funcionario.getBairro());
            stmt.setString(9, funcionario.getEstado());
            stmt.setString(10, funcionario.getCep());
            stmt.setString(11, funcionario.getEmail());
            stmt.setString(12, funcionario.getTelefone());
            stmt.setString(13, funcionario.getCelular());
            stmt.setInt(14, funcionario.getFilial());
            stmt.setString(15, funcionario.getCargo());
            stmt.setBoolean(16, funcionario.isHabilitado());
            stmt.setInt(17, funcionario.getId());

            stmt.executeUpdate();

            cond = true;

        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }

        return cond;
    }

    public void delete(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM funcionario WHERE id = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }
}
