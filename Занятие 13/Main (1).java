package com.pvt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Vova");
        people.put(2, "Masha");
        people.put(3, "Viktor");
        people.put(4, "Sasha");
        people.put(5, "Tolya");
        people.put(6, "Nastya");
        people.put(7, "Kostya");
        people.put(8, "Dimon");
        people.put(9, "Marusya");
        people.put(10, "Marina");
        List<String>idAndNameReformat = people
                .entrySet()
                .stream()
                .filter(x->Arrays.asList(new Integer[]{1,2,5,8,9,13})
                        .contains(x.getKey().intValue()))
                .filter(x -> x.getValue()
                        .length()%2 == 1)
                .map(x->x.getValue())
                .map(x->new StringBuilder(x)
                        .reverse()
                        .toString())
                .collect(Collectors.toList());
        System.out.println(idAndNameReformat);
    }
}

