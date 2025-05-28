package com.elchukito.models;

public class Car extends Vehicle
{
    private int numDoor;

    public Car(String mark, String model, int year, int numDoor)
    {
        super(mark, model, year);
        this.numDoor = numDoor;
    }

    public String displayDetails()
    {
        return super.displayDetails() + "\n Numero de Portas: " + this.numDoor;
    }

    public int getNumDoor()
    {
        return numDoor;
    }
    public void setNumDoor(int numDoor)
    {
        this.numDoor = numDoor;
    }
}
