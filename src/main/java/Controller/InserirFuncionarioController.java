package Controller;

import InterDao.FuncionarioDaoInte;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import DAO.FuncionarioDAO;
import Model.Funcionario;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "inserirfuncionariocontroller", urlPatterns = {"/inserirfuncionariocontroller"})

public class InserirFuncionarioController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private FuncionarioDaoInte dao = (FuncionarioDaoInte) FuncionarioDAO.getInstance();

    public InserirFuncionarioController() {
        // Do Nothing
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/incluirFuncionario.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("IDFUNCIONARIO"));
        String nome = request.getParameter("NOME");
        String acesso = request.getParameter("ACESSO");
        String filial = request.getParameter("FILIAL");

        Funcionario funcionario = new Funcionario(nome, acesso, filial);

        if (id == 0) {
            dao.Inserir(funcionario);
        } else {
            int idF = id;
            funcionario.setIdFuncionario(id);
            dao.Atualizar(funcionario);
        }

        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/consultarFuncionario.jsp");
        dispatcher.forward(request, response);
    }

}
