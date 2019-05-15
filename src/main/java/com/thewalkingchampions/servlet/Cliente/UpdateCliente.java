package com.thewalkingchampions.servlet.Cliente;

import com.thewalkingchampions.controller.ClienteController;
import com.thewalkingchampions.model.Cliente;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateCliente", urlPatterns = {"/UpdateCliente"})
public class UpdateCliente extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("action");
        String pagina;
        pagina = "index.jsp";
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");
                //Busco o registro que eu quero exibir

                Cliente cliente = ClienteController.searchID(Integer.parseInt(id));

                request.setAttribute("cliente", cliente);
                pagina = "updateCliente.jsp";

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
        String cpf = request.getParameter("cpf");
        String rg = request.getParameter("rg");
        String endereco = request.getParameter("endereco");
        String numero = request.getParameter("numero");
        String complemento = request.getParameter("complemento");
        String cidade = request.getParameter("cidade");
        String bairro = request.getParameter("bairro");
        String estado = request.getParameter("estado");
        String cep = request.getParameter("cep");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String celular = request.getParameter("celular");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("id", id);
        request.setAttribute("nome", nome);
        request.setAttribute("cpf", cpf);
        request.setAttribute("rg", rg);
        request.setAttribute("endereco", endereco);
        request.setAttribute("numero", numero);
        request.setAttribute("complemento", complemento);
        request.setAttribute("cidade", cidade);
        request.setAttribute("bairro", bairro);
        request.setAttribute("estado", estado);
        request.setAttribute("cep", cep);
        request.setAttribute("telefone", telefone);
        request.setAttribute("celular", celular);
        request.setAttribute("email", email);

        request.setAttribute("metodoHttp", "POST");

        boolean cond = ClienteController.update(Integer.parseInt(id), nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep, email, telefone, celular);

        if (cond == true) {
            msg = "Alteração realizada com sucesso";
        } else {
            msg = "Erro ao executar a alteração";
        }
        request.setAttribute("msg", msg);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("updateCliente.jsp");
        dispatcher.forward(request, response);
    }
}
