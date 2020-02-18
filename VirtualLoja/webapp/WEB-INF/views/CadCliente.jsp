<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Cadastro Pessoa</title>
 </head>
 <body>
 <a href="cadastroPessoa">Novo</a>
 <a href="listaPessoas">Lista</a>
 <br/>
 <br/>
 <form action="adicionaPessoa" method="post">
 Nome: <input type="text" name="nome" /> <br />
 CPF: <input type="text" name="cpf" /> <br />
 E-mail: <input type="text" name="email" /> <br />
 <br/>
 <br/>
 <input type="submit" value="Salvar" />
 </form>
 </body>
</html>