package InterDao;

import java.util.List;
import Model.Produto;

public interface ProdutoDaoInte {

    boolean Inserir(Produto produto);

    void Atualizar(Produto produto);

    void Excluir(int id);

    Produto Consultar(String nome);

    List<Produto> getProdutos();
}
