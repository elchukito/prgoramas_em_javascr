package com.elchukito.routes;

import com.elchukito.controllers.IndexController;

import io.javalin.Javalin;

public class Root {
    private IndexController indexController = new IndexController();

    public Root() {
        this.indexController = new IndexController();
    }

    public void registerRoots(Javalin app) {
        app.get("/", indexController.get);
    }
}
