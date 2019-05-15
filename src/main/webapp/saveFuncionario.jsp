<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Funcionario - Inclusão</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="CSS\estiloFuncionario.css">
    <head>
    <body>	
        <div class="container">
            <header>
                <h1>CADASTRO DE FUNCIONÁRIO</h1>
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
                <form autocomplete="off" action="SaveFuncionario" method="post">
                    <label><b>Nome do Funcionário:</b></label>
                    <input class="text" type="text" name="nome" value="${funcionario.nome}" style="width: 300px; height: 20px">

                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>CPF:</b></label>
                    <input class="text" type="text" name="cpf" value="${funcionario.cpf}" style="width: 205px; height: 20px">

                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>RG:</b></label>
                    <input class="text" type="text" name="rg" value="${funcionario.rg}" style="width: 200px; height: 20px">

                    <br>
                    <br>
                    <br>

                    <label><b>Endereço:</b></label>
                    <input class="text" type="text" name="endereco" value="${funcionario.endereco}" style="width: 350px; height: 20px">


                    &nbsp;
                    &nbsp;

                    <label><b>Nº:</b></label>
                    <input class="text" type="text" name="numero" value="${funcionario.numero}" style="width: 67px; height: 20px">


                    &nbsp;
                    &nbsp;

                    <label><b>Complemento:</b></label>
                    <input class="text" type="text" name="complemento" value="${funcionario.complemento}" style="width: 330px; height: 20px">

                    <br>
                    <br>
                    <br>

                    <label><b>Cidade:</b></label>
                    <input class="text" type="text" name="cidade" value="${funcionario.cidade}" style="width: 190px; height: 20px">

                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>Bairro:</b></label>
                    <input class="text" type="text" name="bairro" value="${funcionario.bairro}" style="width: 170px; height: 20px">

                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>Estado:</b></label>
                    <select style="width: 50px; height: 20px" class="text" name="estado" value="${funcionario.estado}">
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

                    <label><b>CEP:</b></label>
                    <input class="text" type="text" name="cep" value="${funcionario.cep}" style="width: 150px; height: 20px">

                    <br>
                    <br>
                    <br>

                    <label><b>E-mail:</b></label>
                    <input class="text" type="text" name="email" value="${funcionario.email}" style="width: 300px; height: 20px">

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

                    <label><b>Telefone:</b></label>
                    <input class="text" type="text" name="telefone" value="${funcionario.telefone}" style="width: 150px; height: 20px">

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

                    <label><b>Celular:</b></label>
                    <input class="text" type="text" name="celular" value="${funcionario.celular}" style="width: 150px; height: 20px">

                    <br>
                    <br>
                    <br>

                    <label><b>Data de Nascimento:</b></label>
                    <input class="text" type="date" name="dataNasc" value="${funcionario.dataNasc}" style="width: 150px; height: 20px">

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

                    <label><b>Filial:</b></label>
                    <select class="text" style="width: 205px; height: 20px" name="filial" value="${funcionario.filial}">
                        <option>Filial 1</option>
                        <option>Filial 2</option>
                        <option>Filial 3</option>
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
                    &nbsp;

                    <label><b>Cargo:</b></label>
                    <select class="text" style="width: 200px; height: 20px" name="cargo" value="${funcionario.cargo}">
                        <option>Cargo 1</option>
                        <option>Cargo 2</option>
                        <option>Cargo 3</option>
                    </select>

                    <br>
                    <br>
                    <br>

                    <label><b>Status:</b></label>
                    <select class="text" style="width: 200px; height: 20px" name="habilitado" value="${funcionario.habilitado}">
                        <option>Ativo</option>
                        <option>Destativado</option>
                    </select>

                    <div class="buttom">
                        <button class="buttomConfirmar" type="submit" style="width: 150px; height: 30px">Cadastrar</button>				
                        <button class="buttomLimpar" type="submit" style="width: 150px; height: 30px">Limpar Formulário</button>
                    </div>
                </form>
                <div>
                    <input class="buttomCancelar" type="submit" name="cancelar" value="Cancelar" style="width: 150px; height: 30px">
                </div>
            </div>
        </div>
        <footer>
            <h2>TADES Inc. 2019</h2>
        </footer>
    </body>
</html>
