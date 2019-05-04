package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Produto;
import Conexao.Database;
import InterDao.ProdutoDaoInte;
import java.util.List;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnathan.mbmata
 */
public class ProdutoDAO implements ProdutoDaoInte {

    private static ProdutoDAO produtoDao = null;

    private Connection connection = Database.getConnection();

    @Override
    public boolean Inserir(Produto produto) {
        boolean retorno = false;

        String sql = "INSERT INTO PRODUTOS (NOME, QUANTIDADE, VALOR, DESCRICAO, HABILITADO)"
                + "VALUES(?,?,?,?,?)";

        try {
            PreparedStatement comando = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            comando.setString(1, produto.getProdutoNome());
            comando.setInt(2, produto.getProdutoQuantidade());
            comando.setFloat(3, produto.getProdutoValor());
            comando.setString(4, produto.getProdutoDescricao());
            comando.setBoolean(5, produto.isProdutohabilitado());

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
    public void Atualizar(Produto produto) {
        String sql = "UPDATE PRODUTOS SET NOME=?, QUANTIDADE=?, VALOR=?, DESCRICAO=?, HABILITADO=? "
                + "WHERE IDPRODUTO=?";

        try {
            PreparedStatement conexao = connection.prepareStatement(sql);
            conexao.setString(1, produto.getProdutoNome());
            conexao.setInt(2, produto.getProdutoQuantidade());
            conexao.setFloat(3, produto.getProdutoValor());
            conexao.setString(4, produto.getProdutoDescricao());
            conexao.setBoolean(5, produto.isProdutohabilitado());

            conexao.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void Excluir(int ID) {
        String sql = "DELETE FROM PRODUTOS WHERE WHERE IDPRODUTO =?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, ID);

            pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Produto Consultar(String nome) {
        String sql = "SELECT * FROM PRODUTOS WHERE NOME =?";

        try {
            PreparedStatement conexao = connection.prepareStatement(sql);
            conexao.setString(1, nome);

            // Getting Customer Detail
            ResultSet resultSet = conexao.executeQuery();
            if (resultSet.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(resultSet.getInt(1));
                produto.setProdutoNome(resultSet.getString(2));
                produto.setProdutoQuantidade(resultSet.getInt(3));
                produto.setProdutoValor(resultSet.getFloat(4));
                produto.setProdutoDescricao(resultSet.getString(5));
                produto.setProdutohabilitado(resultSet.getBoolean(6));

                return produto;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    @Override
    public List<Produto> getProdutos() {
        String sql = "SELECT * FROM PRODUTOS";
        List<Produto> produtos = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);

            // Getting Customer's Detail
            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                if (produtos == null) {
                    produtos = new ArrayList<>();
                }

                Produto produto = new Produto();
                produto.setIdProduto(resultSet.getInt(1));
                produto.setProdutoNome(resultSet.getString(2));
                produto.setProdutoQuantidade(resultSet.getInt(3));
                produto.setProdutoValor(resultSet.getFloat(4));
                produto.setProdutoDescricao(resultSet.getString(5));
                produto.setProdutohabilitado(resultSet.getBoolean(6));

                produtos.add(produto);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return produtos;
    }

    public static ProdutoDAO getInstance() {
        if (produtoDao == null) {
            produtoDao = new ProdutoDAO();
        }

        return produtoDao;
    }

}
