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
                    <th>CNPJ</th>
                    <th>Endereço</th>
                    <th>Numero</th>
                    <th>Estado</th>
                    <th>Email</th>
                    <th>Telefone</th>
                    <th colspan="2">Ação</th>
                </tr>

                <c:forEach var="filial" items="${search}" >
                    <tr>
                        <td><c:out value="${filial.id}"/></td>
                        <td><c:out value="${filial.nome}"/></td>
                        <td><c:out value="${filial.cnpj}"/></td>
                        <td><c:out value="${filial.endereco}"/></td>
                        <td><c:out value="${filial.numero}"/></td>
                        <td><c:out value="${filial.estado}"/></td>
                        <td><c:out value="${filial.email}"/></td>
                        <td><c:out value="${filial.telefone}"/></td>
                    <form method="post" action="${pageContext.request.contextPath}/DeleteFilial">
                        <td><button type="submit" value="${filial.id}" name="id">Delete</button></td>
                    </form>     
                    <td><a href="UpdateFilial?action=upd&id=${filial.id}"><button type="submit" value="${filial.id}" name="id">Update</button></a></td>
                    </tr>                  
                </c:forEach>
                </form>
            </table>
        </div>
    </body>
</html>
