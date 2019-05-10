package com.thewalkingchampions.servlet.Cliente;

import com.thewalkingchampions.controller.ClienteController;
import java.io.IOException;
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
@WebServlet(name = "DeleteCliente", urlPatterns = {"/DeleteCliente"})
public class DeleteCliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");

        ClienteController.delete(Integer.parseInt(id));

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
