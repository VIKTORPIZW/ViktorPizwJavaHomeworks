package com.pvt;

public class Sun extends Star implements PlanetInfo {
    int age;
    int radius;

    public Sun(int age, int radius) {
        super(99, 12309);
        this.radius = radius;
        this.age = age;
    }

    public void printAgeAndRadius() {
        System.out.println("Age of Sun:" + age + " Radius of Sun:" + radius);
    }

    public void printString() {
        System.out.println("What is it? It's Sun");
    }


    @Override
    public void printInfo() {
        System.out.println("Planet Info by Sun");

    }
}
