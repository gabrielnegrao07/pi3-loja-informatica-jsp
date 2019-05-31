/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Johnathan
 */
public class PedidoDAO {

    public void save(Pedido pedido) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = connection.prepareStatement("INSERT INTO PEDIDO(ID_CLIENTE, VALORTOTAL, DESCONTO, VALOR) VALUES (?,?,?,?);");

            stmt.setInt(1, pedido.getIdCliente());
            stmt.setFloat(2, pedido.getValorTotal());
            stmt.setFloat(3, pedido.getDesconto());
            stmt.setFloat(4, pedido.getValor());

            stmt.executeUpdate();

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt);
        }
    }

    public Pedido searchID(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Pedido pedido = new Pedido();

        try {
            stmt = connection.prepareStatement("SELECT ID FROM PEDIDO WHERE ID_CLIENTE LIKE ? ORDER BY ID DESC;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {

                pedido.setId(rs.getInt("ID"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return pedido;
    }
}
