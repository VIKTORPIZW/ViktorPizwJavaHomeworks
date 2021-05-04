package com.pvt;

import java.util.Scanner;

public class Cow extends Animals {


    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Я корова!");
        System.out.println(" Для того, чтоб покормить Корову травой- напишите : Трава!");
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int exit = 999;
        for (int i=1; i<exit; i++) {
        String food = scanner.nextLine();
        super.eat();
        if (food.equals("Трава")) {
            System.out.println("MMMmmmmmmm..... Корова сыта!");
            break;
        } else {
            System.out.println("Я ем только траву! Напиши трава!");
            System.out.println("Коровы едят только ТРАВУ!");
        }
        }
    }
}
