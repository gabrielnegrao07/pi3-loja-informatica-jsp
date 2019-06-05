package com.thewalkingchampions.servlet.Funcionario;

import com.thewalkingchampions.controller.FuncionarioController;
import com.thewalkingchampions.model.Funcionario;
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
@WebServlet(name = "SearchFuncionario", urlPatterns = {"/SearchFuncionario"})
public class SearchFuncionario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Funcionario> funcionarios = FuncionarioController.listAll();
        
        
        request.setAttribute("search", funcionarios);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchFuncionario.jsp");
        dispatcher.forward(request, response);
    }

}
