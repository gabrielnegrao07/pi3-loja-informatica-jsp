/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author IDCOM
 */
@WebServlet(name = "inserirprodutocontroller", urlPatterns = {"/inserirprodutocontroller"})
    

public class InserirProdutoController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private ProdutoDaoInte dao = (ProdutoDaoInte) ProdutoDAO.getInstance();

    public InserirProdutoController() {
        // Do Nothing
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/cadastroProduto.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("IDPRODUTO"));
        String nome = request.getParameter("NOME");
        int quantidade = Integer.parseInt(request.getParameter("QUANTIDADE"));
        float valor = Float.parseFloat(request.getParameter("VALOR"));
        String descricao = request.getParameter("DESCRICAO");
        boolean habilitado = Boolean.parseBoolean(request.getParameter("HABILITDAO"));

        Produto produto = new Produto(nome, quantidade, valor, descricao, habilitado);

        if (id == 0) {
            dao.Inserir(produto);
        } else {
            int idP = id;
            produto.setIdProduto(id);
            dao.Atualizar(produto);
        }

        response.sendRedirect(request.getContextPath() + "/");
    }

}
