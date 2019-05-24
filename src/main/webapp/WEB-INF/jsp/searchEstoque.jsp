<%@page import="com.thewalkingchampions.controller.ClienteController"%>
<%@page import="com.thewalkingchampions.dao.ClienteDAO"%>
<%@page import="com.thewalkingchampions.model.Cliente"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>

    </head>
    <body>	

        ${msg}

        <div>
            <table>
                <tr>
                    <th>ID</th>
                    <th>Nome</th>
                    <th>Quantidade</th>

                    <th colspan="1">Ação</th>
                </tr>

                <c:forEach var="estoque" items="${search}" >
                    <tr>
                        <td><c:out value="${estoque.idProduto}"/></td>
                        <td><c:out value="${estoque.nome}"/></td>
                        <td><c:out value="${estoque.quantidade}"/></td>

                        <td><a href="UpdateEstoque?action=upd&id=${estoque.idProduto}"><button type="submit" value="${estoque.idProduto}" name="id">Update</button></a></td>
                    </tr>                  
                </c:forEach>
                </form>
            </table>
        </div>
    </body>
</html>
