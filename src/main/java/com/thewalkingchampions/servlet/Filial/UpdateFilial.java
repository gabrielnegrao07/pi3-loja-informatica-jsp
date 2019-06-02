package com.thewalkingchampions.servlet.Filial;

import com.thewalkingchampions.service.FilialController;
import com.thewalkingchampions.model.Filial;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateFilial", urlPatterns = {"/UpdateFilial"})
public class UpdateFilial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("action");
        String pagina;
        pagina = "index.jsp";
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");

                Filial filial = FilialController.searchID(Integer.parseInt(id));

                request.setAttribute("filial", filial);
                pagina = "updateFilial.jsp";
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
        String cnpj = request.getParameter("cnpj");
        String ie = request.getParameter("ie");
        String endereco = request.getParameter("endereco");
        String numero = request.getParameter("numero");
        String complemento = request.getParameter("complemento");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String cep = request.getParameter("cep");
        String email = request.getParameter("email");
        String telefone = request.getParameter("telefone");
        String habilitado = request.getParameter("habilitado");

        request.setAttribute("metodoHttp", "POST");
        request.setAttribute("id", id);
        request.setAttribute("nome", nome);
        request.setAttribute("cnpj", cnpj);
        request.setAttribute("ie", ie);
        request.setAttribute("endereco", endereco);
        request.setAttribute("numero", numero);
        request.setAttribute("complemento", complemento);
        request.setAttribute("bairro", bairro);
        request.setAttribute("cidade", cidade);
        request.setAttribute("estado", estado);
        request.setAttribute("cep", cep);
        request.setAttribute("telefone", telefone);
        request.setAttribute("email", email);
        request.setAttribute("habilitado", habilitado);

        boolean status = false;

        if (habilitado.equals("ATIVO")) {
            status = true;
        }

        request.setAttribute("metodoHttp", "POST");

        boolean cond = FilialController.update(Integer.parseInt(id), nome, cnpj, ie, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, status);

        if (cond == true) {
            msg = "Alteração realizada com sucesso";
        } else {
            msg = "Erro ao executar a alteração";
        }

        request.setAttribute("msg", msg);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/jsp/searchFilial.jsp");
        dispatcher.forward(request, response);
    }
}
