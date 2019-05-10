package com.thewalkingchampions.controller;

import com.thewalkingchampions.dao.ClienteDAO;
import com.thewalkingchampions.model.Cliente;
import java.util.List;

/**
 *
 * @author GIOVANNI.MCARIGNATO
 */
public class ClienteController {

    public static void save(String nome, String cpf, String telefone, String email) {
        Cliente c = new Cliente(nome, cpf, telefone, email);
        ClienteDAO cliente = new ClienteDAO();
        cliente.save(c);
    }

    public static void update(int id, String nome, String cpf, String telefone, String email) {
        Cliente c = new Cliente(id, nome, cpf, telefone, email);
        ClienteDAO cliente = new ClienteDAO();
        cliente.update(c);
    }

    public static void delete(int id) {
        ClienteDAO cliente = new ClienteDAO();
        cliente.delete(id);
    }

    public static List<Cliente> search(String nome) {
        ClienteDAO cliente = new ClienteDAO();
        return cliente.search(nome);
    }

    public static Cliente searchOne(int id) {
        ClienteDAO cliente = new ClienteDAO();
        return cliente.searchOne(id);
    }

    public static List<Cliente> listAll() {
        ClienteDAO cliente = new ClienteDAO();
        return cliente.listAll();
    }
}
