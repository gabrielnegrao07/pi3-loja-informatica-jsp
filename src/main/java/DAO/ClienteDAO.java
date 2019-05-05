package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Conexao.Database;
import InterDao.ClienteDaoInte;
import Model.Cliente;
import java.util.List;

public class ClienteDAO implements ClienteDaoInte {

    private static ClienteDAO clienteDao = null;

    private Connection connection = Database.getConnection();

    @Override
    public boolean Inserir(Cliente cliente) {
        boolean retorno = false;

        String sql = "INSERT INTO CLIENTE (NOME, CPF, TELEFONE, EMAIL)"
                + "VALUES(?,?,?,?)";

        try {
            PreparedStatement comando = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, cliente.getClienteNome());
            comando.setInt(2, cliente.getClienteCPF());
            comando.setInt(3, cliente.getClienteTelefone());
            comando.setString(4, cliente.getClienteEmail());

            if (comando.executeUpdate() > 0) {
                ResultSet rs = comando.getGeneratedKeys();

                if (rs.next()) {
                    retorno = rs.getBoolean(1);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return retorno;
    }

    @Override
    public void Atualizar(Cliente cliente) {
        String sql = "UPDATE CLIENTE SET NOME=?, CPF=?, TELEFONE=?, EMAIL=? "
                + "WHERE IDCLIENTE=?";

        try {
            PreparedStatement conexao = connection.prepareStatement(sql);
            conexao.setString(1, cliente.getClienteNome());
            conexao.setInt(2, cliente.getClienteCPF());
            conexao.setInt(3, cliente.getClienteTelefone());
            conexao.setString(4, cliente.getClienteEmail());

            conexao.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void Excluir(int ID) {
        String sql = "DELETE FROM CLIENTE WHERE WHERE IDCLIENTE =?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, ID);

            pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Cliente Consultar(String nome) {
        String sql = "SELECT * FROM CLIENTE WHERE NOME =?";

        try {
            PreparedStatement conexao = connection.prepareStatement(sql);
            conexao.setString(1, nome);

            // Getting Customer Detail
            ResultSet resultSet = conexao.executeQuery();
            if (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt(1));
                cliente.setClienteNome(resultSet.getString(2));
                cliente.setClienteCPF(resultSet.getInt(3));
                cliente.setClienteTelefone(resultSet.getInt(4));
                cliente.setClienteEmail(resultSet.getString(5));

                return cliente;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    @Override
    public List<Cliente> getCliente() {
        String sql = "SELECT * FROM CLIENTE";
        List<Cliente> clientes = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);

            // Getting Customer's Detail
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                if (clientes == null) {
                    clientes = new ArrayList<>();
                }

                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt(1));
                cliente.setClienteNome(resultSet.getString(2));
                cliente.setClienteCPF(resultSet.getInt(3));
                cliente.setClienteTelefone(resultSet.getInt(4));
                cliente.setClienteEmail(resultSet.getString(5));

                clientes.add(cliente);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return clientes;
    }

    public static ClienteDAO getInstance() {
        if (clienteDao == null) {
            clienteDao = new ClienteDAO();
        }

        return clienteDao;
    }

}
