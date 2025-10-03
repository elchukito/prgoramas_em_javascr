<head>
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
</head>
<#macro studentCard student>
    <table id="table-view">
        <tr>
            <th>Nome: </th>
            <td>${student.name}</td>
        </tr>
        <tr>
            <th>Aniversario: </th>
            <td>${student.birthday}</td>
        </tr>
        <tr>
            <th>Email: </th>
            <td>${student.email}</td>
        </tr>
        <tr>
            <th>CPF: </th>
            <td>${student.cpf}</td>
        </tr>
        <tr>
            <th>Grade </th>
        </tr>
        <tr>
            <th>Nota1: </th>
            <td>${student.grades.grade1}</td>
        </tr>
        <tr>
            <th>Nota2: </th>
            <td>${student.grades.grade2}</td>
        </tr>
        <tr>
            <th>Nota3: </th>
            <td>${student.grades.grade3}</td>
        </tr>
        <tr>
            <th>Nota4: </th>
            <td>${student.grades.grade4}</td>
        </tr>
        <tr>
            <th>Media: </th>
            <td>${student.grades.gradeAvg}</td>
        </tr>
    </table>
</#macro>

<#macro studentOption student>
    <form id="edit-student-form" action="/editStudent" method="post">
        <input type="hidden" id="cpf" name="cpf" value="${student.cpf}">
        <button id="student-but" type="submit">${student.name} - ${student.cpf}</button>
    </form>
</#macro>