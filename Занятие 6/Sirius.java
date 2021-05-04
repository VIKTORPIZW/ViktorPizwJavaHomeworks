package com.pvt;

public class Sirius extends Star implements PlanetInfo{
    int age;
    int radius;
    public Sirius(int age, int radius){
        super(22,3456);
        this.radius=radius;
        this.age=age;
    }
    public void printAgeAndRadius () {
        System.out.println("Age of Sirius:" + age + " Radius of Sirius:" + radius);
    }
    public void printString (){
        System.out.println("What is it? It's Sirius");
    }


    @Override
    public void printInfo() {
        System.out.println("Planet Info by Sirius");
    }
}


