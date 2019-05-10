<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Cliente - Atualizar</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <form autocomplete="on" action="SearchClienteOne" method="post">
    </head>
    <body>
        <h1>Cliente - Atualizar</h1>
        <div>
            <form autocomplete="on" action="SearchClienteOne" method="post">

                <div>
                    <input type="hidden" name="id" value="${cat.id}" style="width:300px" required/>
                </div>
        </div>
        <div>
            <label>Nome</label>
            <div>
                <input type="text" name="nome" maxlength="50" value="${request.getParametre(nome)}" style="width:300px" required/>
            </div>
        </div>
        <div>
            <label>CPF</label>
            <div>
                <input type="text" name="cpf" maxlength="80" value="${request.getParametre(cpf)}" style="width:300px" required/>
            </div>
        </div>
        <div>
            <div>
                <label>Telefone</label>
                <div>
                    <input type="text" name="telefone" maxlength="13" value="${request.getParametre(telefone)}" style="width:300px" required/>
                </div>
            </div>
            <div>
                <label>Email</label>
                <div>
                    <input type="email" name="email" maxlength="15" value="${request.getParametre(email)}" style="width:300px" required/>
                </div>
            </div>
            <button type="submit">Salvar</button>

</form>
<br>
<input class="btn btn-info btn-sm" type="submit" value="Pagina inicial" OnClick="parent.location.href = 'index.jsp'">
</div>
</body>
</html>
