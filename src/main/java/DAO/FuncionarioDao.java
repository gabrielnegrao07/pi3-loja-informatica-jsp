package DAO;
 
import java.util.List;

import model.Cliente;
 
public interface FuncionarioDao {
    int saveCliente(Cliente cliente);
 
    void updateCliente(Cliente cliente);
 
    void deleteCliente(int id);
 
    Cliente searchClienteId(int id);
 
    List<Cliente> showAllCliente();
}