package Model;

public class Cliente {

    private int idCliente;
    private String clienteNome;
    private int clienteCPF;
    private int clienteTelefone;
    private String clienteEmail;

    public Cliente() {

    }

    public Cliente(String nome, int cpf, int telefone, String email) {
        this.clienteNome = nome;
        this.clienteCPF = cpf;
        this.clienteTelefone = telefone;
        this.clienteEmail = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public int getClienteCPF() {
        return clienteCPF;
    }

    public void setClienteCPF(int clienteCPF) {
        this.clienteCPF = clienteCPF;
    }

    public int getClienteTelefone() {
        return clienteTelefone;
    }

    public void setClienteTelefone(int clienteTelefone) {
        this.clienteTelefone = clienteTelefone;
    }

    public String getClienteEmail() {
        return clienteEmail;
    }

    public void setClienteEmail(String clienteEmail) {
        this.clienteEmail = clienteEmail;
    }

}
