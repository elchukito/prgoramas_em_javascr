package com.elchukito.models;

public class Motorcycle extends Vehicle
{
    private String handleBarType;

    public Motorcycle(String mark, String model, int year, String handleBarType)
    {
        super(mark, model, year);
        this.handleBarType = handleBarType;
    }

    public String displayDetails()
    {
        return super.displayDetails() + "\n Tipo de Guidao: " + this.handleBarType;
    }

    public String getHandleBarType() {
        return handleBarType;
    }
    public void setHandleBarType(String handleBarType) {
        this.handleBarType = handleBarType;
    }
}
