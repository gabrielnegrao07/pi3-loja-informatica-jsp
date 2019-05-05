package InterDao;

import Model.Funcionario;
import java.util.List;

public interface FuncionarioDaoInte {

    boolean Inserir(Funcionario funcionario);

    void Atualizar(Funcionario funcionario);

    void Excluir(int id);

    Funcionario Consultar(String nome);

    List<Funcionario> getFuncionario();
}
