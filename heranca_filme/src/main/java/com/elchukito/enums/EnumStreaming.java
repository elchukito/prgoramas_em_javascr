package com.elchukito.enums;

public enum EnumStreaming {
    NETFLIX(1, "netlix.com"), AMAZON(2, "primevideo.com"), DISNEY(3, "disneyplus.com"), 
    POBREFLIX(4, "pobreflix.com"), XVIDEOS(69, "xvideos.com");

    EnumStreaming (int id, String name) {
        this.id = 0;
        this.name = "EnumStreaming";
    }

    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
