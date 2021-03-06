/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAO {

    public boolean save(Produto produto) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        boolean cond;
        try {
            stmt = connection.prepareStatement("INSERT INTO produto(NOME, VALOR, DESCRICAO, CATEGORIA, FILIAL, HABILITADO) VALUES (?,?,?,?,?,?);");

            stmt.setString(1, produto.getNome());
            stmt.setFloat(2, produto.getValor());
            stmt.setString(3, produto.getDescricao());
            stmt.setInt(4, produto.getCategoria());
            stmt.setInt(5, produto.getFilial());
            stmt.setBoolean(6, produto.isHabilitado());

            stmt.executeUpdate();
            cond = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }

        return cond;
    }

    public List<Produto> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT p.*, c.NOME, f.NOME FROM produto AS p INNER JOIN categoria AS C INNER JOIN filial f ON p.categoria = c.ID AND p.filial = f.ID;");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setId(rs.getInt("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setValor(rs.getFloat("VALOR"));
                produto.setDescricao(rs.getString("DESCRICAO"));
                produto.setCategoria(rs.getInt("CATEGORIA"));
                produto.setFilial(rs.getInt("FILIAL"));
                produto.setHabilitado(rs.getBoolean("HABILITADO"));

                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return produtos;
    }

    public List<Produto> search(String nome) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM produto WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setId(rs.getInt("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setValor(rs.getFloat("VALOR"));
                produto.setDescricao(rs.getString("DESCRICAO"));
                produto.setCategoria(rs.getInt("CATEGORIA"));
                produto.setFilial(rs.getInt("FILIAL"));
                produto.setHabilitado(rs.getBoolean("HABILITADO"));

                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return produtos;
    }

    public Produto searchID(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Produto produto = new Produto();

        try {
            stmt = connection.prepareStatement("SELECT * FROM produto WHERE ID LIKE ?;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {

                produto.setId(rs.getInt("ID"));
                produto.setNome(rs.getString("NOME"));
                produto.setValor(rs.getFloat("VALOR"));
                produto.setDescricao(rs.getString("DESCRICAO"));
                produto.setCategoria(rs.getInt("CATEGORIA"));
                produto.setFilial(rs.getInt("FILIAL"));
                produto.setHabilitado(rs.getBoolean("HABILITADO"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return produto;
    }

    public Produto searchEstoqueID(String nome, int filial) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Produto produto = new Produto();

        try {
            stmt = connection.prepareStatement("SELECT ID FROM produto WHERE NOME LIKE ? AND FILIAL LIKE ?;");
            stmt.setString(1, nome);
            stmt.setInt(2, filial);
            rs = stmt.executeQuery();

            while (rs.next()) {
                produto.setId(rs.getInt("ID"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return produto;
    }

    public boolean update(Produto produto) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        boolean cond;

        try {
            stmt = connection.prepareStatement("UPDATE produto SET NOME = ?, VALOR = ?, DESCRICAO = ?, CATEGORIA = ?, FILIAL = ?, HABILITADO = ? WHERE ID = ?");

            stmt.setString(1, produto.getNome());
            stmt.setFloat(2, produto.getValor());
            stmt.setString(3, produto.getDescricao());
            stmt.setInt(4, produto.getCategoria());
            stmt.setInt(5, produto.getFilial());
            stmt.setBoolean(6, produto.isHabilitado());
            stmt.setInt(7, produto.getId());
            stmt.executeUpdate();

            cond = true;

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            stmt = connection.prepareStatement("DELETE FROM produto WHERE id = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }
}
