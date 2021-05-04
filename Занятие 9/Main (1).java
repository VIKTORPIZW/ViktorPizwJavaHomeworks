package com.pvt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
Zoo zoo = new Zoo(1000,30);
zoo.animalList();
zoo.countOfAnimals();
Cow cow = new Cow("borya",3);
cow.printAnimalInfo();
cow.eat();
Monkey monkey = new Monkey("Monkey",4);
monkey.printAnimalInfo();
monkey.eat();
Camel camel = new Camel("Camel",10);
camel.printAnimalInfo();
camel.eat();
Bear bear = new Bear("Potapich", 40);
bear.printAnimalInfo();
bear.eat();
        System.out.println("Вы посетили наш зоопарк! Увидимся, когда животных станет еще больше!");
}
}
