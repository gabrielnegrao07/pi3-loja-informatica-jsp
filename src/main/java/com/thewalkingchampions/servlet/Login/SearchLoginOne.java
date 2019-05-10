package com.thewalkingchampions.servlet.Login;

import com.thewalkingchampions.controller.LoginController;
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
@WebServlet(name = "SearchLoginOne", urlPatterns = {"/SearchLoginOne"})
public class SearchLoginOne extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String login = request.getParameter("nome");
        String senha = request.getParameter("senha");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("login", login);
        request.setAttribute("senha", senha);

        boolean cond = LoginController.searchOne(login, senha);

        request.setAttribute("search", cond);

        if (cond == true) {
            RequestDispatcher dispatcher
                    = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher
                    = request.getRequestDispatcher("login.jsp");
            dispatcher.forward(request, response);
        }

    }

}
