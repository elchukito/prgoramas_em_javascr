package com.elchukito.controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;

import com.elchukito.models.Agenda;

import io.javalin.http.Handler;

public class IndexController {
    private String filePath = "arquivo.txt";
    
    public Handler get = ctx -> {
        writeTextFile();

        ctx.render("index.ftl", Map.of("contactlist", Agenda.listarContatos() ) ) ;
    };

    public void readTextFile() throws FileNotFoundException {

        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void writeTextFile() throws FileNotFoundException {
        String content = "mensagem do arquivo de texto";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
            bw.write(content);
            bw.newLine();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
