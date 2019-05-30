<%-- 
    Document   : saveFilial
    Created on : 17/05/2019, 19:33:48
    Author     : Johnathan.mbmata
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS\estiloList.css">
        <title>JSP Page</title>
    </head>
    <body>	
        <div class="container">
            <header>
                <h1>CADASTRO PRODUTO</h1>
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
                <form autocomplete="off" action="SaveCategoria" method="post">
                    <div>
                        ${msg}
                    </div>
                    <br>
                    <br>
                    <br>
                    <label>Nome da Categoria:</label>
                    <input class="text" type="text" name="nome" value="${categoria.nome}" style="width: 300px; height: 20px" required>


                    <div class="buttom">
                        <button class="buttomConfirmar" type="submit" style="width: 150px; height: 30px">Cadastrar</button>				
                        <button class="buttomLimpar" type="reset" style="width: 150px; height: 30px">Limpar Formulário</button>
                        <input class="buttomCancelar" type="submit" name="cancelar" value="Cancelar" style="width: 150px; height: 30px">
                    </div>
                </form>
            </div>
            <div>
                <input class="" type="submit" name="" value="">
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
