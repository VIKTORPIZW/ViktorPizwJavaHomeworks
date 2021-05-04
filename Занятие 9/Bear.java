package com.pvt;

import java.util.Scanner;

public class Bear extends Animals {
    public Bear(String name, int age) {
        super(name, age);
    }

    @Override

    public void eat() {
        System.out.println("Я медведь!");
        System.out.println(" Медведь спит! Его не нужно кормить! Чтобы просто посмотреть на медведя," +
                " напиши Смотреть, или попробуй его покормить...Чего я делать не советую!");
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int exit = 999;
        for (int i = 1; i < exit; i++) {
            String food = scanner.nextLine();
            super.eat();
            if (food.equals("Смотреть")) {
                System.out.println("MMMmmmmmmm..... Увидимся весной!");
                break;

            } else {
                System.out.println("Ты разбудил медведя! Беги!!!!!");
            }

        }
    }
}
