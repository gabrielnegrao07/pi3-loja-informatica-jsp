<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <html>
        <head>
            <title>Cliente - Atualizar</title>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
            <link rel="stylesheet" type="text/css" href="CSS\estiloCliente.css">
        <head>
        <body>	
            <div class="container">
                <header>
                    <h1>EDITAR CLIENTE</h1>
                    <nav>
                        <ul id=opcao>
                            <li><a href="index.html">DASHBOARD</a></li>
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



                ${msg}
                <div class="formulario">


                    <form autocomplete="off" action="UpdateCliente" method="post">

                        <input type="hidden" name="id"  value="${cliente.id}" style="width: 300px; height: 20px">

                        <label>Nome do Cliente:</label>
                        <input class="text" type="text" name="nome"  value="${cliente.nome}" style="width: 300px; height: 20px">

                        &nbsp;
                        &nbsp;
                        &nbsp;

                        <label>CPF:</label>
                        <input class="text" type="text" name="cpf" value="${cliente.cpf}" style="width: 220px; height: 20px">

                        &nbsp;
                        &nbsp;
                        &nbsp;

                        <label>RG:</label>
                        <input class="text" type="text" name="rg" value="${cliente.rg}" style="width: 220px; height: 20px">

                        <br>
                        <br>
                        <br>

                        <label>Endereço:</label>
                        <input class="text" type="text" name="endereco" value="${cliente.endereco}" style="width: 350px; height: 20px">


                        &nbsp;
                        &nbsp;

                        <label>Nº:</label>
                        <input class="text" type="text" name="numero" value="${cliente.numero}" style="width: 67px; height: 20px">


                        &nbsp;
                        &nbsp;

                        <label>Complemento:</label>
                        <input class="text" type="text" name="complemento" value="${cliente.complemento}" style="width: 330px; height: 20px">

                        <br>
                        <br>
                        <br>

                        <label>Cidade:</label>
                        <input class="text" type="text" name="cidade" value="${cliente.cidade}" style="width: 190px; height: 20px">

                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;

                        <label>Bairro:</label>
                        <input class="text" type="text" name="bairro" value="${cliente.bairro}" style="width: 170px; height: 20px">

                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;
                        &nbsp;

                        <label>Estado:</label>
                        <select style="width: 50px; height: 20px" class="text" name="estado" value="${cliente.estado}">
                            <option>AC</option>
                            <option>AL</option>
                            <option>AP</option>
                            <option>AM</option>
                            <option>BA</option>
                            <option>CE</option>
                            <option>DF</option>
                            <option>ES</option>
                            <option>GO</option>
                            <option>MA</option>
                            <option>MT</option>
                            <option>MS</option>
                            <option>MG</option>
                            <option>PA</option>
                            <option>PB</option>
                            <option>PR</option>
                            <option>PE</option>
                            <option>PI</option>
                            <option>RJ</option>
                            <option>RN</option>
                            <option>RS</option>
                            <option>RO</option>
                            <option>RR</option>
                            <option>SC</option>
                            <option>SP</option>
                            <option>SE</option>
                            <option>TO</option>
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

                        <label>CEP:</label>
                        <input class="text" type="text" name="cep" value="${cliente.cep}" style="width: 150px; height: 20px">

                        <br>
                        <br>
                        <br>

                        <label>E-mail: </label>
                        <input class="text" type="text" name="email" value="${cliente.email}" style="width: 300px; height: 20px">

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
                        &nbsp;
                        &nbsp;

                        <label>Telefone:</label>
                        <input class="text" type="text" name="telefone" value="${cliente.telefone}" style="width: 150px; height: 20px">

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
                        &nbsp;

                        <label>Celular:</label>
                        <input class="text" type="text" name="celular" value="${cliente.celular}" style="width: 150px; height: 20px">

                        <br>
                        <br>
                        <br>

                        <label>Data de Nascimento:</label>
                        <input class="text" type="date" name="date" value="${cliente.dataNasc}" style="width: 150px; height: 20px">

                        <br>
                        <br>
                        <br>

                        <div class="buttom">
                            <button class="buttomConfirmar" type="submit" style="width: 150px; height: 30px">Atualizar</button>	
                            <input class="buttomCancelar" type="submit" name="cancelar" value="Cancelar" style="width: 150px; height: 30px">
                        </div>
                    </form>
                </div>
            </div>
            <footer>
                <h2>TADES Inc. 2019</h2>
            </footer>
        </body>
    </html>
