package com.thewalkingchampions.servlet.pedido;

import auxilio.AdicionaItens;
import com.thewalkingchampions.controller.ProdutoController;
import com.thewalkingchampions.controller.PedidoController;
import com.thewalkingchampions.controller.PedidoItensController;
import com.thewalkingchampions.model.Produto;
import com.thewalkingchampions.model.Cliente;
import com.thewalkingchampions.model.Pedido;
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

@WebServlet(name = "SavePedido", urlPatterns = {"/SavePedido"})
public class SavePedido extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cliente c = new Cliente();
        Produto p = new Produto();

        HttpSession session = request.getSession(true);
        ArrayList retornoLista = (ArrayList) session.getAttribute("lista");
        retornoLista = new AdicionaItens().AdicionaItens(p, retornoLista);

        Cliente retornoCliente = (Cliente) session.getAttribute("Cliente");
        retornoCliente = new AdicionaItens().clientePedido(c, retornoCliente);

        Cliente cliente = retornoCliente;
        List<Produto> list = retornoLista;

        request.setAttribute("search", list);
        request.setAttribute("cliente", cliente);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("savePedido.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idCliente = request.getParameter("idCliente");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("idCliente", idCliente);

        PedidoController.save(Integer.parseInt(idCliente), Float.parseFloat("0"), Float.parseFloat("0"), Float.parseFloat("0"));

        Pedido pedido = PedidoController.searchID(Integer.parseInt(idCliente));
        Produto produto = new Produto();

        HttpSession session = request.getSession(true);
        ArrayList retornoLista = (ArrayList) session.getAttribute("lista");
        retornoLista = new AdicionaItens().AdicionaItens(produto, retornoLista);

        List<Produto> lista = retornoLista;

        for (int i = 0; i < lista.size(); i++) {
            PedidoItensController.save(pedido.getId(), lista.get(i).getId(), lista.get(i).getValor(), Integer.parseInt("2"));
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("savePedido.jsp");
        dispatcher.forward(request, response);
    }

}
