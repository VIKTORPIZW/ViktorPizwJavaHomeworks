package com.pvt;

import java.util.Scanner;

public abstract class Animals {
   protected String name;
   protected int age;
   public Animals (String name, int age) {
       this.age = age;
       this.name = name;
   }
   public void printAnimalInfo () {
       System.out.println();
       System.out.println("Меня зовут :" + name);
       System.out.println("Мне " + age + " лет");
   }
    public void eat () {

    }




    }

