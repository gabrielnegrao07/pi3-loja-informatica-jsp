package model;

public class Funcionario {

    private int id;
    private String nomeFuncionario;
    private String cpfFuncionario;
    private String acessoFuncionario;
    private String filialFuncionario;

    public Funcionario() {

    }

    public Funcionario(String nomeFuncionario, String cpfFuncionario, String acessoFuncionario, String filialFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.acessoFuncionario = acessoFuncionario;
        this.filialFuncionario = filialFuncionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getAcessoFuncionario() {
        return acessoFuncionario;
    }

    public void setAcessoFuncionario(String acessoFuncionario) {
        this.acessoFuncionario = acessoFuncionario;
    }

    public String getFilialFuncionario() {
        return filialFuncionario;
    }

    public void setFilialFuncionario(String filialFuncionario) {
        this.filialFuncionario = filialFuncionario;
    }
}
