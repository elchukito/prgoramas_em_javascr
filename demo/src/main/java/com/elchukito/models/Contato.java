package com.elchukito.models;

import com.elchukito.Main;

public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String toString() {
        return "Nome: " + this.nome + "  Email: " + this.email + "  Telefone: " + this.telefone;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
