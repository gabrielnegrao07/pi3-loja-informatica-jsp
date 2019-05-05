package Controller;

import InterDao.ProdutoDaoInte;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import DAO.ProdutoDAO;
import Model.Produto;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "inserirprodutocontroller", urlPatterns = {"/inserirprodutocontroller"})

public class InserirProdutoController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ProdutoDaoInte dao = (ProdutoDaoInte) ProdutoDAO.getInstance();

    public InserirProdutoController() {
        // Do Nothing
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/incluirProduto.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("IDPRODUTO"));
        String nome = request.getParameter("NOME");
        int quantidade = Integer.parseInt(request.getParameter("QTDE"));
        float valor = Float.parseFloat(request.getParameter("VALOR"));
        String descricao = request.getParameter("DESC");
        String categoria = request.getParameter("CATEGORIA");
        boolean habilitado = Boolean.parseBoolean(request.getParameter("HABILITADO"));

        Produto produto = new Produto(nome, quantidade, valor, descricao, habilitado);

        if (id == 0) {
            dao.Inserir(produto);
        } else {
            int idP = id;
            produto.setIdProduto(id);
            dao.Atualizar(produto);
        }
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/WEB-INF/consultarProduto.jsp");
        dispatcher.forward(request, response);
    }

}
