<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- saved from url=(0133)file:///C:/Users/GIOVANNI.MCARIGNATO/Downloads/pi3-the-walking-champions-master/pi3-the-walking-champions-master/cadastroProduto.html -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Consulta de Produto</title>
    <h1> <img src="${pageContext.request.contextPath}/IMAGENS/logo.png" width="450" height="100"></img>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <g>Seja bem-vindo, USUÁRIO</g>
        <img src="${pageContext.request.contextPath}/IMAGENS/avatar.png" class="g" width="50" height="50"></img>
    </h1>
</head>
<body style="background-color:#C7ECFD">
    <style>
        #submit{
            margin-left: -27px;
            height: 32px;
            width: 100px;
        }
        #nomeprod{
            width:700px;
            height:23px;
            font-size:14pt;
        }
        li a:hover {
            color: #A1A8FF;
        }
        f{
            font-family: sans-serif;
            font-size: 24px;
        }
        g{
            font-family: sans-serif;
            font-size: 20px;
        }
        form{
            margin-left: 280px;
        }
        t{
            font-weight: bold;
            font-family: sans-serif;
        }
        a{
            font-family: sans-serif;
            text-decoration: none;
            color:#689FFF;
        }
        nav{
            margin-left: -8px;
            background-color: white; 
            padding-right: 20px;
            border-left: 2px solid blue;
            border-bottom: 2px solid blue;
            border-right: 2px solid blue;
            border-bottom-right-radius: 20px;
            border-bottom-left-radius: 20px;
            position: fixed;
            font-size: 21px;

        }
    </style>
    <nav class="menu">
        <ul>
            <t>Pedido</t>
            <li>
                <a href="incpedido.html">Incluir Pedido</a>
            </li>
            <li>
                <a href="conspedido.html">Consultar Pedido</a>
            </li>
            <t>Cliente</t>
            <li>
                <a href="inccliente.html">Incluir Cliente</a>
            </li>
            <li>
                <a href="altcliente.html">Alterar Cliente</a>
            </li>
            <t>Produto</t>
            <li>
                <a href="incluirProduto.html">Incluir Produto</a>
            </li>
            <li>
                <a href="consultarProduto.html">Consultar Produto</a>
            </li>
            <t>Estoque</t>
            <li>
                <a href="incremoestoque.html">Incluir/Remover</a>
            </li>
            <li>
                <a href="consestoque.html">Consultar Estoque</a>
            </li>

            <t>Relatórios</t>
            <li>
                <a href="vendas.html">Vendas</a>
            </li>
            <li>
                <a href="estoque.html">Estoque</a>
            </li>

            <t>Funcionários</t>
            <li>
                <a href="abrirconsultar.html">Consultar Funcionário</a>
            </li>
            <li>
                <a href="protocoloa.html">Incluir Funcionário</a>
            </li>

        </ul>
    </nav>
    <form autocomplete="off" method="post">
        <br>
        <br>

        <f>Nome do Produto:</f>
        <input type="text" name="Nome do Produto" id="nomeprod" class="form">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" value="Consultar" id="submit" class="form">

    </form>
</body>
</html>