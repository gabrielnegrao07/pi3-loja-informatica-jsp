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

@WebServlet(name = "/customer/register", urlPatterns = {"/customer/register"})

public class CreateClienteController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ClienteDao clienteDao = ClienteDaoImpl.getInstance();

    public CreateClienteController() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String nomeCliente = request.getParameter("nome");
        String cpfCliente = request.getParameter("cpf");
        String telefoneCliente = request.getParameter("telefone");
        String emailCliente= request.getParameter("email");

        Cliente cliente= new Cliente(nomeCliente, cpfCliente, telefoneCliente, emailCliente);

        if (id == null || id == "") {
            clienteDao.saveCliente(cliente);
        } else {
            int idC = Integer.parseInt(id);
            cliente.setId(idC);
            clienteDao.updateCliente(cliente);
        }

        response.sendRedirect(request.getContextPath() + "/");
    }

}
