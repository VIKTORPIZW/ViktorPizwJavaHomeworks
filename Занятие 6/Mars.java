package com.pvt;

public class Mars extends Planet implements PlanetInfo{
    int age;
    int radius;
    public Mars (int age, int radius) {
        this.radius=radius;
        this.age =age;
    }
    public void printAgeAndRadius (){
        System.out.println("Age of Mars:"+age+" Radius of Mars:"+radius);
    }
    public void printString (){
        System.out.println("What is it? It's Mars");
    }

    @Override
    public void printInfo() {
        System.out.println("Planet Info By Mars");
    }
}
