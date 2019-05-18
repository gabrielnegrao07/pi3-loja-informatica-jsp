<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        ${msg}
        <br>
        <br>
        <div>
            <form autocomplete="off" action="UpdateFilial" method="post">


                <input type="hidden" name="id"  value="${filial.id}" style="width: 300px; height: 20px">

                <label>Nome da Filial:</label>
                <input class="text" type="text" name="nome"  value="${filial.nome}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>CNPJ:</label>
                <input class="text" type="text" name="cnpj"  value="${filial.cnpj}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>IE:</label>
                <input class="text" type="text" name="ie"  value="${filial.ie}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>Endereço:</label>
                <input class="text" type="text" name="endereco"  value="${filial.endereco}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>Numero:</label>
                <input class="text" type="text" name="numero"  value="${filial.numero}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>Complemento:</label>
                <input class="text" type="text" name="complemento"  value="${filial.complemento}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>Bairro:</label>
                <input class="text" type="text" name="bairro"  value="${filial.bairro}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>Cidade:</label>
                <input class="text" type="text" name="cidade"  value="${filial.cidade}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>Estado:</label>
                <select style="width: 50px; height: 20px" class="text" name="estado" value="${filial.estado}">
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
                <br>
                <br>
                <label>CEP:</label>
                <input class="text" type="text" name="cep"  value="${filial.cep}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>email:</label>
                <input class="text" type="text" name="email"  value="${filial.email}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>telefone:</label>
                <input class="text" type="text" name="telefone"  value="${filial.telefone}" style="width: 300px; height: 20px">
                <br>
                <br>
                <label>Habilitado:</label>
                <select style="width: 50px; height: 20px" class="text" name="habilitado" value="${filial.habilitado}">
                    <option>ATIVO</option>
                    <option>INATIVO</option>
                </select>

                <div>
                    <button class="buttomConfirmar" type="submit" style="width: 150px; height: 30px">Atualizar</button>	
                    <input class="buttomCancelar" type="submit" name="cancelar" value="Cancelar" style="width: 150px; height: 30px">
                </div>
            </form>
        </div>
    </body>
</html>
