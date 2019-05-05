package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClienteDao;
import interDAO.ClienteDaoImpl;
import model.Cliente;

@WebServlet(name = "/customer/update", urlPatterns = {"/customer/update"})

public class UpdateClienteController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public UpdateClienteController() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");

        if (id == "" || id == null) {
            request.getRequestDispatcher("/").forward(request, response);
        } else {
            int idC = Integer.parseInt(id);
            ClienteDao clienteDao = ClienteDaoImpl.getInstance();
            Cliente cliente = clienteDao.searchClienteId(idC);

            request.setAttribute("cliente", cliente);

            request.getRequestDispatcher("/").forward(request, response);
        }
    }
}
