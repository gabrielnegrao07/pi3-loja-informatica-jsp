package com.thewalkingchampions.servlet.Funcionario;

import com.thewalkingchampions.controller.FuncionarioController;
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
@WebServlet(name = "SaveFuncionario", urlPatterns = {"/SaveFuncionario"})
public class SaveFuncionario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("saveFuncionario.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
        request.setAttribute("filial", filial);
        request.setAttribute("cargo", cargo);
        request.setAttribute("habilitado", habilitado);

        boolean status = false;

        if (habilitado.equals("Ativo")) {
            status = true;
        }

        FuncionarioController.save(nome, cpf, rg, endereco, numero, complemento, cidade, bairro, estado, cep, email, telefone, celular, filial, cargo, status);

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

}
