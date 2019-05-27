/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.model;

import java.sql.Date;

/**
 *
 * @author Johnathan
 */
public class Pedido {

    private int id;
    private int idCliente;
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String numero;
    private String complemento;
    private String cidade;
    private String bairro;
    private String estado;
    private String cep;
    private String email;
    private String telefone;
    private String celular;
    private float valorTotal;
    private float desconto;
    private float valor;
    private Date data;

    public Pedido() {

    }

    public Pedido(int idCliente, float valorTotal, float desconto, float valor) {
        this.idCliente = idCliente;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.valor = valor;
    }

    public Pedido(int id, int idCliente, String nome, String cpf, String rg, String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular, float valorTotal, float desconto, float valor) {
        this.id = id;
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.valor = valor;
    }

    public Pedido(int idCliente, String nome, String cpf, String rg, String endereco, String numero, String complemento, String cidade, String bairro, String estado, String cep, String email, String telefone, String celular, float valorTotal, float desconto, float valor) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.cep = cep;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
