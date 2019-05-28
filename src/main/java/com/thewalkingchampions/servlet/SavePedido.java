package com.thewalkingchampions.servlet;

import auxilio.AdicionaItens;
import com.thewalkingchampions.controller.ProdutoController;
import com.thewalkingchampions.controller.EstoqueController;
import com.thewalkingchampions.controller.PedidoController;
import com.thewalkingchampions.controller.PedidoItensController;
import com.thewalkingchampions.controller.ClienteController;
import com.thewalkingchampions.model.Produto;
import com.thewalkingchampions.model.Cliente;
import com.thewalkingchampions.model.Pedido;
import com.thewalkingchampions.model.PedidoItens;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SavePedido", urlPatterns = {"/SavePedido"})
public class SavePedido extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acao = request.getParameter("action");
        switch (acao) {
            case "savar": {

                List<Produto> produto = ProdutoController.listAll();
                Cliente cliente = new Cliente();

                String id = request.getParameter("id");
                Produto p = new Produto();
                p.setId(Integer.parseInt(id));

                HttpSession session = request.getSession(true);
                ArrayList retornoLista = (ArrayList) session.getAttribute("lista");

                retornoLista = new AdicionaItens().AdicionaItens(p, retornoLista);

                List<Produto> list = retornoLista;

                request.setAttribute("search", list);

                request.setAttribute("cliente", cliente);
                request.setAttribute("produto", produto);
                session.setAttribute("lista", retornoLista);

                RequestDispatcher dispatcher
                        = request.getRequestDispatcher("savePedido.jsp");
                dispatcher.forward(request, response);

            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idCliente = request.getParameter("idCliente");
        String quantidade[] = request.getParameterValues("quantidade");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("idCliente", idCliente);
        request.setAttribute("quantidade", quantidade);

        PedidoController.save(Integer.parseInt("1"), Float.parseFloat("0"), Float.parseFloat("0"), Float.parseFloat("0"));

        Pedido pedido = PedidoController.searchID(Integer.parseInt("1"));
        Produto produto = new Produto();

        HttpSession session = request.getSession(true);
        ArrayList retornoLista = (ArrayList) session.getAttribute("lista");
        retornoLista = new AdicionaItens().AdicionaItens(produto, retornoLista);

        List<Produto> lista = retornoLista;

        for (int i = 0; i < lista.size(); i++) {
            PedidoItensController.save(pedido.getId(), lista.get(i).getId(), lista.get(i).getValor(), Integer.parseInt(quantidade[i]));
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
