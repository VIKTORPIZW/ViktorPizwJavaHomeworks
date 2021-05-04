package com.pvt;

import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;
class Worker {
    public String name;
    public int age;
    public boolean criminal;

    public Worker(String name, int age, boolean criminal) {
        this.name = name;
        this.age = age;
        this.criminal = criminal;
    }
    public Worker(String name, int age) {
        this(name, age, false);
    }
    public String toString() {
        return this.name+" "+this.age+" "+(this.criminal? "":"");
    }
}

public class Main {

    public static void main(String[] args) {
        LinkedList<Worker> people = new LinkedList<>();
        people.add(new Worker("Vova", 17, true));
        people.add(new Worker("Pasha", 25, false));
        people.add(new Worker("Kostya", 43, true));
        people.add(new Worker("Masha", 24, true));
        people.add(new Worker("Katya", 87, false));
        people.add(new Worker("Sasha", 13, false));
        Map<Integer, Worker> map = people.stream().filter(x -> x.age >= 15).filter(x -> x.criminal == false)
                .collect(Collectors.toMap(x -> {
                    return (int) (104*Math.random()+4);
                }, x -> x));
        for (Map.Entry<Integer, Worker> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

