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
                    <th colspan="2">Ação</th>
                </tr>

                <c:forEach var="categoria" items="${search}" >
                    <tr>
                        <td><c:out value="${categoria.id}"/></td>
                        <td><c:out value="${categoria.nome}"/></td>
                    <form method="post" action="${pageContext.request.contextPath}/DeleteCategoria">
                        <td><button type="submit" value="${categoria.id}" name="id">Delete</button></td>
                    </form>     
                    <td><a href="UpdateCategoria?action=upd&id=${categoria.id}"><button type="submit" value="${categoria.id}" name="id">Update</button></a></td>
                    </tr>                  
                </c:forEach>
                </form>
            </table>
        </div>
    </body>
</html>
