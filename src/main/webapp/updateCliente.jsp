<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>:: ATUALIZAR CLIENTE- TADES ::</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css" href="CSS\estiloCadastro.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <head>
    <body>	
        <div class="container">
            <header>
                <h1>ATUALIZAR CLIENTE</h1>
                <div class="sidenav">
                    <button class="dropdown-btn" href="#">DASHBOARD</button>

                    <button class="dropdown-btn">PEDIDO 
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="savePedido.jsp">INCLUIR PEDIDO</a>
                        <a href="#">CONSULTAR PEDIDO</a>
                    </div>

                    <button class="dropdown-btn">CLIENTE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="saveCliente.jsp">INCLUIR CLIENTE</a>
                        <a OnClick="parent.location.href = 'SearchCliente'">CONSULTAR CLIENTE</a>
                    </div>

                    <button class="dropdown-btn">PRODUTO
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a a href="SaveProduto?action=salvar">INCLUIR PRODUTO</a>
                        <a OnClick="parent.location.href = 'SearchProduto'">CONSULTAR PRODUTO</a>
                        <a href="saveCategoria.jsp">INCLUIR CATEGORIA</a>
                        <a OnClick="parent.location.href = 'SearchCategoria'">CONSULTAR CATEGORIA</a>
                    </div>

                    <button class="dropdown-btn">ESTOQUE
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a OnClick="parent.location.href = 'SearchEstoque'">CONSULTAR ESTOQUE</a>
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
                        <a href="saveFuncionario.jsp">INCLUIR FUNCIONARIO</a>
                        <a OnClick="parent.location.href = 'SearchFuncionario'">CONSULTAR FUNCIONARIOS</a>
                    </div>

                    <button class="dropdown-btn">FILIAIS
                        <i class="fa fa-caret-down"></i>
                    </button>
                    <div class="dropdown-container">
                        <a href="saveFilial.jsp">INCLUIR FILIAL</a>
                        <a OnClick="parent.location.href = 'SearchFilial'">CONSULTAR FILIAIS</a>
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

            <form autocomplete="off" action="UpdateCliente" method="POST">
                <div class="formulario">
                    <div class="resposta" style="width: 50%; height: 30px">
                        ${msg}
                    </div>
                    <input type="hidden" name="id" value="${cliente.id}">
                    <br>
                    <br>
                    <br>
                    
                    <label><b>Nome:*</b></label>
                    <input class="text" type="text" name="nome" value="${cliente.nome}" style="width: 370px; height: 25px" required>

                    &nbsp;
                    &nbsp;
                    &nbsp;


                    <label><b>CPF:*</b></label>
                    <input class="text" type="text" name="cpf" value="${cliente.cpf}" style="width: 300px; height: 25px" required>

                    &nbsp;
                    &nbsp;
                    &nbsp;


                    <label><b>RG:</b></label>
                    <input class="text" type="text" name="rg" value="${cliente.rg}" style="width: 300px; height: 25px">

                    <br>
                    <br>
                    <br>

                    <label><b>Endereço:*</b></label>
                    <input class="text" type="text" name="endereco" value="${cliente.endereco}" style="width: 500px; height: 25px" required>


                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>Nº:*</b></label>
                    <input class="text" type="text" name="numero" value="${cliente.numero}" style="width: 68px; height: 25px" required>


                    &nbsp;
                    &nbsp;
                    &nbsp;

                    <label><b>Complemento:</b></label>
                    <input class="text" type="text" name="complemento" value="${cliente.complemento}" style="width: 290px; height: 25px">

                    <br>
                    <br>
                    <br>

                    <label><b>Cidade:*</b></label>
                    <input class="text" type="text" name="cidade" value="${cliente.cidade}" style="width: 305px; height: 25px" required>

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
                    <input class="text" type="text" name="bairro" value="${cliente.bairro}" style="width: 150px; height: 25px" required>


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
                    <select class="text" name="estado" value="${cliente.estado}" style="width: 50px; height: 25px">
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
                    <input class="text" type="text" name="cep" value="${cliente.cep}" style="width: 95px; height: 25px" required>

                    <br>
                    <br>
                    <br>

                    <label><b>E-mail:*</b></label>
                    <input class="text" type="email" name="email" value="${cliente.email}" style="width: 450px; height: 25px" required>

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
                    <input class="text" type="text" name="telefone" value="${cliente.telefone}" style="width: 120px; height: 25px">

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
                    <input class="text" type="text" name="celular" value="${cliente.celular}" style="width: 135px; height: 25px" required>

                    <br>
                    <br>
                    <br>

                    <div class="buttom">
                        <button class="buttomConfirmar" type="submit" style="width: 100px; height: 30px">Atualizar</button>                       
                        <button class="buttomCancelar" href="index.jsp" style="width: 100px; height: 30px">Cancelar</button>
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
