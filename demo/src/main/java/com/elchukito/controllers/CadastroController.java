package com.elchukito.controllers;

import io.javalin.http.Handler;

public class CadastroController {
    
    public Handler get = ctx -> {
        ctx.render("cadastro.ftl");
    };
}
