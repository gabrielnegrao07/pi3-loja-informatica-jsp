/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.service;

import com.thewalkingchampions.dao.PedidoDAO;
import com.thewalkingchampions.model.Pedido;

/**
 *
 * @author Johnathan
 */
public class PedidoController {

    public static void save(int idCliente, float valorTotal, float desconto, float valor) {
        Pedido pedido = new Pedido(idCliente, valorTotal, desconto, valor);
        PedidoDAO dao = new PedidoDAO();
        dao.save(pedido);
    }

    public static Pedido searchID(int id) {
        PedidoDAO dao = new PedidoDAO();
        return dao.searchID(id);
    }
}
