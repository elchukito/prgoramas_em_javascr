<#import "macros.ftl" as m>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="css/styles.css">
    <title>cadastro de contato</title>
</head>
<body>
    <h1>Cadastro de contato</h1>

    <div id="container">
        <form id="contact-form" action="/contatos" method="post">
            <i id=""></i>
            <input type="text" id="name" name="name" placeholder="Nome:" onblur="placeholder='Nome:'" onclick="placeholder='ex: Sergio Moro'" required>
            <br>
            <input type="tel" id="phone" name="phone" placeholder="Telefone:" onblur="placeholder='Telefone:'" onclick="placeholder='ex: 41 944433777'" required>
            <br>
            <input type="email" id="email" name="email" placeholder="Email:" onblur="placeholder='Email:'" onclick="placeholder='ex: Exemplo@gmail.com'">
            <br>
            <button id="add-but" type="submit">Salvar Contato</button>
        </form>

        <a id="back-but" href="/">Voltar</a>

        <ul>
            <#list databasecontato as dbcontato>
                <@m.renderContato databasecontato=dbcontato/>
            </#list>
        </ul>
    </div>
</body>
</html>