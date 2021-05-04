package com.pvt;

public class Main {

    public static void main(String[] args) {
Person person = new Person("Vova", "Putin", 67, 1112233);
        System.out.println(person.printAllInformation());
        System.out.println(person.printName());
        System.out.println(person.isAdult(67));

    }
}
