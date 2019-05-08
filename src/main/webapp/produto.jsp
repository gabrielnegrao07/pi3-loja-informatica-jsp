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
    <c:url value="/product/register" var="registerUrl" />
    <form action="${registerUrl}" method="post">
        <table>
            <c:if test="${produto.id ne null}">
                <tr>
                <td>ID:</td>
                    <td><input type="text" name="id" value="${produto.id}" readonly="readonly"></td>
                </tr>
            </c:if>
            <tr>
                <td>Nome do Produto:</td>
                <td><input type="text" name="nome" value="${produto.nomeProduto}" required></td>
            </tr>
            <tr>
                <td>Quantidade:</td>
                <td><input type="text" name="qtde" value="${produto.qtdeProduto}" required></td>
            </tr>
            <tr>
                <td>Valor:</td>
                <td><input type="text" name="valor" value="${produto.valorProduto}" required></td>
            </tr>
            <tr>
                <td>Descrição:</td>
                <td><input type="text" name="desc" value="${produto.descProduto}" required></td>
            </tr>
            <tr>
                <td>Categoria:</td>
                <td><input type="text" name="categoria" value="${produto.categoriaProduto}" required></td>
            </tr>
            <tr>
                <td>Disponível:</td>
                <td><input type="text" name="disponivel" value="${produto.disponivelProduto}" required></td>
            </tr>
 
            <c:if test="${produto.id ne null}">
                <tr>
                    <td colspan="2"><input type="submit" value="Update"></td>
                </tr>
            </c:if>
            <c:if test="${produto.id eq null}">
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>
            </c:if>
        </table>
    </form>
    <br>
    <h1>Lista de Produtos</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Nome do Produto</th>
            <th>Quantidade</th>
            <th>Valor</th>
            <th>Descrição</th>
            <th>Categoria</th>
            <th>Disponível</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${produtoList}" var="produto">
            <tr>
                <td>${produto.id}</td>
                <td>${produto.nomeProduto}</td>
                <td>${produto.qtdeProduto}</td>
                <td>${produto.valorProduto}</td>
                <td>${produto.descProduto}</td>
                <td>${produto.categoriaProduto}</td>
                <td>${produto.disponivelProduto}</td>
                 
                <td>
                    <form action="<c:url value="/product/update"/>" method="post">
                        <input type="hidden" name="id" value="${produto.id}">
                        <input type="submit" value="Update">
                    </form>
                <td>
                    <form action="<c:url value="/product/delete"/>" method="post">
                        <input type="hidden" name="id" value="${produto.id}">
                        <input style="background: #F00;" type="submit" value="Delete">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>