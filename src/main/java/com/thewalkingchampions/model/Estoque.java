/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.model;

/**
 *
 * @author johnathan.mbmata
 */
public class Estoque {

    private int idProduto;
    private int quantidade;
    private String nome;

    public Estoque() {

    }

    public Estoque(int quantidade) {
        this.quantidade = quantidade;
    }

    public Estoque(int id, int quantidade) {
        this.idProduto = id;
        this.quantidade = quantidade;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
