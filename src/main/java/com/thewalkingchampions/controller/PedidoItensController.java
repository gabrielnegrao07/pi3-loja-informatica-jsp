/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.PedidoItensDAO;
import com.thewalkingchampions.model.PedidoItens;

/**
 *
 * @author Johnathan
 */
public class PedidoItensController {

    public static void save(int idPedido, int idProduto, float valor, int quantidade) {
        PedidoItens itens = new PedidoItens(idPedido, idProduto, valor, quantidade);
        PedidoItensDAO dao = new PedidoItensDAO();
        dao.save(itens);
    }
}
