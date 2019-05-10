package com.thewalkingchampions.servlet;

import com.thewalkingchampions.controller.ProdutoController;
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
@WebServlet(name = "DeleteProduto", urlPatterns = {"/DeleteProduto"})
public class DeleteProduto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idProduto = request.getParameter("idProduto");

        ProdutoController.delete(Integer.parseInt(idProduto));

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
