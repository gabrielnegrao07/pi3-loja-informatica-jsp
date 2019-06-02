package com.thewalkingchampions.servlet.Filial;

import com.thewalkingchampions.service.FilialController;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SaveFilial", urlPatterns = {"/SaveFilial"})
public class SaveFilial extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("saveFilial.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String msg;

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

        boolean cond = FilialController.save(nome, cnpj, ie, endereco, numero, complemento, bairro, cidade, estado, cep, email, telefone, status);

        if (cond == true) {
            msg = "Filial cadastrada com sucesso";
        } else {
            msg = "Erro ao executar o cadastro";
        }
        request.setAttribute("msg", msg);
        
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("saveFilial.jsp");
        dispatcher.forward(request, response);
    }
}
