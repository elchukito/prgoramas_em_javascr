<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/form.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Outfit:wght@100..900&display=swap" rel="stylesheet">
    <title>Cadastrar Contato</title>
</head>
<body>
<<<<<<< HEAD
    <div id="form">
        <form action="/contatos" method="post">
            <h2 class="title">Adicionar Contato</h2>
        
            <label for="name">Nome: </label>
            <div class="input">
                <img src="images/user.svg">
                <input type="text" name="name" placeholder="Nome">
            </div>
            
            <label for="email">Email: </label>
            <div class="input">
                <img src="images/register-mail.svg">
                <input type="email" name="email" placeholder="Email">
            </div>
            
            <label for="phone">Telefone: </label>
            <div class="input">
                <img src="images/register-phone.svg">
                <input type="tel" name="phone" placeholder="Telefone">
            </div>
            
            <div id="btn">
                <button type="submit">Enviar</button>
            </div>
        </form>
        <a href="/index" id="link">Voltar</a>
    </div>
=======

    <form action="/contatos" method="post" >
        <label for="nome">NOME:</label>
        <input type="text" name="nome">

        <label for="email">Email:</label>
        <input type="email" name="email">

        <label for="telefone">Telefone:</label>
        <input type="text" name="telefone">

        <button  type="submit">Cadastrar Contato</button>
    </form>

>>>>>>> c8d6f64cbce179cbb8e3b32912f22d5624ba7ace
</body>
</html>