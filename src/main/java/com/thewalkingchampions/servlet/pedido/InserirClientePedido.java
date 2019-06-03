package com.thewalkingchampions.servlet.pedido;

import auxilio.AdicionaItens;
import com.thewalkingchampions.service.ClienteController;
import com.thewalkingchampions.model.Cliente;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "InserirClientePedido", urlPatterns = {"/InserirClientePedido"})
public class InserirClientePedido extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("action");
        String pagina;
        pagina = "savePedido.jsp";
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");

                Cliente c = ClienteController.searchID(Integer.parseInt(id));

                HttpSession session = request.getSession(true);
                Cliente retornoCliente = (Cliente) session.getAttribute("Cliente");
                retornoCliente = new AdicionaItens().clientePedido(c, retornoCliente);

                Cliente cliente = retornoCliente;
                session.setAttribute("Cliente", retornoCliente);
                request.setAttribute("cliente", cliente);
                pagina = "savePedido.jsp";
            }
        }
        RequestDispatcher destino = request.getRequestDispatcher(pagina);
        destino.forward(request, response);
    }
}
