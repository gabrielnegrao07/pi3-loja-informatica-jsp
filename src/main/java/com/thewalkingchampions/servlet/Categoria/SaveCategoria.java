package com.thewalkingchampions.servlet.Categoria;

import com.thewalkingchampions.service.CategoriaController;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SaveCategoria", urlPatterns = {"/SaveCategoria"})
public class SaveCategoria extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("saveCategoria.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String msg;

        String nome = request.getParameter("nome");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("nome", nome);


        boolean cond = CategoriaController.save(nome);

        if (cond == true) {
            msg = "Categoria cadastrada com sucesso";
        } else {
            msg = "Erro ao executar o cadastro";
        }
        request.setAttribute("msg", msg);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("saveCategoria.jsp");
        dispatcher.forward(request, response);
    }
}
