package DAO;

import java.util.List;

import model.Produto;

public interface ProdutoDao {

    int saveProduto(Produto produto);

    void updateProduto(Produto Produto);

    void deleteProduto(int id);

    Produto searchProdutoId(int id);

    List<Produto> showAllProduto();
}
