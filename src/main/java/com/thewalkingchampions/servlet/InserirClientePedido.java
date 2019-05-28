package com.thewalkingchampions.servlet;

import auxilio.AdicionaItens;
import com.thewalkingchampions.servlet.Cliente.*;
import com.thewalkingchampions.controller.ClienteController;
import com.thewalkingchampions.model.Cliente;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "InserirClientePedido", urlPatterns = {"/InserirClientePedido"})
public class InserirClientePedido extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("action");
        String pagina;
        pagina = "savePedido.jsp";
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");

                Cliente cliente = ClienteController.searchID(Integer.parseInt(id));

                request.setAttribute("cliente", cliente);
                pagina = "savePedido.jsp";
            }
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }
}
