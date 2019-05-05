package DAO;
 
import java.util.List;

import model.Cliente;
 
public interface ClienteDao {
    int saveCliente(Cliente cliente);
 
    void updateCliente(Cliente cliente);
 
    void deleteCliente(int id);
 
    Cliente searchClienteId(int id);
 
    List<Cliente> showAllCliente();
}