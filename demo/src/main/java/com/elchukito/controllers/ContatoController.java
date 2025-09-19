package com.elchukito.controllers;

import java.util.Map;

import io.javalin.http.Handler;


public class ContatoController {
    
    public Handler get = ctx -> {
        ctx.render("cadastro.ftl");
    };

    public Handler post = ctx -> {
        String name = ctx.formParam("name");
        String phone = ctx.formParam("phone");
        String email = ctx.formParam("email");

        // databaseContato.add(new Contato(name, phone, email));

        System.out.println(name);
        System.out.println(phone);
        System.out.println(email);

        String message = "Contato: " + name + " Cadastrado";

        ctx.render("visualizarContato.ftl", Map.of("message", message));
    };
}
