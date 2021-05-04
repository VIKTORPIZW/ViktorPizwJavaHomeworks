package com.pvt;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Вова Путин", "Единая Россия", "Навальный молодец");
        User user2 = new User("Дима Медведев", "Единая Россия 2", "Путин молодец");
        User user3 = new User("Леша Навальный", "Россия будущего", "Я молодец");
        User user4 = new User("Саша Лукашенко", "Синие Пальцы 2020", "Будем кормить Собачку");

        user1.computerWorking(Computer.getInstance());
        System.out.println();
        user2.computerWorking(Computer.getInstance());
        System.out.println();
        user3.computerWorking(Computer.getInstance());
        System.out.println();
        user4.computerWorking(Computer.getInstance());

    }
}
