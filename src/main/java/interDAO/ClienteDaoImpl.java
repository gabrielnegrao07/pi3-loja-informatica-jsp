package interDAO;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.ClienteDao;
import conexao.Database;
import model.Cliente;
 
public class ClienteDaoImpl implements ClienteDao {
 
    private static ClienteDaoImpl clienteDaoImpl = null;
 
    private Connection connection = Database.getConnection();
    
    public int saveCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente"
                    +"(nome, cpf, telefone, email)"
                    + "VALUES(?,?,?,?)";
        int id = 0;
 
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql,
                                        Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, cliente.getNomeCliente());
            pstmt.setString(2, cliente.getCpfCliente());
            pstmt.setString(3, cliente.getTelefoneCliente());
            pstmt.setString(4, cliente.getEmailCliente());
 
            if (pstmt.executeUpdate() > 0) {
                ResultSet rs = pstmt.getGeneratedKeys();
                                                              
                if (rs.next())
                    id = rs.getInt(1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
        return id;
    }
 
    public void updateCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET"
                    +" nome=?, cpf=?, telefone=?, email=? "
                    + "WHERE id=?";
 
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, cliente.getNomeCliente());
            pstmt.setString(2, cliente.getCpfCliente());
            pstmt.setString(3, cliente.getTelefoneCliente());
            pstmt.setString(4, cliente.getEmailCliente());
            pstmt.setInt(5, cliente.getId());
 
            pstmt.executeUpdate();
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    public void deleteCliente(int id) {
        String sql = "DELETE FROM cliente WHERE id=?";
 
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
 
            pstmt.executeUpdate();
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
 
    public Cliente searchClienteId(int id) {
        String sql = "SELECT * FROM cliente WHERE id=?";
 
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);
 
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getInt(1));
                cliente.setNomeCliente(resultSet.getString(2));
                cliente.setCpfCliente(resultSet.getString(3));
                cliente.setTelefoneCliente(resultSet.getString(4));
                cliente.setEmailCliente(resultSet.getString(5));
 
                return cliente;
            }
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
        return null;
    }
 
    public List<Cliente> showAllCliente() {
        String sql = "SELECT * FROM cliente";
        List<Cliente> clientes = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
 
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                if (clientes == null)
                	clientes = new ArrayList<>();
 
                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getInt(1));
                cliente.setNomeCliente(resultSet.getString(2));
                cliente.setCpfCliente(resultSet.getString(3));
                cliente.setTelefoneCliente(resultSet.getString(4));
                cliente.setEmailCliente(resultSet.getString(5));
 
                clientes.add(cliente);
            }
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
        return clientes; 
    }
 
    public static ClienteDao getInstance() {
        if (clienteDaoImpl == null)
            clienteDaoImpl = new ClienteDaoImpl();
 
        return clienteDaoImpl;
    }
}