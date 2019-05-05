package controller;
 
import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ClienteDao;
import interDAO.ClienteDaoImpl;
 
@WebServlet(name ="/customer/delete", urlPatterns = {"/customer/delete"})

public class DeleteClienteController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public DeleteClienteController() {
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String id = request.getParameter("id");
 
        if (id == "" || id== null)
            request.getRequestDispatcher("/").forward(request, response);
        else {
            int idC = Integer.parseInt(id);
            ClienteDao clienteDao = ClienteDaoImpl.getInstance();
 
            clienteDao.deleteCliente(idC);
 
            response.sendRedirect(request.getContextPath() + "/");
        }
    }
}