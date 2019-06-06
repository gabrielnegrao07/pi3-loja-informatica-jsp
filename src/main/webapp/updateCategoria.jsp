<%-- 
    Document   : saveFilial
    Created on : 17/05/2019, 19:33:48
    Author     : Johnathan.mbmata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>:: ATUALIZAR CATEGORIA - TADES ::</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="CSS\estiloCadastro.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>	
        <div class="container">
            <header>
                <h1>ATUALIZAR CATEGORIA</h1>
                <div class="sidenav">
                   <button class="dropdown-btn" href="#">DASHBOARD</button>

                    <button class="dropdown-btn">PEDIDO 
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="savePedido.jsp">INCLUIR PEDIDO</a>
                        <a href="#">CONSULTAR PEDIDO</a>
                    </div>

                    <button class="dropdown-btn">CLIENTE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="saveCliente.jsp">INCLUIR CLIENTE</a>
                        <a OnClick="parent.location.href = 'SearchCliente'">CONSULTAR CLIENTE</a>
                    </div>

                    <button class="dropdown-btn">PRODUTO
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a a href="SaveProduto?action=salvar">INCLUIR PRODUTO</a>
                        <a OnClick="parent.location.href = 'SearchProduto'">CONSULTAR PRODUTO</a>
                        <a href="saveCategoria.jsp">INCLUIR CATEGORIA</a>
                        <a OnClick="parent.location.href = 'SearchCategoria'">CONSULTAR CATEGORIA</a>
                    </div>

                    <button class="dropdown-btn">ESTOQUE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a OnClick="parent.location.href = 'SearchEstoque'">CONSULTAR ESTOQUE</a>
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
                        <a href="saveFuncionario.jsp">INCLUIR FUNCIONARIO</a>
                        <a OnClick="parent.location.href = 'SearchFuncionario'">CONSULTAR FUNCIONARIOS</a>
                    </div>

                    <button class="dropdown-btn">FILIAIS
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="saveFilial.jsp">INCLUIR FILIAL</a>
                        <a OnClick="parent.location.href = 'SearchFilial'">CONSULTAR FILIAIS</a>
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

            <form autocomplete="off" action="UpdateCategoria" method="POST">
                <div class="formulario">
                    <div>
                        ${msg}
                    </div>
                    <input type="hidden" name="id" value="${categoria.id}">
                    <br>
                    <br>
                    <br>


                    <label><b>Nome da Categoria:*</b></label>
                    <input class="text" type="text" name="nome" value="${categoria.nome}" style="width: 370px; height: 25px" required>

                    &nbsp;
                    &nbsp;
                    &nbsp;


                    <br>
                    <br>
                    <br>

                    <div class="buttom">
                        <button class="buttomConfirmar" type="submit" style="width: 100px; height: 30px">Atualizar</button>                       
                        <button class="buttomCancelar" href="index.jsp" style="width: 100px; height: 30px">Cancelar</button>
                    </div>
                </div>
            </form>
            <div>
                <input type="submit" name="" value="">
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
