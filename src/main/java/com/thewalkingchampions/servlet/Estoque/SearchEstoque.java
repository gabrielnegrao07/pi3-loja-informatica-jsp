/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thewalkingchampions.servlet.Estoque;

import com.thewalkingchampions.service.EstoqueController;
import com.thewalkingchampions.model.Estoque;
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
 * @author johnathan.mbmata
 */
@WebServlet(name = "SearchEstoque", urlPatterns = {"/SearchEstoque"})
public class SearchEstoque extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Estoque> estoque = EstoqueController.listAll();

        request.setAttribute("search", estoque);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchEstoque.jsp");
        dispatcher.forward(request, response);
    }

}
