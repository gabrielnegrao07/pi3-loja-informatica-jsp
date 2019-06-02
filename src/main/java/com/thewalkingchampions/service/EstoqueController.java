/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.service;

import com.thewalkingchampions.dao.EstoqueDAO;
import com.thewalkingchampions.model.Estoque;
import java.util.List;

/**
 *
 * @author johnathan.mbmata
 */
public class EstoqueController {

    public static void save(int id, int quantidade) {
        Estoque estoque = new Estoque(id, quantidade);
        EstoqueDAO dao = new EstoqueDAO();
        dao.save(estoque);
    }

    public static List<Estoque> listAll() {
        EstoqueDAO dao = new EstoqueDAO();
        return dao.listAll();
    }

    public static Estoque searchID(int id) {
        EstoqueDAO dao = new EstoqueDAO();
        return dao.searchID(id);
    }

    public static boolean update(int id, int quantidade) {
        Estoque estoque = new Estoque(id, quantidade);
        EstoqueDAO dao = new EstoqueDAO();
        return dao.update(estoque);
    }
}
