<#import "macros.ftl" as m>

<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
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
    
    <title>editar aluno</title>
</head>

<body>
    <h1>EDITAR ALUNO</h1>

    <div id="container">
        <form id="edit-form" action="/updateStudent" method="post" enctype="multipart/form-data">
            <input type="hidden" id="lineNumber" name="lineNumber" value="${lineNumber}">
            <label for="name">Nome: </label>
            <input type="text" id="name" name="name" value="${student.name}" required>
            <br>
            <label for="birthday">Aniversario: </label>
            <input type="date" id="birthday" name="birthday" value="${student.birthday}" required>
            <br>
            <label for="email">Email: </label>
            <input type="email" id="email" name="email" value="${student.email}" required>
            <br>
            <label for="cpf">CPF: </label>
            <input oninput="mascara(this)" type="text" id="cpf" name="cpf" value="${student.cpf}" required>
            <br>
            <h2>Notas(1 a 10)</h2>
            <label for="grade1">Nota1: </label>
            <input type="number" min="0.00" max="10.00" id="grade1" name="grade1" value="${grade1}" step="0.01" >
            <br>
            <label for="grade2">Nota2: </label>
            <input type="number" min="0.00" max="10.00" id="grade2" name="grade2" value="${grade2}" step="0.01" >
            <br>
            <label for="grade3">Nota3: </label>
            <input type="number" min="0.00" max="10.00" id="grade3" name="grade3" value="${grade3}" step="0.01" >
            <br>
            <label for="grade4">Nota4: </label>
            <input type="number" min="0.00" max="10.00" id="grade4" name="grade4" value="${grade4}" step="0.01" >
            <br>
            <button id="register-but" type="submit">Atualizar</button>
        </form>
        <form id="delete-student-form" action="/deleteStudent" method="post">
            <input type="hidden" id="cpf" name="cpf" value="${student.cpf}">
            <button id="student-but" type="submit">Remover Estudante</button>
        </form>

        <a id="back-but" href="/">Voltar</a>

    </div>
</body>

</html>