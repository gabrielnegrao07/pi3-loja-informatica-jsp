package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.ProdutoDAO;
import com.thewalkingchampions.model.Produto;
import java.util.List;

public class ProdutoController {

    public static void save(String nome, int quantidade, float valor, String descricao, int categoria, int filial, boolean habilitado) {
        Produto p = new Produto(nome, quantidade, valor, descricao, categoria, filial, habilitado);
        ProdutoDAO dao = new ProdutoDAO();
        dao.save(p);
    }

    public static boolean update(int id, String nome, int quantidade, float valor, String descricao, int categoria, int filial, boolean habilitado) {
        Produto p = new Produto(id, nome, quantidade, valor, descricao, categoria, filial, habilitado);
        ProdutoDAO dao = new ProdutoDAO();
        return dao.update(p);
    }

    public static void delete(int id) {
        ProdutoDAO dao = new ProdutoDAO();
        dao.delete(id);
    }

    public static List<Produto> search(String nome) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.search(nome);
    }

    public static Produto searchID(int id) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.searchID(id);
    }

    public static List<Produto> listAll() {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.listAll();
    }
}
