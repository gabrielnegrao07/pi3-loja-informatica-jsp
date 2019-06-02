package com.thewalkingchampions.servlet.Filial;

import com.thewalkingchampions.service.FilialController;
import com.thewalkingchampions.model.Filial;
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
@WebServlet(name = "SearchFilial", urlPatterns = {"/SearchFilial"})
public class SearchFilial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Filial> filiais = FilialController.listAll();
        
        
        request.setAttribute("search", filiais);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchFilial.jsp");
        dispatcher.forward(request, response);
    }

}
