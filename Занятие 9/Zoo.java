package com.pvt;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Zoo {


    public Zoo(int area, int staff) {
        System.out.println( area + " Площадь зоопарка");
        System.out.println( staff + " Колличество сотрудников");


    }


    public ArrayList<Object> animalList() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Cow");
        list.add("Bear");
        list.add("Camel");
        list.add("Monkey");
        return list;
    }

    public void countOfAnimals() {
        System.out.println("В зоопарке много голодных животных! " +animalList());
        System.out.println("Узнай как их зовут и солько им лет!");

    }

}




