package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.FuncionarioDao;
import com.thewalkingchampions.model.Funcionario;
import java.util.List;


public class FuncionarioController {

    public static void save(String nome, String cpf, String rg, String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular, String filial, String cargo, boolean habilitado) {
        Funcionario f = new Funcionario(nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep, email, telefone, celular, filial, cargo, habilitado);
        FuncionarioDao dao = new FuncionarioDao();
        dao.save(f);
    }

    public static void update(int id, String nome, String cpf, String rg, String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular, String filial, String cargo, boolean habilitado) {
        Funcionario f = new Funcionario(id, nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep, email, telefone, celular, filial, cargo, habilitado);
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
