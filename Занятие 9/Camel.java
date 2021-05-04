package com.pvt;

import java.util.Scanner;

public class Camel extends Animals {
    public Camel(String name, int age) {
        super(name, age);
    }

    @Override

    public void eat() {
        System.out.println("Я верблюд!");
        System.out.println(" Верблюда кормить не нужно! Ему бы водички!");
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int exit = 999;
        for (int i = 1; i < exit; i++) {
            String food = scanner.nextLine();
            super.eat();
            if (food.equals("Вода")) {
                System.out.println("MMMmmmmmmm..... Я уталил жажду!");
                break;
            } else {
                System.out.println("Я не голоден! Дай воды!");
                System.out.println("Дай ВОДЫ, а то плюну!");
            }
        }
    }
}
