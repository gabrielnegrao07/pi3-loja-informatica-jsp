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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <script>

        </script>
    </head>
    <body>
        <form autocomplete="off" action="SavePedido" method="POST">
            <div>
                <a OnClick="parent.location.href = 'SearchClientePedido'"><buttom>Inserir</buttom></a>
            </div>

            <input type="hidden" name="idCliente"  value="${cliente.id}">

            <label>Nome do Cliente</label>
            <input type="search" name="nome" value="${cliente.nome}">
            <br>
            <br>
            <label>CPF</label>
            <input type="text" name="cpf" value="${cliente.cpf}">
            <br>
            <br>
            <label>RG</label>
            <input type="text" name="rg" value="${cliente.rg}">
            <br>
            <br>
            <label>Endereço</label>
            <input type="text" name="endereco" value="${cliente.endereco}">
            <br>
            <br>
            <label>Numero</label>>
            <input type="text" name="numero" value="${cliente.numero}">
            <br>
            <br>
            <label>Complemento</label>
            <input type="text" name="complemento" value="${cliente.complemento}">
            <br>
            <br>
            <label>Cidade</label>
            <input type="text" name="cidade" value="${cliente.cidade}">
            <br>
            <br>
            <label>Bairro</label>
            <input type="text" name="bairro" value="${cliente.bairro}">
            <br>
            <br>
            <label>Estado</label>
            <input type="text" name="estado" value="${cliente.estado}">
            <br>
            <br>
            <label>CEP</label>
            <input type="text" name="cep" value="${cliente.cep}">
            <br>
            <br>
            <label>Email</label>
            <input type="text" name="email" value="${cliente.email}">
            <br>
            <br>
            <label>Telefone</label>
            <input type="text" name="telefone" value="${cliente.telefone}">
            <br>
            <br>
            <label>Celular</label>
            <input type="text" name="celular" value="${cliente.celular}">
            <br>
            <br>
            <a OnClick="parent.location.href = 'SearchProdutoPedido'"><buttom>Inserir</buttom></a>
            <br>
            <br>

            <c:forEach var="produto" items="${search}">
                <label>ID:</label>
                <input type="text" name="id" value="${produto.id}">
                <label>Nome:</label>
                <input type="text" name="nomePedido" value="${produto.nome}">
                <label>Valor:</label>
                <input type="text" name="valor" value="${produto.valor}">
                <label>Quantidade:</label>
                <input type="text" name="quantidade">
                <button>Incluir Quantidade</button>
                <br>
            </c:forEach>
                
            <button class="buttomConfirmar" type="submit" style="width: 150px; height: 30px">Finalizar</button>
        </form>
    </body>
</html>
