package com.thewalkingchampions.servlet.pedido;

import auxilio.AdicionaItens;
import com.thewalkingchampions.controller.ProdutoController;
import com.thewalkingchampions.model.Cliente;
import com.thewalkingchampions.model.Produto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "InserirProdutoPedido", urlPatterns = {"/InserirProdutoPedido"})
public class InserirProdutoPedido extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pagina;
        String acao = request.getParameter("action");
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");
                String estoque = request.getParameter("estoque");
                Produto produto = ProdutoController.searchID(Integer.parseInt(id));
                HttpSession session = request.getSession(true);

                Cliente c = new Cliente();

                ArrayList retornoLista = (ArrayList) session.getAttribute("lista");
                retornoLista = new AdicionaItens().AdicionaItens(produto, retornoLista);

                Cliente retornoCliente = (Cliente) session.getAttribute("Cliente");
                retornoCliente = new AdicionaItens().clientePedido(c, retornoCliente);

                List<Produto> produtos = retornoLista;
                Cliente cliente = retornoCliente;
                session.setAttribute("lista", retornoLista);
                request.setAttribute("cliente", cliente);
                request.setAttribute("search", produtos);

                pagina = "savePedido.jsp";

                RequestDispatcher destino = request.getRequestDispatcher(pagina);
                destino.forward(request, response);
            }
        }
    }
}
