<#import "macros.ftl" as m>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="/css/styles.css">
    <title>Lista de Alunos</title>
</head>
<body>
    <h1>LISTA DE ALUNOS</h1>

    <div id="students-list">
        <#if (studentlist?has_content)>
            <#list studentlist as s>
                <@m.studentCard student=s.student />
            </#list>
            <#else/>
                <h2>Nenhum aluno cadastrado!</h2>
        </#if>
    </div>

    <a  href="/">Voltar</a>
</body>
</html>