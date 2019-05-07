package model;

public class Produto {

    private int id;
    private String nomeProduto;
    private String qtdeProduto;
    private String valorProduto;
    private String descProduto;
    private String categoriaProduto;
    private String disponivelProduto;

    public Produto() {

    }

    public Produto(String nomeProduto, String qtdeProduto, String valorProduto, String descProduto, String categoriaProduto, String disponivelProduto) {
        this.id = id;
        this.nomeProduto = nomeProduto;
        this.qtdeProduto = qtdeProduto;
        this.valorProduto = valorProduto;
        this.descProduto = descProduto;
        this.categoriaProduto = categoriaProduto;
        this.disponivelProduto = disponivelProduto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(String qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public String getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(String valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getDescProduto() {
        return descProduto;
    }

    public void setDescProduto(String descProduto) {
        this.descProduto = descProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public String getDisponivelProduto() {
        return disponivelProduto;
    }

    public void setDisponivelProduto(String disponivelProduto) {
        this.disponivelProduto = disponivelProduto;
    }

}
