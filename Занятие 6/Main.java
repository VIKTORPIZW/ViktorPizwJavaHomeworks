package com.pvt;
public class Main {

    public static void main(String[] args) {
Planet planet=new Planet();
Planet planet1=new Planet();
planet.setType("Planet");
planet.setName("Earth");
planet1.setName("Mars");
planet1.setType("Planet");
Mars mars=new Mars(19999,200000);
mars.printAgeAndRadius();
Earth earth= new Earth(23232,121212);
earth.printAgeAndRadius();
planet.printNameAndType();
planet1.printNameAndType();
earth.printString();
mars.printString();
StarObj starObj=new StarObj(11,8);
starObj.printIdAndNumber();
starObj.printInfo();
planet.printInfo();
mars.printInfo();
earth.printInfo();
Star star = new Star(13,78);
star.printNameAndType();
star.setName("Sirius");
star.setType("Star");
star.printInfo();
Sirius sirius=new Sirius(999,1929);
sirius.printAgeAndRadius();
sirius.printInfo();
sirius.printString();
sirius.printIdAndNumber();
Sun sun=new Sun(100000,987432);
sun.printAgeAndRadius();
sun.printIdAndNumber();
sun.printInfo();
sun.printString();

    }

}

