package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProdutoDao;
import interDAO.ProdutoDaoImpl;
import model.Produto;

@WebServlet(name = "/product/register", urlPatterns = {"/product/register"})

public class CreateProdutoController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ProdutoDao produtoDao = ProdutoDaoImpl.getInstance();

    public CreateProdutoController() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        String nomeProduto = request.getParameter("nome");
        String qtdeProduto = request.getParameter("qtde");
        String valorProduto = request.getParameter("valor");
        String descProduto = request.getParameter("desc");
        String categoriaProduto = request.getParameter("categoria");
        String disponivelProduto = request.getParameter("disponivel");

        Produto produto = new Produto(nomeProduto, qtdeProduto, valorProduto, descProduto, categoriaProduto, disponivelProduto);

        if (id == null || id == "") {
            produtoDao.saveProduto(produto);
        } else {
            int idP = Integer.parseInt(id);
            produto.setId(idP);
            produtoDao.updateProduto(produto);
        }

        response.sendRedirect(request.getContextPath() + "/");
    }

}
