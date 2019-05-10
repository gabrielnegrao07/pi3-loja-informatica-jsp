package com.thewalkingchampions.servlet;


import com.thewalkingchampions.controller.ProdutoController;
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
@WebServlet(name = "SaveProduto", urlPatterns = {"/SaveProduto"})
public class SaveProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("saveProduto.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        String valor = request.getParameter("valor");
        String quantidade = request.getParameter("quantidade");
        String habilitado = request.getParameter("habilitado");
        String idCategoria = request.getParameter("idCategoria");
        String idFilial = request.getParameter("idFilial");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("id", id);
        request.setAttribute("nome", nome);
        request.setAttribute("descricao", descricao);
        request.setAttribute("valor", valor);
        request.setAttribute("quantidade", quantidade);
        request.setAttribute("habilitado", habilitado);
        request.setAttribute("idCategoria", idCategoria);
        request.setAttribute("idFilial", idFilial);
        habilitado = "true";
        idCategoria = "0";
        idFilial = "0";

        ProdutoController.save(nome, descricao, Float.parseFloat(valor), Integer.parseInt(quantidade), Boolean.parseBoolean(habilitado), Integer.parseInt(idCategoria), Integer.parseInt(idFilial));

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
