/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.service;

import com.thewalkingchampions.dao.FilialDAO;
import com.thewalkingchampions.model.Filial;
import java.util.List;

/**
 *
 * @author Johnathan
 */
public class FilialController {

    public static boolean save(String nome, String cnpj, String ie, String endereco, String numero, String complemento, String bairro, String cidade, String estado, String cep, String email, String telefone, boolean habilitado) {
        Filial filial = new Filial(nome, cnpj, ie, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, habilitado);
        FilialDAO dao = new FilialDAO();
        return dao.save(filial);
    }

    public static boolean update(int id, String nome, String cnpj, String ie, String endereco, String numero, String complemento, String bairro, String cidade, String estado, String cep, String email, String telefone, boolean habilitado) {
        Filial filial = new Filial(id, nome, cnpj, ie, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, habilitado);
        FilialDAO dao = new FilialDAO();
        return dao.update(filial);
    }

    public static boolean delete(int id) {
        FilialDAO dao = new FilialDAO();
        return dao.delete(id);
    }

    public static List<Filial> search(String nome) {
        FilialDAO dao = new FilialDAO();
        return dao.search(nome);
    }

    public static Filial searchID(int id) {
        FilialDAO dao = new FilialDAO();
        return dao.searchID(id);
    }

    public static List<Filial> listAll() {
        FilialDAO dao = new FilialDAO();
        return dao.listAll();
    }
}
