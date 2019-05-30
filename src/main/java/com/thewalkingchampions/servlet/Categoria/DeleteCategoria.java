package com.thewalkingchampions.servlet.Categoria;

import com.thewalkingchampions.controller.CategoriaController;
import java.io.IOException;
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
@WebServlet(name = "DeleteCategoria", urlPatterns = {"/DeleteCategoria"})
public class DeleteCategoria extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String msg;
        
        String id = request.getParameter("id");

        CategoriaController.delete(Integer.parseInt(id));

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchCategoria.jsp");
        dispatcher.forward(request, response);
    }
}
