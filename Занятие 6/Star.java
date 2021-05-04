package com.pvt;

public class Star extends StarObj implements PlanetInfo {
    private String type;
    private String name;

    public void setName(String a) {
        name = a;
    }

    public void setType(String b) {
        type = b;
    }

    public void printNameAndType() {
        System.out.println("Star:" + name + " Star obj type:" + type);
    }

    protected Star(int id, int number) {
        super(id, number);
    }

    @Override
    public void printInfo() {
        System.out.println("Planet info by Star");
    }
}