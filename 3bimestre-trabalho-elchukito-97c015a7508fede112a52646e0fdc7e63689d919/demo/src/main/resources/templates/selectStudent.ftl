<#import "macros.ftl" as m>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet" href="/css/styles.css">

    <title>editar aluno</title>
</head>
<body>
    <h1>EDITAR ALUNO</h1>
    <#if (studentlist?has_content)>
        <h2>Selecione o Aluno a Editar:</h2>
        <#list studentlist as s>
            <@m.studentOption student=s/>
        </#list>
        <#else/>
        <h2>Nenhum aluno cadastrado!</h2>
    </#if>
    <a href="/">Voltar</a>
</body>
</html>