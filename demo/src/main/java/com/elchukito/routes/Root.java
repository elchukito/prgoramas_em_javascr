package com.elchukito.routes;

import com.elchukito.controllers.ContatoController;
import com.elchukito.controllers.IndexController;

import io.javalin.Javalin;

public class Root {
    private IndexController indexController = new IndexController();
    private ContatoController contatoController =  new ContatoController();

    public Root() {
        this.indexController = new IndexController();
        this.contatoController =  new ContatoController();
    }

    public void registerRoots(Javalin app) {
        app.get("/", indexController.get);
        app.get("/cadastro", contatoController.get);
        app.post("/contatos", contatoController.post);
    }
}
