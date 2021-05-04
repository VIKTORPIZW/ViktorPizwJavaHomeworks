package com.pvt;

public abstract class AbstractClient {
    static String surname = "Naval'niy";
    void print(){
        System.out.println(surname);
    }
    void printRepeat(){
        System.out.println(surname.repeat(1));

    }


}
