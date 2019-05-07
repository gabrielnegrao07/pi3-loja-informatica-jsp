package controller;
 
import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClienteDao;
import interDAO.ClienteDaoImpl;
import model.Cliente;
 
@WebServlet("/")
public class ClienteHomeController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    private ClienteDao clienteDao = ClienteDaoImpl.getInstance();
     
    public ClienteHomeController() {
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        List<Cliente> clientes = clienteDao.showAllCliente();
 
        request.setAttribute("clienteList", clientes);
 
        request.getRequestDispatcher("").forward(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}