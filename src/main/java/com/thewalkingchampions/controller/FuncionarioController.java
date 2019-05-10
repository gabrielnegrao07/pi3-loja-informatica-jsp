/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.FuncionarioDao;
import com.thewalkingchampions.model.Funcionario;
import java.util.List;

/**
 *
 * @author Johnathan
 */
public class FuncionarioController {

    public static void save(String nome, String cpf, String telefone, String email) {
        Funcionario f = new Funcionario(nome, cpf, telefone, email);
        FuncionarioDao dao = new FuncionarioDao();
        dao.save(f);
    }

    public static void update(int id, String nome, String cpf, String telefone, String email) {
        Funcionario f = new Funcionario(id, nome, cpf, telefone, email);
        FuncionarioDao dao = new FuncionarioDao();
        dao.update(f);
    }

    public static void delete(int id) {
        FuncionarioDao dao = new FuncionarioDao();
        dao.delete(id);
    }

    public static List<Funcionario> search(String nome) {
        FuncionarioDao dao = new FuncionarioDao();
        return dao.search(nome);
    }

    public static List<Funcionario> listAll() {
        FuncionarioDao dao = new FuncionarioDao();
        return dao.listAll();
    }
}
