/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterDao;

import java.util.List;

import Model.Produto;

/**
 *
 * @author IDCOM
 */
public interface ProdutoDaoInte {

    boolean Inserir(Produto produto);

    void Atualizar(Produto produto);

    void Excluir(int id);

    Produto Consultar(String nome);

    List<Produto> getProdutos();
}
