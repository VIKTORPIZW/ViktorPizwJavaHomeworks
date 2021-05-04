package com.pvt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("E://5.txt");
            Scanner scanner = new Scanner(inputStream, "windows-1251");
            Map<String, Integer> words = new HashMap<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Arrays.stream(line.toLowerCase().replaceAll("[^0-9a-zа-я]", " ").split(" "))
                        .filter(x -> x.length() > 1)
                        .forEach(x -> {
                            if (!words.containsKey(x)) words.put(x, 0);
                            words.put(x, words.get(x) + 1);
                        });
            }
            List<Map.Entry<String, Integer>> wordNotFrequent = words.entrySet().stream().sorted(
                    Comparator.comparingInt(Map.Entry::getValue)).limit(1).collect(Collectors.toList());
            for (Map.Entry<String, Integer> entry : wordNotFrequent) {
                System.out.println(entry.getKey());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
