package com.pvt;

import java.util.Scanner;

public class Paragraph implements InterfaceOfWord {

    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine();
    String[] sentenceArray = sentence.split(" ");
    char symbolSentence = '%';
    int indexSentence = scanner.nextInt();
    public void remake1() {
        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i].length() >= indexSentence) {
                sentenceArray[i] = sentenceArray[i].substring(0, indexSentence - 1)+symbolSentence +
                        sentenceArray[i].substring(indexSentence);
                System.out.println(sentenceArray[i]);
            }
        }
    }
public static void staticDemonstation( int a, int b) {
    System.out.println(a + b);
}
public void demonstration( String name, int age) {
    System.out.println( "Name:"+ name + " age:"+ age);
}
public void demonstration (int age, int number, String surname) {
    System.out.println("Age:" +age + " Number:"+ number+ " Surname:"+surname);
}
    @Override
    public void print() {
        System.out.println("like this I can by Paragraph");
    }
    @Override
    public void learnMusic() {
        System.out.println(" Class Paragraph learn: Bach");
    }

}
