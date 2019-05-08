<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Servlet, JSP and JDBC CRUD Operations</title>

        <style type="text/css">
            body{
                text-align: center;
            }
            table {
                margin-left: 15%;
                min-width: 70%;
                border: 1px solid #CCC;
                border-collapse: collapse;
            }
            table tr{line-height: 30px;}
            table tr th { background: #000033; color: #FFF;}
            table tr td { border:1px solid #CCC; margin: 5px;}
            input[type=text], input[type=email], input[type=tel]{
                min-width: 60%;
            }
            input[type=submit], a{
                background: green;
                padding: 5px;
                margin: 5px;
                color: #FFF;
            }
            a{
                text-decoration: none;
            }
        </style>
    </head>
    <body>
        <h1>Servlet, JSP and JDBC CRUD Operations</h1>
        <c:url value="/customer/register" var="registerUrl" />
        <form action="${registerUrl}" method="post">
            <table>
                <c:if test="${cliente.id ne null}">
                    <tr>
                        <td>ID:</td>
                        <td><input type="text" name="id" value="${cliente.id}" readonly="readonly"></td>
                    </tr>
                </c:if>
                <tr>
                    <td>Nome:</td>
                    <td><input type="text" name="nome" value="${cliente.nomeCliente}" required></td>
                </tr>
                <tr>
                    <td>CPF:</td>
                    <td><input type="text" name="cpf" value="${cliente.cpfCliente}" required></td>
                </tr>
                <tr>
                    <td>Telefone:</td>
                    <td><input type="tel" pattern="{9}" name="telefone" value="${cliente.telefoneCliente}" required></td>
                </tr>
                <tr>
                    <td>Email:</td>
                    <td><input type="email" name="email" value="${cliente.emailCliente}" required></td>
                </tr>

                <c:if test="${cliente.id ne null}">
                    <tr>
                        <td colspan="2"><input type="submit" value="Update"></td>
                    </tr>
                </c:if>
                <c:if test="${cliente.id eq null}">
                    <tr>
                        <td colspan="2"><input type="submit" value="Save"></td>
                    </tr>
                </c:if>
            </table>
        </form>
        <br>
        <h1>List of Customers</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>CPF</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${clienteList}" var="cliente">
                <tr>
                    <td>${cliente.id}</td>
                    <td>${cliente.nomeCliente}</td>
                    <td>${cliente.cpfCliente}</td>
                    <td>${cliente.emailCliente}</td>
                    <td>${cliente.telefoneCliente}</td>

                    <td>
                        <form action="<c:url value="/customer/update"/>" method="post">
                            <input type="hidden" name="id" value="${cliente.id}">
                            <input type="submit" value="Update">
                        </form>
                    <td>
                        <form action="<c:url value="/customer/delete"/>" method="post">
                            <input type="hidden" name="id" value="${cliente.id}">
                            <input style="background: #F00;" type="submit" value="Delete">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>