<%@page import="com.thewalkingchampions.service.LoginService"%>
<%@page import="com.thewalkingchampions.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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
                
                <c:if test="${msgErro != null}">
                    <div class="erro"><c:out value="${msgErro}" /></div>
                </c:if>

                <table>
                    <form action="${pageContext.request.contextPath}/login" method="post">
                        <tr>
                            <td>
                                <label><b>Login:</b></label>
                                <input type="text" name="username" />


                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label><b>Senha:</b></label>
                                <input type="password" name="senha" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <input class="buttomEntra" type="submit" value="Entrar" style="width: 160px; height: 40px" >
                                <!--<button type="submit">Enviar</button>-->
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
