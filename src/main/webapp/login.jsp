<%@page import="com.thewalkingchampions.controller.LoginController"%>
<%@page import="com.thewalkingchampions.dao.LoginDAO"%>
<%@page import="com.thewalkingchampions.model.Login"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="CSS\estiloLogin.css">
        <title>::. TADES .::</title>
    </head>
    <body>

        <div class="container">
            <header>
                <h1>Tades</h1>
            </header>

            <div id="logar">
                <table>
                    <form action="${pageContext.request.contextPath}/SearchLoginOne" method="post">
                        <tr>
                            <td>
                                <label><b>Login:</b></label>
                                <input type="text" name="nome" value="${nome}" >

                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label><b>Senha:</b></label>
                                <input type="password" name="senha" value="${senha}" >
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input class="buttomEntra" type="submit" value="Entrar" style="width: 160px; height: 40px" OnClick="parent.location.href = 'index.jsp'">
                            </td>
                        </tr>
                    </form>
                </table>
            </div>
            <footer>
                <h2>TADES Inc. 2019</h2>
            </footer>
        </div>
    </body>
</html>
