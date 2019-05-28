/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.PedidoItens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

public class PedidoItensDAO {

    public void save(PedidoItens itens) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("INSERT INTO ITENSPEDIDOS(ID_PEDIDO, ID_PRODUTO, VALOR, QUANTIDADE) VALUES (?,?,?,?);");

            stmt.setInt(1, itens.getIdPedido());
            stmt.setInt(2, itens.getIdProduto());
            stmt.setFloat(3, itens.getValor());
            stmt.setInt(4, itens.getQuantidade());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PedidoItensDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }
}
