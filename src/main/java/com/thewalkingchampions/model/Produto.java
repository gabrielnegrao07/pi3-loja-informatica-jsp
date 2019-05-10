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
public class Produto {

    private int idProduto;
    private String nomeProduto;
    private String descricaoProduto;
    private float valorProduto;
    private int quantidadeProduto;
    private boolean habilitadoProduto;
    private int idCategoriaProduto;
    private int idFilial;

    public Produto() {

    }

    public Produto(String nome, String descricao, float valor, int quantidade, boolean habilitado, int idCategoria, int idFilial) {
        this.nomeProduto = nome;
        this.descricaoProduto = descricao;
        this.valorProduto = valor;
        this.quantidadeProduto = quantidade;
        this.habilitadoProduto = habilitado;
        this.idCategoriaProduto = idCategoria;
        this.idFilial = idFilial;
    }

    public Produto(int id, String nome, String descricao, float valor, int quantidade, boolean habilitado, int idCategoria, int idFilial) {
        this.idProduto = id;
        this.nomeProduto = nome;
        this.descricaoProduto = descricao;
        this.valorProduto = valor;
        this.quantidadeProduto = quantidade;
        this.habilitadoProduto = habilitado;
        this.idCategoriaProduto = idCategoria;
        this.idFilial = idFilial;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public boolean isHabilitadoProduto() {
        return habilitadoProduto;
    }

    public void setHabilitadoProduto(boolean habilitadoProduto) {
        this.habilitadoProduto = habilitadoProduto;
    }

    public int getIdCategoriaProduto() {
        return idCategoriaProduto;
    }

    public void setIdCategoriaProduto(int idCategoriaProduto) {
        this.idCategoriaProduto = idCategoriaProduto;
    }

    public int getIdFilial() {
        return idFilial;
    }

    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }
}
