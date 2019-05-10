package com.thewalkingchampions.servlet;

import com.thewalkingchampions.controller.ProdutoController;
import com.thewalkingchampions.model.Produto;
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
@WebServlet(name = "SearchProduto", urlPatterns = {"/SearchProduto"})
public class SearchProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Produto> produtos = ProdutoController.listAll();
        
        
        request.setAttribute("search", produtos);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchProduto.jsp");
        dispatcher.forward(request, response);
    }

}
