
package com.thewalkingchampions.controller;

import com.thewalkingchampions.model.User;
import com.thewalkingchampions.model.Papel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class LoginService {

    private static final Map<String, User> USUARIOS_CADASTRADOS
            = new LinkedHashMap<>();

    static {
        USUARIOS_CADASTRADOS.put("denver", new User("denver",
                "Ricardo Ramos", "abcd1234",
                Arrays.asList(new Papel("PEAO"))));
        USUARIOS_CADASTRADOS.put("tokio", new User("tokio",
                "Silene Oliveira", "abcd1234",
                Arrays.asList(new Papel("PEAO"))));
        USUARIOS_CADASTRADOS.put("berlin", new User("berlin",
                "Andres de Fonollosa", "abcd1234",
                Arrays.asList(new Papel("PEAO"), new Papel("FODON"))));
        USUARIOS_CADASTRADOS.put("root", new User("root",
                "Sergio Marquina", "1234",
                Arrays.asList(new Papel("PEAO"), new Papel("GOD"))));
    }

    public User buscarPorUsername(String username) {
        return USUARIOS_CADASTRADOS.get(username);
    }
}
