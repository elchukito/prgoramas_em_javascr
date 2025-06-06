package com.elchukito.enums;

public enum EnumNacion {
    BRASIL(1, "brasil"), USA(2, "united states"), PARAGUAI(3, "paraguai"), CHILE(4, "chile"), RUSSIA(5, "russia");

    EnumNacion(int id, String description) {
        this.id = 0;
        this.description = "EnumNacion";
    }

    private int id;
    private String description;

    public String getDescription() {
        return description;
    }
    public int getId() {
        return id;
    }
}
