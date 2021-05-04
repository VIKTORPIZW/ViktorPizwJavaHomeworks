package com.pvt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String text = new Scanner(System.in).nextLine().toLowerCase().replaceAll("[^0-9a-zа-я]", " ");
        Map<String, Integer> wordsCountNumber = new HashMap<>();
        Arrays.stream(text.split(" ")).filter(word -> word.length() > 0).forEach(word -> {
                    if (!wordsCountNumber.containsKey(word)) {
                        wordsCountNumber.put(word, 0);
                    }
                    wordsCountNumber.put(word, wordsCountNumber.get(word) + 1);
                });
        wordsCountNumber.entrySet().stream().sorted((a, b) -> {
                    int count = b.getValue() - a.getValue();
                    if (count == 0) return a.getKey().compareTo(b.getKey());
                    return count;
                })
                .limit(10).forEach(a -> {
                    System.out.println(a.getKey() + " - " + a.getValue());
                });
    }
    }

