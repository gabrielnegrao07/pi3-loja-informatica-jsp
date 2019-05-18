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
        <title>Clientes</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="CSS\estiloList.css">
    </head>
    <body>	
        <div class="container">
            <header>
                <h1>DASHBOARD</h1>
                <nav>
                    <ul id=opcao>
                        <li><a href="#">DASHBOARD</a></li>
                        <li><a href="#">PEDIDO</a>
                            <ul>
                                <li><a href="#">INCLUIR PEDIDO</a></li>
                                <li><a href="#">CONSULTAR PEDIDO</a></li>
                            </ul>
                        </li>
                        <li><a href="#">CLIENTE</a>
                            <ul>
                                <li><a href="cadastroCliente.html">INCLUIR CLIENTE</a></li>
                                <li><a href="#">CONSULTAR CLIENTE</a></li>
                            </ul>
                        </li>
                        <li><a href="#">PRODUTO</a>
                            <ul>
                                <li><a href="#">INCLUIR PRODUTO</a></li>
                                <li><a href="#">CONSULTAR PRODUTO</a></li>
                            </ul>
                        </li>
                        <li><a href="#">ESTOQUE</a>
                            <ul>
                                <li><a href="#">CONSULTAR ESTOQUE</a></li>
                            </ul>
                        </li>
                        <li><a href="#">RELATORIOS</a>
                            <ul>
                                <li><a href="#">SUB 1</a></li>
                                <li><a href="#">SUB 2</a></li>
                                <li><a href="#">SUB 3</a></li>
                            </ul>
                        </li>
                        <li><a href="#">FUNCIONARIOS</a>
                            <ul>
                                <li><a href="#">INCLUIR FUNCIONARIOS</a></li>
                                <li><a href="#">CONSULTAR PRODUTO</a></li>
                            </ul>
                        </li>
                        <li><a href="#">FILIAIS</a>
                            <ul>
                                <li><a href="#">INCLUIR FILIAIS</a></li>
                                <li><a href="#">CONSULTAR FILIAIS</a></li>
                            </ul>
                        </li>
                        <li><a href="#">SUPORTE</a>
                            <ul>
                                <li><a href="#">ABRIR CHAMADO</a></li>
                                <li><a href="#">CONSULTAR</a></li>
                            </ul>
                        </li>
                    </ul>					
                </nav>	
            </header>

            <div class="index">

                <table class="table table-bordered">
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Valor</th>
                        <th>Descrição</th>
                        <th>Categoria</th>
                        <th>Filial</th>
                        <th colspan="2">Ação</th>
                    </tr>

                    <c:forEach var="produto" items="${search}" >
                        <tr>
                            <td><c:out value="${produto.id}"/></td>
                            <td><c:out value="${produto.nome}"/></td>
                            <td><c:out value="${produto.valor}"/></td>
                            <td><c:out value="${produto.descricao}"/></td>
                            <td><c:out value="${produto.categoria}"/></td>
                            <td><c:out value="${produto.filial}"/></td>
                        <form method="post" action="${pageContext.request.contextPath}/DeleteProduto">
                            <td><button type="submit" value="${produto.id}" name="id">Delete</button></td>
                        </form>     
                        <td><a href="UpdateProduto?action=upd&id=${produto.id}"><button type="submit" value="${produto.id}" name="id">Update</button></a></td>
                        </tr>                  
                    </c:forEach>
                    </form>
                </table>
            </div>
        </div>
        <footer>
            <h2>TADES Inc. 2019</h2>
        </footer>
    </body>
</html>
