package com.thewalkingchampions.servlet.Categoria;

import com.thewalkingchampions.controller.CategoriaController;
import com.thewalkingchampions.model.Categoria;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SearchCategoria", urlPatterns = {"/SearchCategoria"})
public class SearchCategoria extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Categoria> categorias = CategoriaController.listAll();
        
        
        request.setAttribute("search", categorias);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchCategoria.jsp");
        dispatcher.forward(request, response);
    }

}
