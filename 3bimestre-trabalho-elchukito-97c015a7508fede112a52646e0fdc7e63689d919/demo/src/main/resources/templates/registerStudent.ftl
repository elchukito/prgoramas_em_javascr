<#import "macros.ftl" as m>

    <!DOCTYPE html>
    <html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
            rel="stylesheet">

        <link rel="stylesheet" href="css/styles.css">

        <script>
            function mascara(i){
            var v = i.value;
            
            if(isNaN(v[v.length-1])){ // impede entrar outro caractere que não seja número
                i.value = v.substring(0, v.length-1);
                return;
            }
            
            i.setAttribute("maxlength", "14");
            if (v.length == 3 || v.length == 7) i.value += ".";
            if (v.length == 11) i.value += "-";

            }
        </script>
        
        <title>cadastro de aluno</title>
    </head>

    <body>
        <h1>REGISTRO DE ALUNO</h1>

        <div id="container">
            <form id="register-form" action="/viewStudent" method="post" enctype="multipart/form-data">
                <input type="text" id="name" name="name" placeholder="name:" onblur="placeholder='name:'"
                    onclick="placeholder='ex: Sergio Moro'" required>
                <br>
                <input type="date" id="birthday" name="birthday" placeholder="Aniversario:" required>
                <br>
                <input type="email" id="email" name="email" placeholder="Email:" onblur="placeholder='Email:'"
                    onclick="placeholder='ex: Exemplo@gmail.com'" required>
                <br>
                <input oninput="mascara(this)" type="text" id="cpf" name="cpf" placeholder="cpf:" onblur="placeholder='cpf:'"
                    onclick="placeholder='ex: 000.000.000-00'" required>
                <br>
                <h2>Notas(1 a 10)</h2>
                <input type="number" min="0.00" max="10.00" id="grade1" name="grade1" placeholder="Nota 1:" step="0.01" >
                <br>
                <input type="number" min="0.00" max="10.00" id="grade2" name="grade2" placeholder="Nota 2:" step="0.01" >
                <br>
                <input type="number" min="0.00" max="10.00" id="grade3" name="grade3" placeholder="Nota 3:" step="0.01" >
                <br>
                <input type="number" min="0.00" max="10.00" id="grade4" name="grade4" placeholder="Nota 4:" step="0.01" >
                <br>
                <button id="register-but" type="submit">Registrar</button>
            </form>

            <a id="back-but" href="/">Voltar</a>


        </div>
    </body>

    </html>