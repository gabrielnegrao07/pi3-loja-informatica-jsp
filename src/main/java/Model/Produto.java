package Model;

public class Produto {

    private int idProduto;
    private String produtoNome;
    private int produtoQuantidade;
    private float produtoValor;
    private String produtoDescricao;
    private String produtoCategoria;
    private boolean produtoHabilitado;

    public Produto() {

    }

    public Produto(String nome, int quantidade, float valor, String descricao, boolean habilitado) {
        this.produtoNome = nome;
        this.produtoQuantidade = quantidade;
        this.produtoValor = valor;
        this.produtoDescricao = descricao;
        this.produtoHabilitado = habilitado;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public int getProdutoQuantidade() {
        return produtoQuantidade;
    }

    public void setProdutoQuantidade(int produtoQuantidade) {
        this.produtoQuantidade = produtoQuantidade;
    }

    public float getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(float produtoValor) {
        this.produtoValor = produtoValor;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }

    public void setProdutoDescricao(String produtoDescricao) {
        this.produtoDescricao = produtoDescricao;
    }

    public String getProdutoCategoria() {
        return produtoCategoria;
    }

    public void setProdutoCategoria(String produtoCategoria) {
        this.produtoCategoria = produtoCategoria;
    }

    public boolean isProdutoHabilitado() {
        return produtoHabilitado;
    }

    public void setProdutoHabilitado(boolean produtoHabilitado) {
        this.produtoHabilitado = produtoHabilitado;
    }
}
