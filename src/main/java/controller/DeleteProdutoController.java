package controller;
 
import java.io.IOException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.ProdutoDao;
import interDAO.ProdutoDaoImpl;
 
@WebServlet(name ="/product/delete", urlPatterns = {"/product/delete"})

public class DeleteProdutoController extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public DeleteProdutoController() {
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String id = request.getParameter("id");
 
        if (id == "" || id== null)
            request.getRequestDispatcher("/").forward(request, response);
        else {
            int idP = Integer.parseInt(id);
            ProdutoDao produtoDao = ProdutoDaoImpl.getInstance();
 
            produtoDao.deleteProduto(idP);
 
            response.sendRedirect(request.getContextPath() + "/");
        }
    }
}