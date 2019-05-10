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
public class Login {

    private int idLogin;
    private int idFuncionario;
    private String login;
    private String senha;
    private int permicao;
    private boolean habilitado;

    public Login() {

    }

    public Login(int idF, String login, String senha, int permicao, boolean habilitado) {
        this.idFuncionario = idF;
        this.login = login;
        this.senha = senha;
        this.permicao = permicao;
        this.habilitado = habilitado;
    }

    public Login(int id, int idF, String login, String senha, int permicao, boolean habilitado) {
        this.idLogin = id;
        this.idFuncionario = idF;
        this.login = login;
        this.senha = senha;
        this.permicao = permicao;
        this.habilitado = habilitado;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getPermicao() {
        return permicao;
    }

    public void setPermicao(int permicao) {
        this.permicao = permicao;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
