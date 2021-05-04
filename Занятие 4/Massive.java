package com.pvt;

public class Massive {

    public void printMassiveAsLine(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println("\n");
    }

    public void printReverseMassiveAsLine(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");


        }

    }

    public void getSumOfElements(int[] array) {
        int sum = array[0] + array[1] + array[2] + array[3] + array[4] + array[5];

        System.out.println("\n");
        System.out.print(sum+ " ");
        System.out.println("\n");

    }


    public void multiptyBy3(int[] array) {
        for (int i=0; i<array.length; i++) {
            array[i] = array[i] * 3;
            System.out.print(array[i]+" ");
        }
        System.out.println("\n");

    }

    public void multiptyBy3revers(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = array[i] * 3;
            System.out.print(array[i]+ " ");
        }

    }
    }







