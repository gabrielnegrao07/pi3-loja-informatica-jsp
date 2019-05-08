package interDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.ProdutoDao;
import conexao.Database;
import model.Produto;

public class ProdutoDaoImpl implements ProdutoDao {

    private static ProdutoDaoImpl produtoDaoImpl = null;

    private Connection connection = Database.getConnection();
    
    public int saveProduto(Produto produto) {
        String sql = "INSERT INTO produto"
                + "(nome, qtde, valor, desc, categoria, disponivel)"
                + "VALUES(?,?,?,?,?,?)";
        int id = 0;

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, produto.getNomeProduto());
            pstmt.setString(2, produto.getQtdeProduto());
            pstmt.setString(3, produto.getValorProduto());
            pstmt.setString(4, produto.getDescProduto());
            pstmt.setString(5, produto.getCategoriaProduto());
            pstmt.setString(6, produto.getDisponivelProduto());

            if (pstmt.executeUpdate() > 0) {
                ResultSet rs = pstmt.getGeneratedKeys();

                if (rs.next()) {
                    id = rs.getInt(1);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return id;
    }

    public void updateProduto(Produto produto) {
        String sql = "UPDATE produto SET"
                + " nome=?, qtde=?, valor=?, desc=?, categoria=?, disponivel=? "
                + "WHERE id=?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, produto.getNomeProduto());
            pstmt.setString(2, produto.getQtdeProduto());
            pstmt.setString(3, produto.getValorProduto());
            pstmt.setString(4, produto.getDescProduto());
            pstmt.setString(5, produto.getCategoriaProduto());
            pstmt.setString(6, produto.getDisponivelProduto());
            pstmt.setInt(7, produto.getId());

            pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteProduto(int id) {
        String sql = "DELETE FROM produto WHERE id=?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);

            pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Produto searchProdutoId(int id) {
        String sql = "SELECT * FROM produto WHERE id=?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, id);

            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                Produto produto = new Produto();
                produto.setId(resultSet.getInt(1));
                produto.setNomeProduto(resultSet.getString(2));
                produto.setQtdeProduto(resultSet.getString(3));
                produto.setValorProduto(resultSet.getString(4));
                produto.setDescProduto(resultSet.getString(5));
                produto.setCategoriaProduto(resultSet.getString(6));
                produto.setDisponivelProduto(resultSet.getString(7));

                return produto;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    public List<Produto> showAllProduto() {
        String sql = "SELECT * FROM produto";
        List<Produto> produtos = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                if (produtos == null) {
                    produtos = new ArrayList<>();
                }

                Produto produto = new Produto();
                produto.setId(resultSet.getInt(1));
                produto.setNomeProduto(resultSet.getString(2));
                produto.setQtdeProduto(resultSet.getString(3));
                produto.setValorProduto(resultSet.getString(4));
                produto.setDescProduto(resultSet.getString(5));
                produto.setCategoriaProduto(resultSet.getString(6));
                produto.setDisponivelProduto(resultSet.getString(7));

                produtos.add(produto);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return produtos;
    }

    public static ProdutoDao getInstance() {
        if (produtoDaoImpl == null) {
            produtoDaoImpl = new ProdutoDaoImpl();
        }

        return produtoDaoImpl;
    }
}
