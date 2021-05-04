package com.pvt;

import com.pvt.Tester;

public class Main {

    public static void main(String[] args) {
        Tester tester = new Tester("Vova", "Petrov", 20, 99, 10000);
        Tester tester1 = new Tester("Alex","Popov");
        Tester tester2 = new Tester(5,70,5000);

       tester.printAllInfo();// получаем всю информацию, т.к. используем 3-ий конструктор.
       tester1.printNameAndSurname();// получаем имя и фамилию, т.к. используем 1-ый конструктор.
       tester2.printAllInfo();// Вместо имени и фамилии значения "null" т.к. используем 2-ой конструктор.
        tester2.experienceInMonth();// Получаем опыт в месяцах.
      //  tester.showSalary(); Не можем вызвать зп*2, т.к. есть доступ только в классе Tester;
        
    }

}
