package com.pvt;

import java.util.Scanner;

public class Word extends Sentence implements InterfaceOfWord {
    @Override
    public void learnMusic() {
        super.learnMusic();
        System.out.println("Class Word learn: Paganini");
    }

    @Override
    public void print() {
        System.out.println("like this I can by Word");
    }
}




