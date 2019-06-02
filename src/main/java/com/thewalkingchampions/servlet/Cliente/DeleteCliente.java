package com.thewalkingchampions.servlet.Cliente;

import com.thewalkingchampions.service.ClienteController;
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
        String msg;
        String id = request.getParameter("id");

        boolean cond = ClienteController.delete(Integer.parseInt(id));

        if (cond == true) {
            msg = "Excluido com sucesso";
        } else {
            msg = "Erro ao excluir";
        }

        request.setAttribute("msg", msg);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchCliente.jsp");
        dispatcher.forward(request, response);
    }
}
