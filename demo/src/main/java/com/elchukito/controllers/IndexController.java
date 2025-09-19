package com.elchukito.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.elchukito.models.Agenda;

import io.javalin.http.Handler;

public class IndexController {
    
    public Handler get = ctx -> {
        ctx.render("index.ftl", Map.of("contactlist", Agenda.listarContatos() ) ) ;
    };
}
