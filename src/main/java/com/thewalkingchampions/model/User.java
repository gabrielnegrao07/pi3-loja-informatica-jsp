package com.thewalkingchampions.model;

import com.thewalkingchampions.model.Papel;
import java.io.Serializable;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

public class User implements Serializable {
    
    private String username;

    private String nomeCompleto;

    private String hashSenha;

    private List<Papel> papeis;

    public User() {
    }

    public User(String username, String nomeCompleto, String senhaAberta, List<Papel> papeis) {
        this.username = username;
        this.nomeCompleto = nomeCompleto;
        setSenha(senhaAberta);
        this.papeis = papeis;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getHashSenha() {
        return hashSenha;
    }

    public void setHashSenha(String senha) {
        this.hashSenha = senha;
    }

    public final void setSenha(String senhaAberta) {
        this.hashSenha = BCrypt.hashpw(senhaAberta, BCrypt.gensalt());
    }

    public List<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }

    public boolean validarSenha(String senhaAberta) {
        return BCrypt.checkpw(senhaAberta, hashSenha);
    }

    public boolean verificarPapel(String nomePapel) {
        boolean tem = false;
        for (Papel p : papeis) {
            if (p.getNome().equals(nomePapel)) {
                tem = true;
            }
            else {
                tem = false;
            }
        }
        return tem;
    }
    
}
