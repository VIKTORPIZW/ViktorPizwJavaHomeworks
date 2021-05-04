package com.pvt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("E://5.txt");
            // Начались траблы с кодировкой. Вот такой вариант подсмотрел, иначе выводит только слова на французском.
            Scanner scanner = new Scanner(inputStream, "windows-1251");
            Map<String, Integer> words = new HashMap<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Приводим к нижнему регистру.   заменяем знаки препинания на пробел.          разбиваем по пробелу.
                Arrays.stream(line.toLowerCase().replaceAll("[^0-9a-zа-я]", " ").split(" "))
// фильтрую строки которые длинее 1 символа
                        .filter(x -> x.length() > 1)
                        .forEach(x -> {
                            if (!words.containsKey(x)) words.put(x, 0);
                            words.put(x, words.get(x) + 1);
                        });
            }
            List<Map.Entry<String, Integer>> wordFrequent = words.entrySet().stream().sorted((a, b) -> {
                return b.getValue() - a.getValue();
            }).limit(1).collect(Collectors.toList());
            for (Map.Entry<String, Integer> entry : wordFrequent) {
                System.out.println(entry.getKey());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
