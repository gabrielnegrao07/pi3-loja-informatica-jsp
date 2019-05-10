<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Produto - Inclusão</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <body>
        <h1>Produto - Inclusão</h1>
        <div>
            <form autocomplete="off" action="SaveProduto" method="post">
                <div>
                    <label>Nome</label>
                    <div>
                        <input type="text" name="nome" maxlength="50" value="${produto.nome}" style="width:300px" required/>
                    </div>
                </div>
                <div>
                    <label>Descrição</label>
                    <div>
                        <input type="text" name="descricao" maxlength="80"  value="${produto.descricao}" style="width:300px" required/>
                    </div>
                </div>
                <div>
                    <div>
                        <label>Valor</label>
                        <div>
                            <input type="text" name="valor" maxlength="13" value="${produto.valor}" style="width:300px" required/>
                        </div>
                    </div>
                    <div>
                        <label>Quantidade</label>
                        <div>
                            <input type="text" name="quantidade" maxlength="15" value="${produto.quantidade}" style="width:300px" required/>
                        </div>
                    </div>
                    <button type="submit">Salvar</button>
                    <button type="reset">Resetar</button>

            </form>
            <br>
            <input class="btn btn-info btn-sm" type="submit" value="Pagina inicial" OnClick="parent.location.href = 'index.jsp'">
        </div>
    </body>
</html>
