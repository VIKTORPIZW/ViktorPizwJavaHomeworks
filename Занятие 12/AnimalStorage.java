package com.pvt;

import java.util.ArrayList;

public class AnimalStorage<T extends Animal> {

    ArrayList<T> storageList = new ArrayList<>();

    public AnimalStorage() {

    }

    public void addAnimal(T animal) {
        storageList.add(animal);
    }

    public void deleteAnimal() {
        storageList.remove(0);
    }
    public String toString() {
        return String.valueOf(storageList.size());
    }

}








