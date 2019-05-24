package com.thewalkingchampions.servlet.Estoque;

import com.thewalkingchampions.controller.EstoqueController;
import com.thewalkingchampions.model.Estoque;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateEstoque", urlPatterns = {"/UpdateEstoque"})
public class UpdateEstoque extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("action");
        String pagina;
        pagina = "index.jsp";
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");

                Estoque estoque = EstoqueController.searchID(Integer.parseInt(id));

                request.setAttribute("estoque", estoque);
                pagina = "updateEstoque.jsp";
            }
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String msg;

        String id = request.getParameter("id");
        String quantidade = request.getParameter("quantidade");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("id", id);
        request.setAttribute("quantidade", quantidade);

        request.setAttribute("metodoHttp", "POST");

        boolean cond = EstoqueController.update(Integer.parseInt(id), Integer.parseInt(quantidade));

        if (cond == true) {
            msg = "Alteração realizada com sucesso";
        } else {
            msg = "Erro ao executar a alteração";
        }

        request.setAttribute("msg", msg);
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
