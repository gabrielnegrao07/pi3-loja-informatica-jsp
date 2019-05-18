package com.thewalkingchampions.servlet.Funcionario;

import com.thewalkingchampions.controller.FuncionarioController;
import com.thewalkingchampions.model.Funcionario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateFuncionario", urlPatterns = {"/UpdateFuncionario"})
public class UpdateFuncionario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acao = request.getParameter("action");
        String pagina;
        pagina = "index.jsp";
        switch (acao) {
            case "upd": {
                String id = request.getParameter("id");

                Funcionario funcionario = FuncionarioController.searchID(Integer.parseInt(id));

                request.setAttribute("funcionario", funcionario);
                pagina = "updateFuncionario.jsp";

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
        String filial = request.getParameter("filial");
        String cargo = request.getParameter("cargo");
        String habilitado = request.getParameter("habilitado");

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
        request.setAttribute("email", email);
        request.setAttribute("telefone", telefone);
        request.setAttribute("celular", celular);
        request.setAttribute("filial", filial);
        request.setAttribute("cargo", cargo);
        request.setAttribute("habilitado", habilitado);

        boolean status = false;

        if (habilitado.equals("Ativo")) {
            status = true;
        }

        request.setAttribute("metodoHttp", "POST");

        boolean cond = FuncionarioController.update(Integer.parseInt(id), nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep, email, telefone, celular, filial, cargo, status);

        if (cond == true) {
            msg = "Alteração realizada com sucesso";
        } else {
            msg = "Erro ao executar a alteração";
        }
        request.setAttribute("msg", msg);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("updateFuncionario.jsp");
        dispatcher.forward(request, response);
    }
}
