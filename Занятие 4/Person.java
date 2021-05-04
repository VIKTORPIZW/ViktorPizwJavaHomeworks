package com.pvt;

public class Person {
    private String name;
    private String surname;
    private int age;
    private long number;

    public Person(String name, String surname, int
            age, long number) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;

    }

    public long getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String printAllInformation() {
        return "Person name:" + name + "  surname:" + surname + "   age:" + age + "   number:" + number;
    }

    public String printName() {
        return "Person name:" + name + "   " + surname;
    }

    public boolean isAdult(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}













