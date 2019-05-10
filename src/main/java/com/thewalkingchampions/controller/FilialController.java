/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.FilialDAO;
import com.thewalkingchampions.model.Filial;
import java.util.List;

/**
 *
 * @author Johnathan
 */
public class FilialController {

    public static void save(String nome) {
        Filial f = new Filial(nome);
        FilialDAO dao = new FilialDAO();
        dao.save(f);
    }

    public static void update(int id, String nome) {
        Filial f = new Filial(id, nome);
        FilialDAO dao = new FilialDAO();
        dao.update(f);
    }

    public static void delete(int id) {
        FilialDAO dao = new FilialDAO();
        dao.delete(id);
    }

    public static List<Filial> search(String nome) {
        FilialDAO dao = new FilialDAO();
        return dao.search(nome);
    }

    public static List<Filial> listAll() {
        FilialDAO dao = new FilialDAO();
        return dao.listAll();
    }
}
