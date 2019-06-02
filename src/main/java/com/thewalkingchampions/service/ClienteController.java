package com.thewalkingchampions.service;

import com.thewalkingchampions.dao.ClienteDAO;
import com.thewalkingchampions.model.Cliente;
import java.util.List;

public class ClienteController {

    public static boolean save(String nome, String cpf, String rg, String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular) {
        Cliente cliente = new Cliente(nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep, email, telefone, celular);
        ClienteDAO dao = new ClienteDAO();
        return dao.save(cliente);
    }

    public static boolean update(int id, String nome, String cpf, String rg, String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular) {
        Cliente cliente = new Cliente(id, nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep, email, telefone, celular);
        ClienteDAO dao = new ClienteDAO();
        boolean cond = dao.update(cliente);
        return cond;
    }

    public static boolean delete(int id) {
        ClienteDAO dao = new ClienteDAO();
        return dao.delete(id);
    }

    public static List<Cliente> search(String nome) {
        ClienteDAO dao = new ClienteDAO();
        return dao.search(nome);
    }

    public static Cliente searchID(int id) {
        ClienteDAO dao = new ClienteDAO();
        return dao.searchID(id);
    }

    public static List<Cliente> listAll() {
        ClienteDAO dao = new ClienteDAO();
        return dao.listAll();
    }
}
