package com.efigenio;

import java.util.ArrayList;

import com.efigenio.controllers.ContatoController;
import com.efigenio.controllers.IndexController;
import com.efigenio.models.*;

import freemarker.template.Configuration;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinFreemarker;

public class Main {
    // Simulando banco de dados!
    public static ArrayList<Contato> databaseContato = new ArrayList<>();

    public static void main(String[] args) {
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_34);
        cfg.setClassForTemplateLoading(Main.class, "/templates");
        cfg.setDefaultEncoding("UTF-8");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
            config.fileRenderer(new JavalinFreemarker(cfg));
        }).start(8080);

        IndexController indexController = new IndexController();
        ContatoController contatoController = new ContatoController();

        app.get("/", indexController.get);
        app.get("/cadastro", contatoController.get);
        app.post("/contatos", contatoController.post);
    }
}