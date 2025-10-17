package com.elchukito;

import com.elchukito.config.AppConfig;
import com.elchukito.routes.Root;

public class Main {
    public static void main( String[] args ){

        AppConfig appConfig = new AppConfig();

        Root rotas = new Root();
        rotas.registerRoots(appConfig.startApp());
    }
}