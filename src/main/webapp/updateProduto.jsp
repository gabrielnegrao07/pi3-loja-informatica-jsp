<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>:: ATUALIZAR PRODUTO - TADES ::</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="CSS\estiloCadastro.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <head>
    <body>	
        <div class="container">
            <header>
                <h1>ATUALIZAR PRODUTO</h1>
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

            <div class="formulario">
                <form autocomplete="off" action="UpdateProduto" method="post">
                    <input type="hidden" name="id"  value="${produto.id}" style="width: 300px; height: 20px">

                    <label>Nome do Produto:</label>
                    <input class="text" type="text" name="nome" value="${produto.nome}" style="width: 300px; height: 20px">

                    &nbsp;
                    &nbsp;
                    &nbsp;


                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label>Valor:</label>
                    <input class="text" type="text" name="valor" value="${produto.valor}" style="width: 220px; height: 20px">

                    <br>
                    <br>
                    <br>


                    <label>Descrição:</label>

                    <div class="textarea">
                        <input  type="text" name="descricao" value="${produto.descricao}" style="width: 1000px; height: 100px">
                    </div>

                    &nbsp;
                    &nbsp;

                    <br>
                    <br>
                    <br>
                    <br>
                    <br>

                    <label>Categoria:</label>
                    <select style="width: 100px; height: 20px" name="categoria">
                        <c:forEach var="cat" items="${categoria}">
                            <option
                                value="${cat.id}">${cat.nome}
                            </option>
                        </c:forEach>
                    </select>

                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;


                    <label>Filial:</label>
                    <select style="width: 100px; height: 20px" name="filial">
                        <c:forEach var="fil" items="${filial}">
                            <option
                                value="${fil.id}">${fil.nome}
                            </option>
                        </c:forEach>
                    </select>

                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label>Disponível:</label>
                    <select style="width: 100px; height: 20px" class="text"  name="habilitado" value="${produto.habilitado}">
                        <option>ATIVO</option>
                        <option>INATIVO</option>
                    </select>

                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <div class="buttom">
                        <button class="buttomConfirmar" type="submit" style="width: 150px; height: 30px">Atualizar</button>	
                        <input class="buttomCancelar" type="submit" name="cancelar" value="Cancelar" style="width: 150px; height: 30px">
                    </div>
                </form>
            </div>
            <div>
                <input class="buttomCancelar" type="submit" name="cancelar" value="Cancelar">
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
