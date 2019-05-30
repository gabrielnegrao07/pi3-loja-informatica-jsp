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
        <title>:: CLIENTES- TADES ::</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="CSS\searchEstilo.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <head>
    <body>	
        <div class="container">
            <header>
                <h1>CLIENTES</h1>
                <div class="sidenav">
                    <button class="dropdown-btn" href="#">DASHBOARD</button>

                    <button class="dropdown-btn">PEDIDO 
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR PEDIDO</a>
                        <a href="#">CONSULTAR PEDIDO</a>
                    </div>

                    <button class="dropdown-btn">CLIENTE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR CLIENTE</a>
                        <a href="#">CONSULTAR CLIENTE</a>
                    </div>

                    <button class="dropdown-btn">PRODUTO
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR PRODUTO</a>
                        <a href="#">CONSULTAR PRODUTO</a>
                        <a href="#">INCLUIR CATEGORIA</a>
                        <a href="#">CONSULTAR CATEGORIA</a>
                    </div>

                    <button class="dropdown-btn">ESTOQUE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">CONSULTAR ESTOQUE</a>
                    </div>

                    <button class="dropdown-btn">RELATORIOS
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">SUB 1</a>
                        <a href="#">SUB 2</a>
                        <a href="#">SUB 3</a>
                    </div>

                    <button class="dropdown-btn">FUNCIONARIOS
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR FUNCIONARIOS</a>
                        <a href="#">CONSULTAR PRODUTO</a>
                    </div>

                    <button class="dropdown-btn">FILIAIS
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR FILIAIS</a>
                        <a href="#">CONSULTAR FILIAIS</a>
                    </div>

                    <button class="dropdown-btn">SUPORTE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">ABRIR CHAMADO</a>
                        <a href="#">CONSULTAR</a>
                    </div>
                </div>	
            </header>

            <div>

                <div>
                    <input type="text" name="filtro" placeholder="Digite..." style="width: 2000px; height: 30px">
                    <span class="input-group-btn"><button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button></span>
                </div>



                <table>
                    <div>
                        <div class="resposta">
                            ${msg}
                        </div>
                        <tr>
                            <th>ID</th>
                            <th>Nome</th>
                            <th>CPF</th>
                            <th>Email</th>
                            <th>Celular</th>
                            <th colspan="2">Ação</th>
                        </tr>


                        <c:forEach var="cliente" items="${search}" >
                            <tr>
                                <td><c:out value="${cliente.id}"/></td>
                                <td><c:out value="${cliente.nome}"/></td>
                                <td><c:out value="${cliente.cpf}"/></td>
                                <td><c:out value="${cliente.email}"/></td>
                                <td><c:out value="${cliente.celular}"/></td>
                            <form method="post" action="${pageContext.request.contextPath}/DeleteCliente">
                                <td><button class="buttomDeletar" type="submit" value="${cliente.id}" name="id" style="width: 70px; height: 30px">Delete</button></td>
                            </form>     
                            <td><a href="UpdateCliente?action=upd&id=${cliente.id}"><button class="buttomUpdate" type="submit" value="${cliente.id}" name="id" style="width: 70px; height: 30px">Atualizar</button></a></td>
                            </tr>                  
                        </c:forEach>
                        </form>
                </table>
            </div>
        </div>
    </div>
    <footer>
        <h2>TADES Inc. 2019</h2>
    </footer>

    <script>
        var dropdown = document.getElementsByClassName("dropdown-btn");
        var i;

        for (i = 0; i < dropdown.length; i++) {
            dropdown[i].addEventListener("click", function () {
                this.classList.toggle("active");
                var dropdownContent = this.nextElementSibling;
                if (dropdownContent.style.display === "block") {
                    dropdownContent.style.display = "none";
                } else {
                    dropdownContent.style.display = "block";
                }
            });
        }
    </script>
</body>
</html>