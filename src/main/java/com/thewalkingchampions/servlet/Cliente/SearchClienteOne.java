package com.thewalkingchampions.servlet.Cliente;

import com.thewalkingchampions.controller.ClienteController;
import com.thewalkingchampions.model.Cliente;
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "SearchClienteOne", urlPatterns = {"/SearchClienteOne"})
public class SearchClienteOne extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");

        Cliente cliente = ClienteController.searchOne(Integer.parseInt(id));

        String nome = request.getParameter(cliente.getNome());
        String cpf = request.getParameter(cliente.getCpf());
        String telefone = request.getParameter(cliente.getTelefone());
        String email = request.getParameter(cliente.getEmail());

        request.setAttribute("metodoHttp", "POST");
        request.getParameter("id");
        request.getParameter(nome);
        request.getParameter(cpf);
        request.getParameter(telefone);
        request.getParameter(email);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("updateCliente.jsp");
        dispatcher.forward(request, response);
    }
}
