package auxilio;


import com.thewalkingchampions.model.Produto;
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
}
