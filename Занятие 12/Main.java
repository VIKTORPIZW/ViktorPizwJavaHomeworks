package com.pvt;

public class Main {

    public static void main(String[] args) {

        PrintingWords printWord1 = () -> System.out.println("Напишем вот такую строку");

        PrintingWords printWords2 = () -> System.out.println("Теперь, допустим такую!");

        PrintingWords printWords3 = () -> System.out.println("Вот эта строка отличается от всех)");

        printWord1.printInfo();
        printWords2.printInfo();
        printWords3.printInfo();
    }
}