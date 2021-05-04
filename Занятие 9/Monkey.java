package com.pvt;

import java.util.Scanner;

public class Monkey extends Animals {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override

    public void eat() {
        System.out.println("Я обезьяна!");
        System.out.println(" для того, чтоб покормить обезьяну- напишите : Банан!");
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int exit = 999;
        for (int i = 1; i < exit; i++) {
            String food = scanner.nextLine();
            super.eat();
            if (food.equals("Банан")) {
                System.out.println("MMMmmmmmmm..... Обезьяна сыта!");
                break;
            } else {
                System.out.println("Я ем только Бананы! Напиши Банан!");
            }
        }
    }
}

