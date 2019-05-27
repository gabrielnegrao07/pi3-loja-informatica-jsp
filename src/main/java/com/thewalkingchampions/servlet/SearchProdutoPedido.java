package com.thewalkingchampions.servlet;

import com.thewalkingchampions.controller.CategoriaController;
import com.thewalkingchampions.controller.FilialController;
import com.thewalkingchampions.controller.ProdutoController;
import com.thewalkingchampions.model.Categoria;
import com.thewalkingchampions.model.Filial;
import com.thewalkingchampions.model.Produto;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SearchProdutoPedido", urlPatterns = {"/SearchProdutoPedido"})
public class SearchProdutoPedido extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Produto> produtos = ProdutoController.listAll();
        
        request.setAttribute("search", produtos);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchProdutoPedido.jsp");
        dispatcher.forward(request, response);
    }

}
