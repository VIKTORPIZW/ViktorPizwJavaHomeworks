package com.pvt;

import java.lang.reflect.Field;


public class Main extends AbstractClient{

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Client client= new Client();
        client.printName();
        client.printName2();
        Field field = client.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(client, "Dima Medvedev");
        client.printName();
        client.printName2();
        AbstractClient abstractClient = new AbstractClient() {
            @Override
            void print() {
                System.out.println("А тут будет такая надпись");
                super.print();

            }

            @Override
            void printRepeat() {
                System.out.println("Пусть будет такая надпись");
                super.printRepeat();
            }
        };
        abstractClient.printRepeat();
        abstractClient.print();
        client.printRepeat();
    }
}


