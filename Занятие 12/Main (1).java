package com.pvt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц Вашего рождения (например: Декабрь)");
        String monthOfBirth = scanner.nextLine().toUpperCase();
        System.out.println("Введите дату Вашего рождения (например: 15)");
        int dayOfBirth = scanner.nextInt();
        Enum anEnum = Enum.valueOf(monthOfBirth);
        System.out.println("Ваш знак зодиака: " +anEnum.printZodiac(dayOfBirth));

    }
}
