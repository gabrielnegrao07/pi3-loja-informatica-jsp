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
                    <th class="text-center">CPF</th>
                    <th class="text-center">Telefone</th>
                    <th class="text-center">Email</th>
                    <th class="text-center" colspan="2">Ação</th>
                </tr>

                <c:forEach var="cat" items="${search}" >
                    <tr>
                        <td class="text-center"><c:out value="${cat.id}"/></td>
                        <td class="text-center"><c:out value="${cat.nome}"/></td>
                        <td class="text-center"><c:out value="${cat.cpf}"/></td>
                        <td class="text-center"><c:out value="${cat.telefone}"/></td>
                        <td class="text-center"><c:out value="${cat.email}"/></td>
                    <form method="post" action="${pageContext.request.contextPath}/DeleteCliente">
                        <td><button type="submit" value="${cat.id}" name="id">Delete</button></td>
                    </form>
                    <form method="post" action="${pageContext.request.contextPath}/UpdateCliente">
                        <td><button type="submit" value="${cat.id}" name="id">Update</button></td>
                    </form>
                    </tr>                  
                </c:forEach>
                </form>
            </table>
            <input class="btn btn-info btn-sm" type="submit" value="Pagina inicial" OnClick="parent.location.href = 'index.jsp'">
        </div>
    </body>
</html>
