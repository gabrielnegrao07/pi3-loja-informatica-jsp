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

@WebServlet(name = "/product/update", urlPatterns = {"/product/update"})

public class UpdateProdutoController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public UpdateProdutoController() {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");

        if (id == "" || id == null) {
            request.getRequestDispatcher("/").forward(request, response);
        } else {
            int idP = Integer.parseInt(id);
            ProdutoDao produtoDao = ProdutoDaoImpl.getInstance();
            Produto produto = produtoDao.searchProdutoId(idP);

            request.setAttribute("produto", produto);

            request.getRequestDispatcher("/").forward(request, response);
        }
    }
}
