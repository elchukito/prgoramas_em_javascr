package com.elchukito.models;

public class MovieTheater extends Movie {
    private int lengthMin;

    public MovieTheater(String title, int publicateYear, Director director, int lengthMin) {
        super( title, publicateYear, director);
        this.lengthMin = lengthMin;
    }

    public String viewDetails() {
        return "\n Filme de Cinema - " + super.viewDetails() + ", Duracao: " + this.lengthMin + " minutos";
    }

    public int getLengthMin() {
        return lengthMin;
    }
    public void setLengthMin(int lengthMin) {
        this.lengthMin = lengthMin;
    }
}