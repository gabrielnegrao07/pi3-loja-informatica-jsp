package com.thewalkingchampions.servlet.Cliente;


import com.thewalkingchampions.service.ClienteController;
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
 * @author Johnathan
 */
@WebServlet(name = "SearchCliente", urlPatterns = {"/SearchCliente"})
public class SearchCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Cliente> clientes = ClienteController.listAll();
        
        
        request.setAttribute("search", clientes);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchCliente.jsp");
        dispatcher.forward(request, response);
    }

}
