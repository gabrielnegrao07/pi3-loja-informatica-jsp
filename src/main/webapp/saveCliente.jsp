<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente - Inclusão</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Cliente - Inclusão</h1>
    <div>
        <form autocomplete="off" action="SaveCliente" method="post">
            <div>
                <label>Nome</label>
                <div>
                    <input type="text" name="nome" value="${cliente.nome}" maxlength="50" style="width:300px " required/>
                </div>
            </div>
            <div>
                <label>CPF</label>
                <div>
                    <input type="text" name="cpf"  value="${cliente.cpf}" maxlength="80" style="width:300px" required/>
                </div>
            </div>
            <div>
            <div>
                <label>Telefone</label>
                <div>
                    <input type="text" name="telefone" value="${cliente.telefone}" maxlength="13" style="width:300px" required/>
                </div>
            </div>
            <div>
                <label>Email</label>
                <div>
                    <input type="email" name="email" value="${cliente.email}" maxlength="15" style="width:300px" required/>
                </div>
            </div>
            <button type="submit">Salvar</button>
            <button type="reset">Resetar</button>
            
        </form>
        <br>
        <input class="btn btn-info btn-sm" type="submit" value="Pagina inicial" OnClick="parent.location.href='index.jsp'">
    </div>
</body>
</html>
