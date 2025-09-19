package com.elchukito;

import java.util.ArrayList;

import com.elchukito.config.AppConfig;
import com.elchukito.models.Contato;
import com.elchukito.routes.Root;

public class Main {

    public static void main( String[] args ){

        AppConfig appConfig = new AppConfig();
        appConfig.startApp();

        Root rotas = new Root();
        rotas.registerRoots(appConfig.startApp());
    }
}