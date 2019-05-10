/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.LoginDAO;
import com.thewalkingchampions.model.Login;
import java.util.List;

/**
 *
 * @author Johnathan
 */
public class LoginController {

    public static void save(int idF, String login, String senha, int permicao, boolean habilitado) {
        Login l = new Login(idF, login, senha, permicao, habilitado);
        LoginDAO dao = new LoginDAO();
        dao.save(l);
    }

    public static void update(int id, int idF, String login, String senha, int permicao, boolean habilitado) {
        Login l = new Login(id, idF, login, senha, permicao, habilitado);
        LoginDAO dao = new LoginDAO();
        dao.update(l);
    }

    public static void delete(int id) {
        LoginDAO dao = new LoginDAO();
        dao.delete(id);
    }

    public static List<Login> search(String nome) {
        LoginDAO dao = new LoginDAO();
        return dao.search(nome);
    }

    public static boolean searchOne(String nome, String senha) {
        LoginDAO dao = new LoginDAO();
        return dao.searchOne(nome,senha);
    }

    public static List<Login> listAll() {
        LoginDAO dao = new LoginDAO();
        return dao.listAll();
    }
}
