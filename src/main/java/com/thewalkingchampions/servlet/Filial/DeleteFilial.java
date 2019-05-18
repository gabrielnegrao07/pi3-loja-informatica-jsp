package com.thewalkingchampions.servlet.Filial;

import com.thewalkingchampions.controller.FilialController;
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
@WebServlet(name = "DeleteFilial", urlPatterns = {"/DeleteFilial"})
public class DeleteFilial extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String msg;
        
        String id = request.getParameter("id");

        boolean cond = FilialController.delete(Integer.parseInt(id));

       if (cond == true) {
            msg = "Cliente excluido com sucesso";
        } else {
            msg = "Erro ao excluir cliente selecionado";
        }
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
}
