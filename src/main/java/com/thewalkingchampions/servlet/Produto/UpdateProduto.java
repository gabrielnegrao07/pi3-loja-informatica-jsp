package com.thewalkingchampions.servlet.Produto;

import com.thewalkingchampions.controller.ProdutoController;
import com.thewalkingchampions.model.Produto;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateProduto", urlPatterns = {"/UpdateProduto"})
public class UpdateProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("action");
        String pagina;
        pagina = "index.jsp";
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");

                Produto produto = ProdutoController.searchID(Integer.parseInt(id));

                request.setAttribute("produto", produto);
                pagina = "updateProduto.jsp";

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
        String quantidade = request.getParameter("quantidade");
        String valor = request.getParameter("valor");
        String descricao = request.getParameter("descricao");
        String categoria = request.getParameter("categoria");
        String filial = request.getParameter("filial");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("id", id);
        request.setAttribute("nome", nome);
        request.setAttribute("quantidade", quantidade);
        request.setAttribute("valor", valor);
        request.setAttribute("categoria", categoria);
        request.setAttribute("filial", filial);

        request.setAttribute("metodoHttp", "POST");

        /*boolean cond = ProdutoController.update(Integer.parseInt(id), nome, Integer.parseInt(quantidade), Float.parseFloat(valor), descricao, categoria, filial, true);

        if (cond == true) {
            msg = "Alteração realizada com sucesso";
        } else {
            msg = "Erro ao executar a alteração";
        }
        request.setAttribute("msg", msg);*/

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("updateCliente.jsp");
        dispatcher.forward(request, response);
    }
}
