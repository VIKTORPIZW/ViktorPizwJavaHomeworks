package com.pvt;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input Paragraph , Press Enter! Input Index, Press Enter");
       Paragraph paragraph = new Paragraph();
       paragraph.remake1();
       paragraph.print();
        System.out.println("Input sentence , Press Enter! Input Index, Press Enter");
       Sentence sentence = new Sentence();
       sentence.remake1();
       sentence.print();
        System.out.println("Input word , Press Enter! Input Index, Press Enter ");
        Word word = new Word();
        word.remake1();
        word.print();
        System.out.println("Static demonstration");
        paragraph.staticDemonstation(123,523);
        System.out.println("WOW?!");
        sentence.demonstration("Vovo", 66);
        sentence.demonstration(123,234,"Lalala");
        paragraph.learnMusic();
        sentence.learnMusic();
        int hashCode;
        hashCode=sentence.hashCode();
        System.out.println(hashCode);
        int hashCode1;
        hashCode1=word.hashCode();
        System.out.println(hashCode1);
        HashCode hashCode2 = new HashCode("Lalala","Tututu");
        HashCode hashCode3 = new HashCode("Lalala", "Tututu");
        System.out.println(hashCode2==hashCode3);
        System.out.println(hashCode2.equals(hashCode3));







            }
        }


