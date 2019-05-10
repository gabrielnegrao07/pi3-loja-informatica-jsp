<%@page import="com.thewalkingchampions.controller.FuncionarioController"%>
<%@page import="com.thewalkingchampions.dao.FuncionarioDao"%>
<%@page import="com.thewalkingchampions.model.Funcionario"%>
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

                <c:forEach var="funcionarios" items="${search}" >
                    <tr>
                        <td class="text-center"><c:out value="${funcionarios.id}"/></td>
                        <td class="text-center"><c:out value="${funcionarios.nome}"/></td>
                        <td class="text-center"><c:out value="${funcionarios.cpf}"/></td>
                        <td class="text-center"><c:out value="${funcionarios.telefone}"/></td>
                        <td class="text-center"><c:out value="${funcionarios.email}"/></td>
                    <form method="post" action="${pageContext.request.contextPath}/DeleteFuncionario">
                        <td><button type="submit" value="${funcionarios.id}" name="id">Delete</button></td>
                    </form>
                    <form method="post" action="${pageContext.request.contextPath}/UpdateFuncionario">
                        <td><button type="submit" value="${funcionarios.id}" name="id">Update</button></td>
                    </form>
                    </tr>                  
                </c:forEach>
                </form>
            </table>
            <input class="btn btn-info btn-sm" type="submit" value="Pagina inicial" OnClick="parent.location.href = 'index.jsp'">
        </div>
    </body>
</html>
