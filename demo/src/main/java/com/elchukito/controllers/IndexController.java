package com.elchukito.controllers;

import java.util.HashMap;
import java.util.Map;
import static com.elchukito.Main.databaseContato;

import io.javalin.http.Handler;

public class IndexController {
    
    public Handler get = ctx -> {
        Map<String, Object> model = new HashMap<>();
        model.put("databaseContato", databaseContato);
        ctx.render("index.ftl", model);
    };
}
