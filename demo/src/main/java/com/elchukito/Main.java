package com.elchukito;

import com.elchukito.controllers.IndexController;
import com.elchukito.utils.JavalinUtils;
import io.javalin.Javalin;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ){
        Javalin app = JavalinUtils.makeApp(7070);
        
        IndexController indexController = new IndexController();
        
        app.get("/", indexController.get);
        
    }
}