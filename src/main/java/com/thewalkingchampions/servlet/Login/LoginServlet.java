package com.thewalkingchampions.servlet.Login;

import com.thewalkingchampions.controller.LoginService;
import com.thewalkingchampions.model.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String senhaAberta = request.getParameter("senha");

        // 1) Verificar se existe usuario com username fornecido
        LoginService service = new LoginService();
        User usuario = service.buscarPorUsername(username);

        if (usuario != null && usuario.validarSenha(senhaAberta)) {
            // 2) Se usuario nao for nulo e senha for valida, coloca usuario na 
            // sessao e redireciona para tela principal
            HttpSession sessao = request.getSession();
            sessao.setAttribute("usuario", usuario);
            
            if (usuario.verificarPapel("PEAO")){
                response.sendRedirect("homep"); 
            }
            if (usuario.verificarPapel("GOD")){
                response.sendRedirect("homeg"); 
            }
            if (usuario.verificarPapel("FODON")){
                response.sendRedirect("home"); 
            }
            
        } else {
            // 3) Se usuario for nulo ou senha invalida, reapresenta tela de login
            // com mensagem de erro.
            request.setAttribute("msgErro", "Usuario ou senha inválido");
            request.getRequestDispatcher("login.jsp")
                    .forward(request, response);
        }
    }
}
