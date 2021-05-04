package com.pvt;

import java.util.Scanner;

public class Massive {


    public void method1() {
        System.out.println("ВВедите 2 числа через Enter! И мы поделим Первое на второе!");
        System.out.println("Для того, чтоб CATCH сработал, вместо второго числа ввести 0!");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            int result = a / b;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Проверьте введенные данные! Исключение словил!");
        }
    }

    public void method2() {
        System.out.println("Тут мы посмотрим как работаем мульти кэч! Можем попробовать создать" +
                "массив отрицательного размера или вывести 999-ый элемент массива =) ");
        Scanner scanner1 = new Scanner(System.in);
        int arraySize = scanner1.nextInt();
        try {
            int [] mas = new int[arraySize];
            System.out.println(mas[999]);

        } catch (NegativeArraySizeException |IndexOutOfBoundsException  z) {
            System.out.println("Вот так мульти-кэч работает!");

        }
    }

    public void method3() {
        System.out.println("Теперь с 2-мя CATCH в методе! ВВодим размер массива с кравиатуры и пытаемся вывести 50 " +
                "эллемент массива");
        System.out.println("Или можем попробовать создать массив отрицательного размера=)");
        Scanner scanner2 = new Scanner(System.in);
        int size = scanner2.nextInt();
        try {
            int[] array = new int[size];
            System.out.println(array[50]);
        } catch (NegativeArraySizeException q) {
            System.out.println("Размер массива меньше 0! Вот так мы избавились от красных строчек)");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Размер массива меньше 50! Сработал второй CATCH!) ");
        }
    }
    public void method4(){
        System.out.println(" Теперь посмотрим как работает try, catch, finally!");
        System.out.println("Вводим 2 числа и делим первое на второе! (второе вводим 0)");
        Scanner scanner3 = new Scanner(System.in);
        int x = scanner3.nextInt();
        int y = scanner3.nextInt();
        try {
            int result1 = x/y;
            System.out.println(result1);
            System.out.println("Эта строчка будет напечатана, только если у не равен 0!");
        }catch (ArithmeticException e){
            System.out.println("Вот эта строчка буден видна в результате, т.к. словил исключение!");
        }finally {
            System.out.println("А эта строчка будет видна в любом случае!");
        }

    }
}





