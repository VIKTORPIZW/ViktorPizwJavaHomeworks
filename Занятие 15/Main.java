package com.pvt;

class MyClass extends Thread {
    int time = (int) Math.random();
    public void run(){
        for (int i=0; i<=5; i++){
            System.out.println("Числа потока 1: "+ i);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Main {


    public static void main(String[] args) {
	MyClass thread1 = new MyClass();
	Thread thread3 = new Thread(new NewClass());
	thread3.start();
	thread1.start();
	MyClass thread2 = new MyClass();
	thread2.start();
	Thread thread4 = new Thread(new Runnable() {
        @Override
        public void run() {

            int timeOf3 = (int) Math.random();
            for (int i=0; i<=5; i++){
                System.out.println("Числа потока 3:  "+ i + " А этот поток совсем другой!");
                try {
                    Thread.sleep(timeOf3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

    }

        }
    });
	thread4.start();



    }
}