<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Cadastro de Produto</title>
    </head>
    <body style="background-color:#C7ECFD">
        <style>
            #dropdown{
                width:150px;
                height: 30px;
            }
            li a:hover {
                color: #A1A8FF;
            }
            g{
                margin-left: 750px;
            }
            #clear{
                margin-top: 200px;
                margin-left: 1000px;
                height: 50px;
                width: 200px;
            }
            #submit{
                height: 50px;
                width: 200px;
            }
            #qtde{
                width: 350px;
                height:23px;
                font-size:14pt;
            }
            #valor
            {
                width: 239px;
                height:23px;
                font-size:14pt;
            }
            #nomeprod{
                width:350px;
                height:23px;
                font-size:14pt;
            }
            f{
                font-family: sans-serif;
                font-size: 24px;
            }
            form{
                margin-left: 400px;
            }
            t{
                font-family: sans-serif;
            }
            a{
                font-family: sans-serif;
                text-decoration: none;
                color:#689FFF;
            }
            nav{
                position: fixed;
                left: 0px;
                font-size: 26px;
            }
        </style>

        <nav class="menu" background-color="white">
            <ul>
                <t>Pedido</t>
                <li>
                    <a href="incpedido.html">Incluir Pedido</a>
                </li>
                <li>
                    <a href="conspedido.html">Consultar Pedido</a>
                </li>
                <br>
                <t>Cliente</t>
                <li>
                    <a href="inccliente.html">Incluir Cliente</a>
                </li>
                <li>
                    <a href="altcliente.html">Alterar Cliente</a>
                </li>
                <br>
                <t>Produto</t>
                <li>
                    <a href="incproduto.html">Incluir Produto</a>
                </li>
                <li>
                    <a href="consproduto.html">Consultar Produto</a>
                </li>
                <br>
                <t>Estoque</t>
                <li>
                    <a href="incremoestoque.html">Incluir/Remover Estoque</a>
                </li>
                <li>
                    <a href="consestoque.html">Consultar Estoque</a>
                </li>
                <br>
                <t>Relatórios</t>
                <li>
                    <a href="vendas.html">Vendas</a>
                </li>
                <li>
                    <a href="estoque.html">Estoque</a>
                </li>
                <br>
                <t>Suporte</t>
                <li>
                    <a href="abrirconsultar.html">Abrir/Consultar</a>
                </li>
                <li>
                    <a href="protocoloa.html">Protocolo Aberto</a>
                </li>
                <li>
                    <a href="protocolor.html">Protocolo Respondido</a>
                </li>
                <br>
                <t>Marketing</t>
                <br>
                <br>
                <br>
                <t>Funcionários</t>
            </ul>
        </nav>
        <form autocomplete="off" action="ApresentaProduto.jsp" method="POST">
            <tr>
                <td>
                    <form class="form" action="index.html" method="post">
                        <br>
                        <br>
                        <img src="${pageContext.request.contextPath}/IMAGENS/logo.png" width="450" height="100"></img>
                        <g>Seja bem-vindo, USUÁRIO</g>&nbsp&nbsp&nbsp&nbsp&nbsp
                        <img src="${pageContext.request.contextPath}/IMAGENS/avatar.png" class="g" width="50" height="50"></img>

                </td>
                <td>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
            <f>Nome do Produto:</f>
            <input type="text" name="Nome do Produto" id="nomeprod" value="${produto.nome}" class="form"></input>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
        </td>
        <td>
        <f>Quantidade:</f>
        <input type="number" name="Quantidade" id="qtde" value="${produto.quantidade}"class="form"></input>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    </td>
    <td>
    <f>Valor:</f>
    <input type="number" name="Valor" id="valor" value="${produto.valor}" class="form"></input>
</td>
<tr>
<br>
<br>
<br>
<br>
<td>
<f>Descrição:</f>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<textarea name="Descrição" rows="10" cols="200" style="resize: none" id="descricao"  value="${produto.descricao}" class="form"></textarea>
</td>
</tr>
<br>
<br>
<br>
<tr>
    <td>
<f>Categoria:</f>
<select name="Categoria" id="dropdown">
    <option value="first" selected class="form">Categoria 1</option>
    <option value="second" class="form">Categoria 2</option>
    <option value="third" class="form">Categoria 3</option>

</select>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
</td>
</tr>
<tr>
    <td>
<f>Subcategoria:</f>
<select name="Subcategoria" id="dropdown">
    <option value="first" selected class="form">Subcategoria 1</option>
    <option value="second" class="form">Subcategoria 2</option>
    <option value="third" class="form">Subcategoria 3</option>
</select>
</td>
</tr>
<br>
<br>
<br>
<tr>
    <td>
<f>Disponível:</f>
<select name="Disponível" id="dropdown" value="${produto.Habilitado}">
    <option value="first" selected class="form">Habilitado</option>
    <option value="second" class="form">Desabilitado</option>
</select>
</td>
</tr>
<tr>
<br>
<td>
    <input type="reset" value="Limpar" id="clear" class="form">&nbsp&nbsp&nbsp&nbsp



    <input type="submit" value="Cadastrar" id="submit" class="form">

</form>
</body>
</html>
