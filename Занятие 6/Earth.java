package com.pvt;

public class Earth extends Planet implements PlanetInfo{
    int age;
    int radius;
    public Earth(int age, int radius){
        super();
        this.radius=radius;
       this.age=age;
    }
    public void printAgeAndRadius () {
        System.out.println("Age of Earth:" + age + " Radius of Earth:" + radius);
    }
    public void printString (){
        System.out.println("What is it? It's Earth");
    }


    @Override
    public void printInfo() {
        System.out.println("Planet Info by Earth");
    }
}

