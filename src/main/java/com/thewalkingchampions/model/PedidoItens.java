/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.model;

/**
 *
 * @author Johnathan
 */
public class PedidoItens {

    private int id;
    private int idPedido;
    private int idProduto;
    private String nome;
    private float valor;
    private int categoria;
    private String nomeCategoria;
    private int filial;
    private int idEstoque;
    private int quantidade;

    public PedidoItens() {

    }

    public PedidoItens(int idPedido, int idProduto, float valor, int quantidade) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public PedidoItens(int id, int idPedido, int idProduto, String nome, float valor, int categoria, String nomeCategoria, int filial, int idEstoque, int quantidade) {
        this.id = id;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.nomeCategoria = nomeCategoria;
        this.filial = filial;
        this.idEstoque = idEstoque;
        this.quantidade = quantidade;
    }

    public PedidoItens(int idPedido, int idProduto, String nome, float valor, int categoria, String nomeCategoria, int filial, int idEstoque, int quantidade) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;
        this.categoria = categoria;
        this.nomeCategoria = nomeCategoria;
        this.filial = filial;
        this.idEstoque = idEstoque;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public int getFilial() {
        return filial;
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
