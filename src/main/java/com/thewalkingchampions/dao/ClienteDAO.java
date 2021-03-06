package com.thewalkingchampions.dao;

import com.thewalkingchampions.connection.Database;
import com.thewalkingchampions.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    public boolean save(Cliente cliente) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        boolean cond;
        try {
            stmt = connection.prepareStatement("INSERT INTO cliente(NOME, CPF, RG, ENDERECO, NUMERO, COMPLEMENTO, CIDADE, BAIRRO, ESTADO, CEP, EMAIL, TELEFONE, CELULAR) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getRg());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5, cliente.getNumero());
            stmt.setString(6, cliente.getComplemento());
            stmt.setString(7, cliente.getCidade());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getEstado());
            stmt.setString(10, cliente.getCep());
            stmt.setString(11, cliente.getEmail());
            stmt.setString(12, cliente.getTelefone());
            stmt.setString(13, cliente.getCelular());

            stmt.executeUpdate();
            cond = true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }

        return cond;
    }

    public List<Cliente> listAll() {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setId(rs.getInt("ID"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setRg(rs.getString("RG"));
                cliente.setEndereco(rs.getString("ENDERECO"));
                cliente.setNumero(rs.getString("NUMERO"));
                cliente.setComplemento(rs.getString("COMPLEMENTO"));
                cliente.setCidade(rs.getString("CIDADE"));
                cliente.setBairro(rs.getString("BAIRRO"));
                cliente.setEstado(rs.getString("ESTADO"));
                cliente.setCep(rs.getString("CEP"));
                cliente.setEmail(rs.getString("EMAIL"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setCelular(rs.getString("CELULAR"));

                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return clientes;
    }

    public List<Cliente> search(String nome) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = connection.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?;");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();

                cliente.setNome(rs.getString("NOME"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setRg(rs.getString("RG"));
                cliente.setEndereco(rs.getString("ENDERECO"));
                cliente.setNumero(rs.getString("NUMERO"));
                cliente.setComplemento(rs.getString("COMPLEMENTO"));
                cliente.setCidade(rs.getString("CIDADE"));
                cliente.setBairro(rs.getString("BAIRRO"));
                cliente.setEstado(rs.getString("ESTADO"));
                cliente.setCep(rs.getString("CEP"));
                cliente.setEmail(rs.getString("EMAIL"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setCelular(rs.getString("CELULAR"));

                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return clientes;
    }

    public Cliente searchID(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        Cliente cliente = new Cliente();

        try {
            stmt = connection.prepareStatement("SELECT * FROM cliente WHERE ID LIKE ?;");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            while (rs.next()) {

                cliente.setId(rs.getInt("ID"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCpf(rs.getString("CPF"));
                cliente.setRg(rs.getString("RG"));
                cliente.setEndereco(rs.getString("ENDERECO"));
                cliente.setNumero(rs.getString("NUMERO"));
                cliente.setComplemento(rs.getString("COMPLEMENTO"));
                cliente.setCidade(rs.getString("CIDADE"));
                cliente.setBairro(rs.getString("BAIRRO"));
                cliente.setEstado(rs.getString("ESTADO"));
                cliente.setCep(rs.getString("CEP"));
                cliente.setEmail(rs.getString("EMAIL"));
                cliente.setTelefone(rs.getString("TELEFONE"));
                cliente.setCelular(rs.getString("CELULAR"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Database.closeConnection(connection, stmt, rs);
        }
        return cliente;
    }

    public boolean update(Cliente cliente) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;

        boolean cond;

        try {
            stmt = connection.prepareStatement("UPDATE cliente SET NOME = ?, CPF = ?, RG = ?, ENDERECO = ?, NUMERO = ?, COMPLEMENTO = ?, CIDADE = ?, BAIRRO = ?, ESTADO = ?, CEP = ?, EMAIL = ?, TELEFONE = ?, CELULAR = ? WHERE ID = ?");

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getRg());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5, cliente.getNumero());
            stmt.setString(6, cliente.getComplemento());
            stmt.setString(7, cliente.getCidade());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getEstado());
            stmt.setString(10, cliente.getCep());
            stmt.setString(11, cliente.getEmail());
            stmt.setString(12, cliente.getTelefone());
            stmt.setString(13, cliente.getCelular());
            stmt.setInt(14, cliente.getId());
            stmt.executeUpdate();

            cond = true;

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }

        return cond;
    }

    public boolean delete(int id) {
        Connection connection = Database.getConnection();
        PreparedStatement stmt = null;
        boolean cond;

        try {
            stmt = connection.prepareStatement("DELETE FROM cliente WHERE ID = ?");

            stmt.setInt(1, id);

            stmt.executeUpdate();
            cond = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            cond = false;
        } finally {
            Database.closeConnection(connection, stmt);
        }

        return cond;
    }
}
