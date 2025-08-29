package com.elchukito.models;

import com.elchukito.Main;
import java.util.ArrayList;

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
        return "Descricao: " + this.descricao + "  tipo: " + this.tipo + "  Contato: " + this.listarContatos();
    }
}
