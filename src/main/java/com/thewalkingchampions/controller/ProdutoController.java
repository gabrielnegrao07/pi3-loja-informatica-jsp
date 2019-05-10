/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.ProdutoDAO;
import com.thewalkingchampions.model.Produto;
import java.util.List;

/**
 *
 * @author Johnathan
 */
public class ProdutoController {

    public static void save(String nome, String descricao, float valor, int quantidade, boolean habilitado, int idCategoria, int idFilial) {
        Produto p = new Produto(nome, descricao, valor, quantidade, habilitado, idCategoria, idFilial);
        ProdutoDAO dao = new ProdutoDAO();
        dao.save(p);
    }

    public static void update(int id, String nome, String descricao, float valor, int quantidade, boolean habilitado, int idCategoria, int idFilial) {
        Produto p = new Produto(id, nome, descricao, valor, quantidade, habilitado, idCategoria, idFilial);
        ProdutoDAO dao = new ProdutoDAO();
        dao.update(p);
    }

    public static void delete(int id) {
        ProdutoDAO dao = new ProdutoDAO();
        dao.delete(id);
    }

    public static List<Produto> search(String nome) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.search(nome);
    }

    public static List<Produto> listAll() {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.listAll();
    }
}
