<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>:: CADASTRO FUNCIONARIO - TADES ::</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="CSS\estiloCadastro.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <head>
    <body>	
        <div class="container">
            <header>
                <h1>CADASTRO FUNCIONARIO</h1>
                <div class="sidenav">
                    <button class="dropdown-btn" href="#">DASHBOARD</button>

                    <button class="dropdown-btn">PEDIDO 
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR PEDIDO</a>
                        <a href="#">CONSULTAR PEDIDO</a>
                    </div>

                    <button class="dropdown-btn">CLIENTE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR CLIENTE</a>
                        <a href="#">CONSULTAR CLIENTE</a>
                    </div>

                    <button class="dropdown-btn">PRODUTO
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR PRODUTO</a>
                        <a href="#">CONSULTAR PRODUTO</a>
                        <a href="#">INCLUIR CATEGORIA</a>
                        <a href="#">CONSULTAR CATEGORIA</a>
                    </div>

                    <button class="dropdown-btn">ESTOQUE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">CONSULTAR ESTOQUE</a>
                    </div>

                    <button class="dropdown-btn">RELATORIOS
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">SUB 1</a>
                        <a href="#">SUB 2</a>
                        <a href="#">SUB 3</a>
                    </div>

                    <button class="dropdown-btn">FUNCIONARIOS
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR FUNCIONARIOS</a>
                        <a href="#">CONSULTAR PRODUTO</a>
                    </div>

                    <button class="dropdown-btn">FILIAIS
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">INCLUIR FILIAIS</a>
                        <a href="#">CONSULTAR FILIAIS</a>
                    </div>

                    <button class="dropdown-btn">SUPORTE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="#">ABRIR CHAMADO</a>
                        <a href="#">CONSULTAR</a>
                    </div>
                </div>  
            </header>

            <form autocomplete="off" action="SaveFuncionario" method="post">
                <div class="formulario">
                    <div class="resposta" style="width: 50%; height: 30px">
                        ${msg}
                    </div>
                    <br>
                    <br>
                    <br>
                    <label><b>Nome:*</b></label>
                    <input class="text" type="text" name="nome" value="${funcionario.nome}" style="width: 370px; height: 25px" required>

                    &nbsp;
                    &nbsp;
                    &nbsp;


                    <label><b>CPF:*</b></label>
                    <input class="text" type="text" name="cpf" value="${funcionario.cpf}" style="width: 300px; height: 25px" required>

                    &nbsp;
                    &nbsp;
                    &nbsp;


                    <label><b>RG:</b></label>
                    <input class="text" type="text" name="rg" value="${funcionario.rg}" style="width: 300px; height: 25px">

                    <br>
                    <br>
                    <br>

                    <label><b>Endereço:*</b></label>
                    <input class="text" type="text" name="endereco" value="${funcionario.endereco}" style="width: 500px; height: 25px" required>


                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>Nº:*</b></label>
                    <input class="text" type="text" name="numero" value="${funcionario.numero}" style="width: 68px; height: 25px" required>


                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>Complemento:</b></label>
                    <input class="text" type="text" name="complemento" value="${funcionario.complemento}" style="width: 290px; height: 25px">

                    <br>
                    <br>
                    <br>

                    <label><b>Cidade:*</b></label>
                    <input class="text" type="text" name="cidade" value="${funcionario.cidade}" style="width: 305px; height: 25px" required>

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

                    <label><b>Bairro:*</b></label>
                    <input class="text" type="text" name="bairro" value="${funcionario.bairro}" style="width: 150px; height: 25px" required>


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


                    <label><b>Estado:*</b></label>
                    <select class="text" name="estado" value="${funcionario.estado}" style="width: 50px; height: 25px">
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
                    &nbsp;


                    <label><b>CEP:*</b></label>
                    <input class="text" type="text" name="cep" value="${funcionario.cep}" style="width: 95px; height: 25px" required>

                    <br>
                    <br>
                    <br>

                    <label><b>E-mail:*</b></label>
                    <input class="text" type="email" name="email" value="${funcionario.email}" style="width: 450px; height: 25px" required>

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
                    &nbsp;

                    <label><b>Telefone:</b></label>
                    <input class="text" type="text" name="telefone" value="${funcionario.telefone}" style="width: 120px; height: 25px">

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
                    &nbsp;
                    &nbsp;

                    <label><b>Celular:*</b></label>
                    <input class="text" type="text" name="celular" value="${funcionario.celular}" style="width: 135px; height: 25px" required>

                    <br>
                    <br>
                    <br>


                    <label>Filial:</label>
                    <select style="width: 50px; height: 20px" name="filial">
                        <c:forEach var="funcio" items="${filial}">
                            <option
                                value="${funcio.id}">${funcio.nome}
                            </option>
                        </c:forEach>
                    </select>

                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>Cargo:*</b></label>
                    <select class="text" name="cargo" value="${funcionario.cargo}" style="width: 200px; height: 25px">
                        <option>Cargo 1</option>
                        <option>Cargo 2</option>
                        <option>Cargo 3</option>
                    </select>

                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>Status:*</b></label>
                    <select class="text" name="habilitado" value="${funcionario.habilitado}" style="width: 208px; height: 25px">
                        <option>ATIVO</option>
                        <option>INATIVO</option>
                    </select>

                    <div class="buttom">
                        <button class="buttomConfirmar" type="submit" style="width: 100px; height: 30px">Cadastrar</button>             
                        <button class="buttomLimpar" type="reset" style="width: 140px; height: 30px">Limpar Formulário</button>
                        <button class="buttomCancelar" type="" style="width: 100px; height: 30px">Cancelar</button>
                    </div>
                </div>
            </form>
            <div>
                <input class="buttomCancelar" type="submit" name="cancelar" value="Cancelar">
            </div>


        </div>
        <footer>
            <h2>TADES Inc. 2019</h2>
        </footer>

        <script>
            var dropdown = document.getElementsByClassName("dropdown-btn");
            var i;

            for (i = 0; i < dropdown.length; i++) {
                dropdown[i].addEventListener("click", function () {
                    this.classList.toggle("active");
                    var dropdownContent = this.nextElementSibling;
                    if (dropdownContent.style.display === "block") {
                        dropdownContent.style.display = "none";
                    } else {
                        dropdownContent.style.display = "block";
                    }
                });
            }
        </script>

    </body>
</html>