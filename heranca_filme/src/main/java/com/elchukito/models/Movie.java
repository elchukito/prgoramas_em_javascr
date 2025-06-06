package com.elchukito.models;

public class Movie {
    private String title;
    private int publicateYear;
    private Director director;

    public Movie(String title, int publicateYear, Director director) {
        this.title = title;
        this.publicateYear = publicateYear;
        this.director = director;
    }

    public String viewDetails() {
        return "Titulo: " + this.title + ", Ano: " + this.publicateYear + ", Diretor: " + this.director;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }
    public int getPublicateYear() {
        return publicateYear;
    }
    public void setPublicateYear(int publicateYear) {
        this.publicateYear = publicateYear;
    }