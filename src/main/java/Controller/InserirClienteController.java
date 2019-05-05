package Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import DAO.ClienteDAO;
import InterDao.ClienteDaoInte;
import Model.Cliente;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "inserirclientecontroller", urlPatterns = {"/inserirclientecontroller"})

public class InserirClienteController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ClienteDaoInte dao = (ClienteDaoInte) ClienteDAO.getInstance();

    public InserirClienteController() {
        // Do Nothing
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/consultarCliente.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("IDCLIENTE"));
        String nome = request.getParameter("NOME");
        int cpf = Integer.parseInt(request.getParameter("CPF"));
        int telefone = Integer.parseInt(request.getParameter("TELEFONE"));
        String email = request.getParameter("EMAIL");

        Cliente cliente = new Cliente(nome, cpf, telefone, email);

        if (id == 0) {
            dao.Inserir(cliente);
        } else {
            int idC = id;
            cliente.setIdCliente(id);
            dao.Atualizar(cliente);
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/consultarCliente.jsp");
        dispatcher.forward(request, response);
    }

}
