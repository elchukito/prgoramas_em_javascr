package com.elchukito.models;

import com.elchukito.enums.EnumNacion;

public class Director {
    private String name;
    private EnumNacion nacion;

    public Director(String name, EnumNacion nacion) {
        this.name = name;
        this.nacion = nacion;
    }

    public EnumNacion getNacion() {
        return nacion;
    }
    public void setNacion(EnumNacion nacion) {
        this.nacion = nacion;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
