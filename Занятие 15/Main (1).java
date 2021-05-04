package com.pvt;

class FirstClass {

    synchronized void first(SecondClass b) {

        String name = Thread.currentThread().getName();
        System.out.println(name + " запущен");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Скорее всего не понадобится");
        }

        System.out.println(name + " сейчас зависнет");
        b.second2();
    }

    synchronized void second() {
        System.out.println("По идее не понадобится");
    }
}

class SecondClass {

    synchronized void second1(FirstClass a) {

        String name = Thread.currentThread().getName();
        System.out.println(name + " запущен");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Скорее всего не понадобится");
        }

        System.out.println(name + " Сейчас зависнет");
        a.second();
    }

    synchronized void second2() {
        System.out.println("Не понадобится");
    }
}


class Main implements Runnable {

    FirstClass classA = new FirstClass();
    SecondClass classB = new SecondClass();

    Main() {
        Thread.currentThread().setName("Поток 1");
        Thread thread = new Thread(this, "Поток 2");
        thread.start();

        classA.first(classB);
        System.out.println("Ерунда");
    }

    public void run() {
        classB.second1(classA);
        System.out.println("Ерунда");
    }

    public static void main(String args[]) {
       new Main();
    }
}