package com.thewalkingchampions.servlet.Cliente;

import com.thewalkingchampions.controller.ClienteController;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GIOVANNI.MCARIGNATO
 */
@WebServlet(name = "SaveCliente", urlPatterns = {"/SaveCliente"})
public class SaveCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("saveCliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("id", id);
        request.setAttribute("nome", nome);
        request.setAttribute("cpf", cpf);
        request.setAttribute("telefone", telefone);
        request.setAttribute("email", email);

        ClienteController.save(nome, cpf, telefone, email);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
