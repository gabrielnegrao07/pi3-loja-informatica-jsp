package com.thewalkingchampions.servlet.Categoria;

import com.thewalkingchampions.service.CategoriaController;
import com.thewalkingchampions.model.Categoria;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateCategoria", urlPatterns = {"/UpdateCategoria"})
public class UpdateCategoria extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("action");
        String pagina;
        pagina = "index.jsp";
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");

                Categoria categoria = CategoriaController.searchID(Integer.parseInt(id));

                request.setAttribute("categoria", categoria);
                pagina = "updateCategoria.jsp";
            }
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String msg;

        String id = request.getParameter("id");
        String nome = request.getParameter("nome");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("id", id);
        request.setAttribute("nome", nome);

        request.setAttribute("metodoHttp", "POST");

        CategoriaController.update(Integer.parseInt(id), nome);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchCategoria.jsp");
        dispatcher.forward(request, response);
    }
}
