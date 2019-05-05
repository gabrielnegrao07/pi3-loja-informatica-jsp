package Model;

public class Funcionario {

    private int idFuncionario;
    private String funcionarioNome;
    private String funcionarioFilial;
    private String funcionarioAcesso;

    public Funcionario() {

    }

    public Funcionario(String nome, String filial, String acesso) {
        this.funcionarioNome = nome;
        this.funcionarioFilial = filial;
        this.funcionarioAcesso = acesso;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getFuncionarioNome() {
        return funcionarioNome;
    }

    public void setFuncionarioNome(String funcionarioNome) {
        this.funcionarioNome = funcionarioNome;
    }

    public String getFuncionarioFilial() {
        return funcionarioFilial;
    }

    public void setFuncionarioFilial(String funcionarioFilial) {
        this.funcionarioFilial = funcionarioFilial;
    }

    public String getFuncionarioAcesso() {
        return funcionarioAcesso;
    }

    public void setFuncionarioAcesso(String funcionarioAcesso) {
        this.funcionarioAcesso = funcionarioAcesso;
    }
}
