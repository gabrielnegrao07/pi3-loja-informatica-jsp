package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.ClienteDAO;
import com.thewalkingchampions.model.Cliente;
import java.sql.Date;
import java.util.List;

public class ClienteController {

    public static void save(String nome, String cpf, String rg, String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular) {
        Cliente cliente = new Cliente(nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep , email, telefone, celular);
        ClienteDAO dao = new ClienteDAO();
        dao.save(cliente);
    }

    public static void update(int id, String nome, String cpf, String rg, String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular) {
        Cliente cliente = new Cliente(id, nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep , email, telefone, celular);
        ClienteDAO dao = new ClienteDAO();
        dao.update(cliente);
    }

    public static void delete(int id) {
        ClienteDAO dao = new ClienteDAO();
        dao.delete(id);
    }

    public static List<Cliente> search(String nome) {
        ClienteDAO dao = new ClienteDAO();
        return dao.search(nome);
    }

    public static List<Cliente> listAll() {
        ClienteDAO dao = new ClienteDAO();
        return dao.listAll();
    }
}
