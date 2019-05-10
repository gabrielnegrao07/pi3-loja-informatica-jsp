<%-- 
    Document   : index
    Created on : 09/05/2019, 15:14:04
    Author     : GIOVANNI.MCARIGNATO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS\estiloIndex.css">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <h1>Tades</h1>
        </header>
        <div class="container">   
            <div class="centro">
                <table>
                    <tr>
                        <td>
                            <label><b>Cliente:</b></label>
                        </td>
                        <td>
                            <input class="buttomCentro" type="submit" value="Search" style="width: 130px; height: 30px" OnClick="parent.location.href = 'SearchCliente'">
                        </td>
                        <td>
                            <input class="buttomCentro" type="submit" value="Save" style="width: 130px; height: 30px" OnClick="parent.location.href = 'SaveCliente'">
                        </td>
                    <tr>
                    <tr>
                        <td>
                            <label><b>Produto:</b></label>
                        </td>
                        <td>
                            <input class="buttomCentro" type="submit" value="Search" style="width: 130px; height: 30px" OnClick="parent.location.href = 'SearchProduto'">
                        </td>
                        <td>
                            <input class="buttomCentro" type="submit" value="Save"  style="width: 130px; height: 30px" OnClick="parent.location.href = 'SaveProduto'">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label><b>Funcionario:</b></label>
                        </td>
                        <td>
                            <input class="buttomCentro" type="submit" value="Search" style="width: 130px; height: 30px" OnClick="parent.location.href = 'SearchFuncionario'">
                        </td>
                        <td>
                            <input class="buttomCentro" type="submit" value="Save" style="width: 130px; height: 30px" OnClick="parent.location.href = 'SaveFuncionario'">
                        </td>
                    </tr>
                </table>
            </div>
        </div> 
        <footer>
            <h2>
                TADES Inc. 2019
            </h2>
        </footer>
    </body>
</html>
