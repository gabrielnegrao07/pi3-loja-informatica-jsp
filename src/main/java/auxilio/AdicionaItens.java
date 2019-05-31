package auxilio;

import com.thewalkingchampions.model.Produto;
import com.thewalkingchampions.model.Cliente;
import com.thewalkingchampions.model.Estoque;
import java.util.ArrayList;

public class AdicionaItens {

    public ArrayList AdicionaItens(Produto p, ArrayList lista) {
        if (lista == null) {
            lista = new ArrayList();
        }

        lista.add(p);

        return lista;
    }

    public Cliente clientePedido(Cliente c, Object cliente) {
        if (cliente == null) {
            cliente = c;
        }

        return (Cliente) cliente;
    }

    public ArrayList AdicionaEstoque(Estoque e, ArrayList lista) {
        if (lista == null) {
            lista = new ArrayList();
        }

        lista.add(e);

        return lista;
    }

}
