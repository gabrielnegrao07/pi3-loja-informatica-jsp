package com.thewalkingchampions.service;

import com.thewalkingchampions.dao.ProdutoDAO;
import com.thewalkingchampions.model.Produto;
import java.util.List;

public class ProdutoController {

    public static boolean save(String nome, float valor, String descricao, int categoria, int filial, boolean habilitado) {
        Produto p = new Produto(nome, valor, descricao, categoria, filial, habilitado);
        ProdutoDAO dao = new ProdutoDAO();
        return dao.save(p);
    }

    public static boolean update(int id, String nome, float valor, String descricao, int categoria, int filial, boolean habilitado) {
        Produto p = new Produto(id, nome, valor, descricao, categoria, filial, habilitado);
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

    public static Produto searchEstoqueID(String nome, int quantidade) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.searchEstoqueID(nome, quantidade);
    }

    public static List<Produto> listAll() {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.listAll();
    }
}
