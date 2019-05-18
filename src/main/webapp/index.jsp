<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>DASHBOARD</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="CSS\estiloIndex.css">
    <head>
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
                                <li><a OnClick="parent.location.href = 'SearchCategoria'">CONSULTAR PEDIDO</a></li>
                            </ul>
                        </li>
                        <li><a href="#">CLIENTE</a>
                            <ul>
                                <li><a href="saveCliente.jsp">INCLUIR CLIENTE</a></li>
                                <li><a OnClick="parent.location.href = 'SearchCliente'">CONSULTAR CLIENTE</a></li>
                            </ul>
                        </li>
                        <li><a href="#">PRODUTO</a>
                            <ul>
                                <li><a href="SaveProduto?action=savar">INCLUIR PRODUTO</a></li>
                                <li><a OnClick="parent.location.href = 'SearchProduto'">CONSULTAR PRODUTO</a></li>
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
                                <li><a href="saveFuncionario.jsp">INCLUIR FUNCIONARIOS</a></li>
                                <li><a OnClick="parent.location.href = 'SearchFuncionario'">CONSULTAR FUNCIONARIO</a></li>
                            </ul>
                        </li>
                        <li><a href="#">FILIAIS</a>
                            <ul>
                                <li><a a OnClick="parent.location.href = 'SearchFilial'">INCLUIR FILIAIS</a></li>
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

            </div>
        </div>
        <footer>
            <h2>TADES Inc. 2019</h2>
        </footer>
    </body>
</html>
