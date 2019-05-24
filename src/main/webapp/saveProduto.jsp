<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="CSS\estilo.css">
    <head>
    <body>	
        <div class="container">
            <header>
                <nav>
                    <ul id=opcao>
                        <li><a href="#">DASHBOARD</a></li>
                        <li><a href="#">PEDIDO</a>
                            <ul>
                                <li><a href="#">INCLUIR PEDIDO</a></li>
                                <li><a href="#">CONSULTAR PEDIDO</a></li>
                            </ul>
                        </li>
                        <li><a href="#">CLIENTE</a>
                            <ul>
                                <li><a href="#">INCLUIR CLIENTE</a></li>
                                <li><a href="#">CONSULTAR CLIENTE</a></li>
                            </ul>
                        </li>
                        <li><a href="#">PRODUTO</a>
                            <ul>
                                <li><a href="#">INCLUIR PRODUTO</a></li>
                                <li><a href="#">CONSULTAR PRODUTO</a></li>
                            </ul>
                        </li>
                        <li><a href="#">ESTOQUE</a>
                            <ul>
                                <li><a href="#">CONSULTAR ESTOQUE</a></li>
                            </ul>
                        </li>
                        <li><a href="#">RELATORIOS</a>
                            <ul>
                                <li><a href="#">SUB 1</a></li>
                                <li><a href="#">SUB 2</a></li>
                                <li><a href="#">SUB 3</a></li>
                            </ul>
                        </li>
                        <li><a href="#">FUNCIONARIOS</a>
                            <ul>
                                <li><a href="#">INCLUIR FUNCIONARIOS</a></li>
                                <li><a href="#">CONSULTAR PRODUTO</a></li>
                            </ul>
                        </li>
                        <li><a href="#">FILIAIS</a>
                            <ul>
                                <li><a href="#">INCLUIR FILIAIS</a></li>
                                <li><a href="#">CONSULTAR FILIAIS</a></li>
                            </ul>
                        </li>
                        <li><a href="#">SUPORTE</a>
                            <ul>
                                <li><a href="#">ABRIR CHAMADO</a></li>
                                <li><a href="#">CONSULTAR</a></li>
                            </ul>
                        </li>
                    </ul>					
                </nav>	
            </header>
            <div class="formulario">
                <form autocomplete="off" action="SaveProduto" method="post">
                    <label>Nome do Produto:</label>
                    <input class="text" type="text" name="nome" value="${produto.nome}" style="width: 300px; height: 20px">

                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label>Quantidade:</label>
                    <input class="text" type="text" name="quantidade" value="${produto.quantidade}" style="width: 220px; height: 20px">

                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label>Valor:</label>
                    <input class="text" type="text" name="valor" value="${produto.valor}" style="width: 220px; height: 20px">

                    <br>
                    <br>
                    <br>


                    <label>Descrição:</label>

                    <div class="textarea">
                        <textarea  type="text" name="descricao" value="${produto.descricao}" style="width: 1000px; height: 100px"></textarea>
                    </div>

                    &nbsp;
                    &nbsp;

                    <br>
                    <br>
                    <br>
                    <br>
                    <br>



                    <label>Categoria:</label>
                    <select style="width: 50px; height: 20px" name="categoria">
                        <c:forEach var="cat" items="${categoria}" >
                            <option
                                value="${cat.id}">${cat.nome}
                            </option>
                        </c:forEach>
                    </select>

                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label>Filial:</label>
                    <select style="width: 50px; height: 20px" name="filial">
                        <c:forEach var="fil" items="${filial}">
                            <option
                                value="${fil.id}">${fil.nome}
                            </option>
                        </c:forEach>
                    </select>
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;



                    <label>Disponível:</label>
                    <select style="width: 50px; height: 20px" class="text"  name="habilitado" value="${produto.habilitado}">
                        <option>Habilitado</option>
                        <option>Desabilitado</option>
                    </select>

                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <div class="buttom">
                        <button class="buttomConfirmar" type="submit" style="width: 150px; height: 30px">Cadastrar</button>				
                        <button class="buttomLimpar" type="reset" style="width: 150px; height: 30px">Limpar Formulário</button>
                        <input class="buttomCancelar" type="submit" name="cancelar" value="Cancelar" style="width: 150px; height: 30px">
                    </div>
                </form>
            </div>
            <footer>
            </footer>
        </div>
    </body>
</html>
