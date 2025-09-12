package com.efigenio.controllers;

import java.util.Map;

import io.javalin.http.Handler;

public class ContatoController {

    public Handler get = ctx -> {
        ctx.render("cadastro.ftl");
    };

    public Handler post = ctx -> {
<<<<<<< HEAD
        String nome = ctx.formParam("name");
        String telefone = ctx.formParam("phone");
        String email = ctx.formParam("email");

        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);

        String mensagem = "Nome: " + nome + "\n" + "Telefone: " + telefone + "\n" + "Email: " + email;

        ctx.render("visualizarContato.ftl", Map.of("mensagem", mensagem));
=======
        String nome = ctx.formParam("nome");
        String telefone = ctx.formParam("telefone");
        String email = ctx.formParam("email");

        System.out.println(nome);
        System.out.println(telefone);
        System.out.println(email);
        String mensagem = "Contato: "+ nome+ "Cadastrado";

        ctx.render("visualizarContato.ftl",Map.of("mensagem",mensagem));
>>>>>>> c8d6f64cbce179cbb8e3b32912f22d5624ba7ace
    };
}
