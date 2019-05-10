<%@page import="com.thewalkingchampions.controller.ProdutoController"%>
<%@page import="com.thewalkingchampions.dao.ProdutoDAO"%>
<%@page import="com.thewalkingchampions.model.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>JSP Page</title>
    </head>
    <body>
        <div class="cotainer">
            <h1>Consulta</h1>
            <hr>

            <table class="table table-bordered">
                <tr>
                    <th class="text-center">Id</th>
                    <th class="text-center">Nome</th>
                    <th class="text-center">Descrição</th>
                    <th class="text-center">Valor</th>
                    <th class="text-center">Quantidade</th>
                    <th class="text-center" colspan="2">Ação</th>
                </tr>

                <c:forEach var="produtos" items="${search}" >
                    <tr>
                        <td class="text-center"><c:out value="${produtos.idProduto}"/></td>
                        <td class="text-center"><c:out value="${produtos.nomeProduto}"/></td>
                        <td class="text-center"><c:out value="${produtos.descricaoProduto}"/></td>
                        <td class="text-center"><c:out value="${produtos.valorProduto}"/></td>
                        <td class="text-center"><c:out value="${produtos.quantidadeProduto}"/></td>
                        
                    <form method="post" action="${pageContext.request.contextPath}/DeleteProduto">
                        <td><button type="submit" value="${produtos.idProduto}" name="idProduto">Delete</button></td>
                    </form>
                    <form method="post" action="${pageContext.request.contextPath}/UpdateProduto">
                        <td><button type="submit" value="${produtos.idProduto}" name="id">Update</button></td>
                    </form>
                    </tr>                  
                </c:forEach>
                </form>
            </table>
            <input class="btn btn-info btn-sm" type="submit" value="Pagina inicial" OnClick="parent.location.href = 'index.jsp'">
        </div>
    </body>
</html>
