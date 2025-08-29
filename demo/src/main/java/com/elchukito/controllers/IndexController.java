package com.elchukito.controllers;

import io.javalin.http.Handler;

public class IndexController {
    
    public Handler get = ctx -> {
        ctx.render("index.html");
        // iremos utilizar templetes
        // com render()
    };
}
