package com.elchukito;

import java.util.ArrayList;

import com.elchukito.controllers.ContatoController;
import com.elchukito.controllers.IndexController;
import com.elchukito.models.Contato;

import freemarker.template.Configuration;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinFreemarker;

/**
 * Hello world!
 *
 */
public class Main {
    public static ArrayList<Contato> databaseContato = new ArrayList<>();

    public static void main( String[] args ){
        //Contato contato=  new Contato("Sergio Moro", "sergiomorinho@outlook.com", "08001234");

        //Agenda agenda = new Agenda("info24", "online");

        //agenda.adicionarContato(contato);

        //System.out.println(agenda);

        Configuration cfg = new Configuration(Configuration.VERSION_2_3_34);
        cfg.setClassForTemplateLoading(Main.class, "/templates");
        cfg.setDefaultEncoding("UTF-8");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
            config.fileRenderer(new JavalinFreemarker(cfg));
        }).start(7000);

        IndexController indexController = new IndexController();
        ContatoController contatoController =  new ContatoController();
        
        app.get("/", indexController.get);
        app.get("/cadastro", contatoController.get);
        app.post("/contatos", contatoController.post);
    }
}