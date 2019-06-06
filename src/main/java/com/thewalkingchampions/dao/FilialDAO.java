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

public class FilialDAO {

    public boolean save(Filial filial) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        boolean cond;
        try {
            stmt = connection.prepareStatement("INSERT INTO filial (NOME, CNPJ, IE, ENDERECO, NUMERO, COMPLEMENTO, BAIRRO, CIDADE, ESTADO, CEP, EMAIL, TELEFONE, HABILITADO) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, filial.getNome());
            stmt.setString(2, filial.getCnpj());
            stmt.setString(3, filial.getIe());
            stmt.setString(4, filial.getEndereco());
            stmt.setString(5, filial.getNumero());
            stmt.setString(6, filial.getComplemento());
            stmt.setString(7, filial.getBairro());
            stmt.setString(8, filial.getCidade());
            stmt.setString(9, filial.getEstado());
            stmt.setString(10, filial.getCep());
            stmt.setString(11, filial.getEmail());
            stmt.setString(12, filial.getTelefone());
            stmt.setBoolean(13, filial.isHabilitado());

            stmt.executeUpdate();
            cond = true;

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }

        return cond;
    }

    public List<Filial> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Filial> filiais = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM filial");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Filial filial = new Filial();

                filial.setId(rs.getInt("ID"));
                filial.setNome(rs.getString("NOME"));
                filial.setCnpj(rs.getString("CNPJ"));
                filial.setIe(rs.getString("IE"));
                filial.setEndereco(rs.getString("ENDERECO"));
                filial.setNumero(rs.getString("NUMERO"));
                filial.setComplemento(rs.getString("COMPLEMENTO"));
                filial.setBairro(rs.getString("BAIRRO"));
                filial.setCidade(rs.getString("CIDADE"));
                filial.setEstado(rs.getString("ESTADO"));
                filial.setCep(rs.getString("CEP"));
                filial.setEmail(rs.getString("EMAIL"));
                filial.setTelefone(rs.getString("TELEFONE"));
                filial.setHabilitado(rs.getBoolean("HABILITADO"));
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
            stmt = connection.prepareStatement("SELECT * FROM filial WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Filial filial = new Filial();

                filial.setId(rs.getInt("ID"));
                filial.setNome(rs.getString("NOME"));
                filial.setCnpj(rs.getString("CNPJ"));
                filial.setIe(rs.getString("IE"));
                filial.setEndereco(rs.getString("ENDERECO"));
                filial.setNumero(rs.getString("NUMERO"));
                filial.setComplemento(rs.getString("COMPLEMENTO"));
                filial.setBairro(rs.getString("BAIRRO"));
                filial.setCidade(rs.getString("CIDADE"));
                filial.setEstado(rs.getString("ESTADO"));
                filial.setCep(rs.getString("CEP"));
                filial.setEmail(rs.getString("EMAIL"));
                filial.setTelefone(rs.getString("TELEFONE"));
                filial.setHabilitado(rs.getBoolean("HABILITADO"));
                filiais.add(filial);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return filiais;
    }

    public Filial searchID(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Filial filial = new Filial();

        try {
            stmt = connection.prepareStatement("SELECT * FROM filial WHERE ID LIKE ?;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {

                filial.setId(rs.getInt("ID"));
                filial.setNome(rs.getString("NOME"));
                filial.setCnpj(rs.getString("CNPJ"));
                filial.setIe(rs.getString("IE"));
                filial.setEndereco(rs.getString("ENDERECO"));
                filial.setNumero(rs.getString("NUMERO"));
                filial.setComplemento(rs.getString("COMPLEMENTO"));
                filial.setBairro(rs.getString("BAIRRO"));
                filial.setCidade(rs.getString("CIDADE"));
                filial.setEstado(rs.getString("ESTADO"));
                filial.setCep(rs.getString("CEP"));
                filial.setEmail(rs.getString("EMAIL"));
                filial.setTelefone(rs.getString("TELEFONE"));
                filial.setHabilitado(rs.getBoolean("HABILITADO"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return filial;
    }

    public boolean update(Filial filial) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        
        boolean cond;

        try {
            stmt = connection.prepareStatement("UPDATE filial SET NOME = ?, CNPJ = ?, IE = ?, ENDERECO = ?, NUMERO = ?, COMPLEMENTO = ?, BAIRRO = ?, CIDADE = ?, ESTADO = ?, CEP = ?, EMAIL = ?, TELEFONE = ?, HABILITADO = ? WHERE ID = ?");

            stmt.setString(1, filial.getNome());
            stmt.setString(2, filial.getCnpj());
            stmt.setString(3, filial.getIe());
            stmt.setString(4, filial.getEndereco());
            stmt.setString(5, filial.getNumero());
            stmt.setString(6, filial.getComplemento());
            stmt.setString(7, filial.getBairro());
            stmt.setString(8, filial.getCidade());
            stmt.setString(9, filial.getEstado());
            stmt.setString(10, filial.getCep());
            stmt.setString(11, filial.getEmail());
            stmt.setString(12, filial.getTelefone());
            stmt.setBoolean(13, filial.isHabilitado());
            stmt.setInt(14, filial.getId());
            stmt.executeUpdate();
            
            cond = true;

        } catch (SQLException ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }
        
        return cond;
    }

    public boolean delete(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        boolean cond;

        try {
            stmt = connection.prepareStatement("DELETE FROM filial WHERE ID = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();

            cond = true;
        } catch (SQLException ex) {
            Logger.getLogger(FilialDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }

        return cond;
    }
}
