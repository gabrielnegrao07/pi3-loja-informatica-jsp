/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.CategoriaDAO;
import com.thewalkingchampions.model.Categoria;
import java.util.List;

/**
 *
 * @author Johnathan
 */
public class CategoriaController {

    public static boolean save(String nome) {
        Categoria c = new Categoria(nome);
        CategoriaDAO dao = new CategoriaDAO();
        return dao.save(c);
    }

    public static void update(int id, String nome) {
        Categoria c = new Categoria(id, nome);
        CategoriaDAO dao = new CategoriaDAO();
        dao.update(c);
    }

    public static void delete(int id) {
        CategoriaDAO dao = new CategoriaDAO();
        dao.delete(id);
    }

    public static List<Categoria> search(String nome) {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.search(nome);
    }

    public static Categoria searchID(int id) {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.searchID(id);
    }

    public static List<Categoria> listAll() {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.listAll();
    }
}
