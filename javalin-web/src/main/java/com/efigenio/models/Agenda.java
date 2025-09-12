package com.efigenio.models;

import java.util.ArrayList;

import com.efigenio.Main;

public class Agenda {
    private String descricao;
    private String tipo;

    public Agenda(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public void adicionarContato(Contato contato) {
        Main.databaseContato.add(contato);
    }

    public ArrayList<Contato> listarContatos() {
        return Main.databaseContato;
    }

    public String toString() {
        return "Descrição: " + this.descricao + "\n" + "Tipo: " + this.tipo + " Contato: " + this.listarContatos();
    }
}
