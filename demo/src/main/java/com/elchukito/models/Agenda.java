package com.elchukito.models;

import java.util.ArrayList;

public class Agenda {
    private String descricao;
    private String tipo;

    public Agenda(String descricao, String tipo) {
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public void adicionarContato(Contato contato) {
        // Main.databaseContato.add(contato);
    }

    public static ArrayList<Contato> listarContatos() {
        ArrayList<Contato> a = new ArrayList<>();
        return a;
    }

    public String toString() {
        return "Descricao: " + this.descricao + "  tipo: " + this.tipo + "  Contato: " + this.listarContatos();
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
