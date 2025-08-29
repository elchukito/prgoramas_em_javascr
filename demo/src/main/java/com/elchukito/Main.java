package com.elchukito;

import com.elchukito.controllers.*;
import com.elchukito.utils.JavalinUtils;
import com.elchukito.models.*;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

import java.util.ArrayList;

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

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(7000);

        IndexController indexController = new IndexController();
        CadastroController cadastroController=  new CadastroController();
        
        app.get("/", indexController.get);
        app.get("/cadastro", cadastroController.get);
    }
}