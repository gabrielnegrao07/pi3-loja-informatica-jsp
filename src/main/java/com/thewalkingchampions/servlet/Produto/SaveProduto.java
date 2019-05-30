package com.thewalkingchampions.servlet.Produto;

import com.thewalkingchampions.controller.CategoriaController;
import com.thewalkingchampions.controller.FilialController;
import com.thewalkingchampions.controller.ProdutoController;
import com.thewalkingchampions.controller.EstoqueController;
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

@WebServlet(name = "SaveProduto", urlPatterns = {"/SaveProduto"})
public class SaveProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("action");
        switch (acao) {
            case "salvar": {

                List<Filial> filial = FilialController.listAll();
                List<Categoria> categoria = CategoriaController.listAll();

                request.setAttribute("filial", filial);
                request.setAttribute("categoria", categoria);

                RequestDispatcher dispatcher
                        = request.getRequestDispatcher("saveProduto.jsp");
                dispatcher.forward(request, response);

            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String msg;

        String nome = request.getParameter("nome");
        String quantidade = request.getParameter("quantidade");
        String valor = request.getParameter("valor");
        String descricao = request.getParameter("descricao");
        String categoria = request.getParameter("categoria");
        String filial = request.getParameter("filial");
        String habilitado = request.getParameter("habilitado");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("nome", nome);
        request.setAttribute("quantidade", quantidade);
        request.setAttribute("valor", valor);
        request.setAttribute("descricao", descricao);
        request.setAttribute("categoria", categoria);
        request.setAttribute("filial", filial);
        request.setAttribute("habilitado", habilitado);

        boolean status = false;

        if (habilitado.equals("habilitado")) {
            status = true;
        }

        boolean cond = ProdutoController.save(nome, Float.parseFloat(valor), descricao, Integer.parseInt(categoria), Integer.parseInt(filial), status);

        Produto p = ProdutoController.searchEstoqueID(nome, Integer.parseInt(filial));

        EstoqueController.save(p.getId(), Integer.parseInt(quantidade));

        if (cond == true) {
            msg = "Cadastro realizado com sucesso";
        } else {
            msg = "Erro ao executar o Cadastro";
        }

        request.setAttribute("msg", msg);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
