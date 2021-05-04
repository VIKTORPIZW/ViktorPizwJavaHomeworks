package com.pvt;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array= {23,54,76,23,76,45};
        Massive massive = new Massive();
        massive.printMassiveAsLine(array);

        massive.printReverseMassiveAsLine(array);
        massive.getSumOfElements(array);
        massive.multiptyBy3(array);
        massive.multiptyBy3revers(array);





    }
}
