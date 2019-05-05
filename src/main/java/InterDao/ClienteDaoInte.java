package InterDao;

import Model.Cliente;
import java.util.List;

public interface ClienteDaoInte {

    boolean Inserir(Cliente cliente);

    void Atualizar(Cliente cliente);

    void Excluir(int id);

    Cliente Consultar(String nome);

    List<Cliente> getCliente();
}
