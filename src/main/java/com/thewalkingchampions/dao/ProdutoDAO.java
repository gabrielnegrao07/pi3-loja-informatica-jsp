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

/**
 *
 * @author Johnathan
 */
public class ProdutoDAO {

    public void save(Produto produto) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("INSERT INTO PRODUTO(nome,descricao,valor,quantidade,habilitado) VALUES (?,?,?,?,?);");

            int habilitado;
            if (produto.isHabilitadoProduto() == true) 
            {
                habilitado = 1;
            } else {
                habilitado = 0;
            }

            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getDescricaoProduto());
            stmt.setFloat(3, produto.getValorProduto());
            stmt.setInt(4, produto.getQuantidadeProduto());
            stmt.setInt(5, habilitado);

            stmt.executeUpdate();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public List<Produto> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM PRODUTO");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setIdProduto(rs.getInt("id"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setDescricaoProduto(rs.getString("descricao"));
                produto.setValorProduto(rs.getFloat("valor"));
                produto.setQuantidadeProduto(rs.getInt("quantidade"));
                /*produto.setHabilitadoProduto(rs.getBoolean("habilitado"));
                produto.setIdCategoriaProduto(rs.getInt("idcategoria"));
                produto.setIdFilial(rs.getInt("idfilial"));*/

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
            stmt = connection.prepareStatement("SELECT * FROM PRODUTO WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setNomeProduto(rs.getString("nome"));
                produto.setDescricaoProduto(rs.getString("descricao"));
                produto.setValorProduto(rs.getFloat("valor"));
                produto.setQuantidadeProduto(rs.getInt("quantidade"));
                produto.setHabilitadoProduto(rs.getBoolean("habilitado"));
                produto.setIdCategoriaProduto(rs.getInt("idcategoria"));
                produto.setIdFilial(rs.getInt("idfilial"));

                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return produtos;
    }

    public void update(Produto produto) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("UPDATE PRODUTO SET nome = ?, descricao = ?, valor = ?, quantidade = ?, habilitado = ?, idcategoria = ?, idfilial = ? WHERE id = ?");

            stmt.setString(1, produto.getNomeProduto());
            stmt.setString(2, produto.getDescricaoProduto());
            stmt.setFloat(3, produto.getValorProduto());
            stmt.setInt(4, produto.getQuantidadeProduto());
            stmt.setBoolean(5, produto.isHabilitadoProduto());
            stmt.setInt(6, produto.getIdCategoriaProduto());
            stmt.setInt(7, produto.getIdFilial());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public void delete(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement("DELETE FROM PRODUTO WHERE id = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }
}
