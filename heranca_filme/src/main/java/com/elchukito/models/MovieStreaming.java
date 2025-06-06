package com.elchukito.models;

import com.elchukito.enums.EnumStreaming;

public class MovieStreaming extends Movie {
    private EnumStreaming streaming;

    public MovieStreaming(String title, int publicateYear, Director director, EnumStreaming streaming) {
        super(title, publicateYear, director);
        this.streaming = streaming;
    }

    public String viewDetails() {
        return "\n Filme de Streaming - " + super.viewDetails() + ", Plataforma: " + this.streaming;
    }

    public EnumStreaming getStreaming() {
        return streaming;
    }
    public void setStreaming(EnumStreaming streaming) {
        this.streaming = streaming;
    }
}