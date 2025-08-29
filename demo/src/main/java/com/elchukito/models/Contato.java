package com.elchukito.models;

import com.elchukito.Main;

public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String toString() {
        return "Nome: " + this.nome + "  Email: " + this.email + "  Telefone: " + this.telefone;
    }
}
