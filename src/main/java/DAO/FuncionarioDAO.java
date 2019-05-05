package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Funcionario;
import Conexao.Database;
import InterDao.FuncionarioDaoInte;
import java.util.List;

public class FuncionarioDAO implements FuncionarioDaoInte {

    private static FuncionarioDAO funcionarioDao = null;

    private Connection connection = Database.getConnection();

    @Override
    public boolean Inserir(Funcionario funcionario) {
        boolean retorno = false;

        String sql = "INSERT INTO FUNCIONARIO (NOME, FILIAL, ACESSO)"
                + "VALUES(?,?,?)";

        try {
            PreparedStatement comando = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            comando.setString(1, funcionario.getFuncionarioNome());
            comando.setString(2, funcionario.getFuncionarioFilial());
            comando.setString(3, funcionario.getFuncionarioAcesso());

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
    public void Atualizar(Funcionario funcionario) {
        String sql = "UPDATE FUNCIONARIO SET NOME=?, FILIAL=?, ACESSO=? "
                + "WHERE IDFUNCIONARIO=?";

        try {
            PreparedStatement conexao = connection.prepareStatement(sql);
            conexao.setString(1, funcionario.getFuncionarioNome());
            conexao.setString(2, funcionario.getFuncionarioFilial());
            conexao.setString(3, funcionario.getFuncionarioAcesso());

            conexao.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void Excluir(int ID) {
        String sql = "DELETE FROM FUNCIONARIO WHERE WHERE IDFUNCIONARIO =?";

        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, ID);

            pstmt.executeUpdate();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public Funcionario Consultar(String nome) {
        String sql = "SELECT * FROM FUNCIONARIO WHERE NOME =?";

        try {
            PreparedStatement conexao = connection.prepareStatement(sql);
            conexao.setString(1, nome);

            ResultSet resultSet = conexao.executeQuery();
            if (resultSet.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(resultSet.getInt(1));
                funcionario.setFuncionarioNome(resultSet.getString(2));
                funcionario.setFuncionarioFilial(resultSet.getString(3));
                funcionario.setFuncionarioAcesso(resultSet.getString(4));

                return funcionario;
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

    @Override
    public List<Funcionario> getFuncionario() {
        String sql = "SELECT * FROM FUNCIONARIO";
        List<Funcionario> funcionarios = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);

            ResultSet resultSet = pstmt.executeQuery();
            while (resultSet.next()) {
                if (funcionarios == null) {
                    funcionarios = new ArrayList<>();
                }

                Funcionario funcionario = new Funcionario();
                funcionario.setIdFuncionario(resultSet.getInt(1));
                funcionario.setFuncionarioNome(resultSet.getString(2));
                funcionario.setFuncionarioFilial(resultSet.getString(3));
                funcionario.setFuncionarioAcesso(resultSet.getString(4));
                funcionarios.add(funcionario);
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return funcionarios;
    }

    public static FuncionarioDAO getInstance() {
        if (funcionarioDao == null) {
            funcionarioDao = new FuncionarioDAO();
        }

        return funcionarioDao;
    }

}
