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
            <form autocomplete="off" action="UpdateCategoria" method="post">
                <input type="hidden" name="id"  value="${categoria.id}" style="width: 300px; height: 20px">

                <label>Nome da Categoria:</label>
                <input class="text" type="text" name="nome"  value="${categoria.nome}" style="width: 300px; height: 20px">
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
