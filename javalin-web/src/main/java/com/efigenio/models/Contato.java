package com.efigenio.models;

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
        return this.nome + " - " + this.email;
    }
}
