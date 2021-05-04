package com.pvt;

import java.util.Scanner;

public class User {
    private final String userName;
    private final String login;
    private final String password;

    public User(String name, String login, String password){
        this.userName = name;
        this.login = login;
        this.password = password;
    }

    public void computerWorking(Computer computer){
        System.out.println("Хозяин компа " + computer.getName());
        System.out.println("Кому продадим комп? Введите имя!");
        computer.setName(new Scanner(System.in).nextLine());
        System.out.println(" Id компьютера " + computer.getId());
        System.out.println(" OS компьютера " + computer.getOS());
        System.out.println(" Процессор компьютера " + computer.getProc());
    }

}
