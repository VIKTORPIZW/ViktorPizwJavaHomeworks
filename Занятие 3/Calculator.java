package com.pvt;

import java.util.Scanner;

public class Calculator {

    static int minCountPrint(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    static int squaring(int e) {
        return (e * e);
    }

    static int cube(int e) {
        int three = 3;
        return (int) Math.pow(three, e);
    }
    static int doubleMinus (int f, int g,int h) {
        int o = f-g-h;
        return (o);
    }
    static boolean divByTwo(int c) {
        return (c % 2 == 0);

    }




}





