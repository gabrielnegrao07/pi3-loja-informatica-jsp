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

    private int id;
    private String nome;
    private int quantidade;
    private float valor;
    private String descricao;
    private int categoria;
    private int filial;
    private boolean habilitado;

    public Produto() 
    {
    }

    public Produto(String nome, int quantidade, float valor, String descricao, int categoria, int filial, boolean habilitado) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.filial = filial;
        this.habilitado = habilitado;
    }

    public Produto(int id, String nome, int quantidade, float valor, String descricao, int categoria, int filial, boolean habilitado) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.filial = filial;
        this.habilitado = habilitado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getFilial() {
        return filial;
    }

    public void setFilial(int filial) {
        this.filial = filial;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
