package com.elchukito;

import com.elchukito.models.*;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("marcaBizonha", "modeloBizonho", 2001);
        System.out.println(vehicle.displayDetails());

        Car car = new Car("xevrolet", "carro louco", 2003, 4);
        System.out.println(car.displayDetails());

        Motorcycle motorcycle = new Motorcycle("bmw", "randandan", 20017, "rapido e fatal");
        System.out.println(motorcycle.displayDetails());
    }
}