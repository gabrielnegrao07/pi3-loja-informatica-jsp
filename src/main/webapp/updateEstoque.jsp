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
        <title>JSP Page</title>
    </head>
    <body>
        ${msg}
        <br>
        <br>
        <div>
            <form autocomplete="off" action="UpdateEstoque" method="post">
                <input type="hidden" name="id"  value="${estoque.idProduto}" style="width: 300px; height: 20px">

                <label>Nome do Produto:</label>
                <input class="text" type="text" name="nome"  value="${estoque.nome}" style="width: 300px; height: 20px" disabled>
                
                <label>Quantidade:</label>
                <input type="text" name="quantidade" value="${estoque.quantidade}" style="width: 300px; height: 20px" >
                <br>
                <br>

                <div>
                    <button type="submit" style="width: 150px; height: 30px">Atualizar</button>				
                    <button  type="reset" style="width: 150px; height: 30px">Limpar Formulário</button>
                </div>
            </form>
        </div>
    </body>
</html>
