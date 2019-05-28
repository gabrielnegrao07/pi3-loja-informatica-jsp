package auxilio;

import com.thewalkingchampions.model.Produto;
import com.thewalkingchampions.model.Cliente;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Johnathan
 */
public class AdicionaItens {

    public ArrayList AdicionaItens(Produto p, ArrayList lista) {
        if (lista == null) {
            lista = new ArrayList();
        }

        lista.add(p);

        return lista;
    }

    public ArrayList clientePedido(Cliente c, ArrayList lista) {
        if (lista == null) {
            lista = new ArrayList();
        }

        lista.add(c);

        return lista;
    }
}
