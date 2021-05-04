package com.pvt;

import java.io.InputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.pvt.Print.print;
import static com.pvt.Print.println;

public class StringsMethod {
    public static String[] toStringArray(Collection<String> list) {
        String[] result = new String[list.size()];
        Iterator<String> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            result[i] = it.next();
        }
        return result;
    }

    public static String[] readInput(Scanner sc) {
        List<String> input = new ArrayList<String>();
        print(" ввод строк. для окончания ввести символ q: ");
        while (sc.hasNext()) {
            String word = sc.next();
            if (word.equals("q")) {
                break;
            } else {
                input.add(word);
            }
        }
        sc.close();
        return toStringArray(input);
    }

    public static String[] readInput(InputStream is) {
        return readInput(new Scanner(is));
    }

    public static String[] readInput() {
        return readInput(System.in);
    }

    public static int[] toIntArray(Collection<Integer> list) {
        int[] result = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        for (int i = 0; i < list.size(); i++) {
            result[i] = it.next();
        }
        return result;
    }

    public static int[] toIntArray(String[] sourceStrings) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (String sourceString : sourceStrings) {
            if (isNumericWord(sourceString)) {
                numbers.add(Integer.parseInt(sourceString));
            }
        }
        return toIntArray(numbers);
    }

    public static void shortAndLongString(String[] sourceStrings) {
        String longest = sourceStrings[0];
        String shortest = sourceStrings[0];
        for (int i = 1; i < sourceStrings.length; i++) {
            if (shortest.length() > sourceStrings[i].length()) {
                shortest = sourceStrings[i];
            } else if (longest.length() < sourceStrings[i].length()) {
                longest = sourceStrings[i];
            }
        }
        println("Самая короткая строка (длина): " + shortest + "("
                + shortest.length() + ")");
        println("Самая длинная строка (длина): " + longest + "("
                + longest.length() + ")");
    }

    public static Map<String, Integer> sortStringsWithAscOrDescByLength(
            Map<String, Integer> map, char directionSign) {
        List<Map.Entry<String, Integer>> forSortByLength = new ArrayList<Map.Entry<String, Integer>>(
                map.entrySet());
        switch (directionSign) {
            case '>':
                Collections.sort(forSortByLength,
                        new Comparator<Map.Entry<String, Integer>>() {
                            public int compare(Map.Entry<String, Integer> o1,
                                               Map.Entry<String, Integer> o2) {
                                return o2.getValue().compareTo(o1.getValue());
                            }
                        });
                break;
            case '<':
                Collections.sort(forSortByLength,
                        new Comparator<Map.Entry<String, Integer>>() {
                            public int compare(Map.Entry<String, Integer> o1,
                                               Map.Entry<String, Integer> o2) {
                                return o1.getValue().compareTo(o2.getValue());
                            }
                        });
                break;
            default:
                System.err.print("Неверный знак сортировки: ");
                break;
        }
        Map<String, Integer> result = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : forSortByLength) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static void strLength(String[] sourceStrings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String sourceString : sourceStrings) {
            map.put(sourceString, sourceString.length());
        }
        println("В порядке возрастания  " + "их длинна: "
                + sortStringsWithAscOrDescByLength(map, '<'));
        println("В порядке убывания  " + "длинна : "
                + sortStringsWithAscOrDescByLength(map, '>'));
    }

    public static int averageStringsLength(String[] sourceStrings) {
        int totalStringsLength = 0;
        for (String sourceString : sourceStrings) {
            totalStringsLength += sourceString.length();
        }
        return totalStringsLength / sourceStrings.length;
    }

    public static void strAverage(
            String[] sourceStrings) {
        final int averageStringsLength = averageStringsLength(sourceStrings);
        Map<String, Integer> stringsLessThanAverageLength = new HashMap<String, Integer>();
        Map<String, Integer> stringsGreaterThanAverageLength = new HashMap<String, Integer>();
        for (String sourceString : sourceStrings) {
            if (sourceString.length() < averageStringsLength) {
                stringsLessThanAverageLength.put(sourceString, sourceString.length());
            } else if (sourceString.length() > averageStringsLength) {
                stringsGreaterThanAverageLength.put(sourceString, sourceString.length());
            }
        }
        println("строка меньше средней(" + averageStringsLength
                + ") (строка=длина): " + stringsLessThanAverageLength);
        println("строка больше средней(" + averageStringsLength
                + ") (строка=длина): " + stringsGreaterThanAverageLength);
    }

    public static int countDifferentSymbols(String word) {
        char[] wordChars = word.toCharArray();
        int result = 0;
        for (int i = 1; i < wordChars.length; i++) {
            if (wordChars[0] != wordChars[i]) {
                result++;
            }
        }
        return result;
    }

    public static List<String> findWords(String[] sourceStrings) {
        Pattern wordPattern = Pattern.compile("[a-z]+");
        List<String> result = new ArrayList<String>();
        for (String word : sourceStrings) {
            Matcher wordMatcher = wordPattern.matcher(word.toLowerCase());
            if (wordMatcher.matches()) {
                result.add(word);
            }
        }
        return result;
    }

    public static void minDifSym(String[] sourceWords) {
        final String message = "различных символов минимум (число различных символов): ";
        if (sourceWords.length == 0) {
            println(message + "Нет слов");
            return;
        }
        String result = sourceWords[0];
        for (int i = 1; i < sourceWords.length; i++) {
            if (countDifferentSymbols(result) > countDifferentSymbols(sourceWords[i])) {
                result = sourceWords[i];
            }
        }
        println(message + result + "(" + countDifferentSymbols(result)
                + ")");
    }

    public static List<String> findWordsInLatin(String[] sourceWords) {
        Pattern latinPattern = Pattern.compile("[a-z]+");
        List<String> result = new ArrayList<String>();
        for (String word : sourceWords) {
            Matcher latinMatcher = latinPattern.matcher(word.toLowerCase());
            if (latinMatcher.matches()) {
                result.add(word);
            }
        }
        return result;
    }

    public static void wordsInLatin(
            String[] sourceWords) {
        List<String> wordsInLatin = findWordsInLatin(sourceWords);
        println("Кодичество слов с латинскими буквами: "
                + wordsInLatin.size() + "): " + wordsInLatin);
        int vowelsCount, consonantsCount;
        print("одинаковое колличество гласных и согласных ");
        for (String word : wordsInLatin) {
            vowelsCount = word.replaceAll("[^aeiou]", "").length();

            consonantsCount = word.replaceAll("[aeiou]", "").length();
            if (vowelsCount == consonantsCount) {
                print(word + "(" + vowelsCount + ", " + consonantsCount + "), ");
            }
        }
        println();
    }

    public static boolean isTwoCharSymbolCodesInAsc(char a, char b) {
        return (int) b - (int) a == 1;
    }

    public static boolean isWordSymbolCodesInAsc(String word) {
        char[] wordChars = word.toCharArray();
        if (wordChars.length < 2) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < wordChars.length - 1; i++) {
            if (isTwoCharSymbolCodesInAsc(wordChars[i], wordChars[i + 1])) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static void wordSymbolCode(String[] sourceWords) {
        print("символы в порядке возраствния ");
        for (String word : sourceWords) {
            if (isWordSymbolCodesInAsc(word)) {
                print(word);
                break;
            }
        }
        println();
    }

    public static boolean hasUniqueChars(String word) {
        HashSet<Character> uniqueChars = new HashSet<Character>();
        for (Character ch : word.toCharArray()) {
            if (!uniqueChars.add(Character.toLowerCase(ch))) {
                return false;
            }
        }
        return true;
    }

    public static void wordDifSym(String[] sourceWords) {
        for (String word : sourceWords) {
            if (word.length() > 1 && hasUniqueChars(word)) {
                println("разные символы в слове: " + word);
                break;
            }
        }

    }
    public static boolean isNumericWord(String word) {
        Pattern numericPattern = Pattern.compile("[+-]?[0-9]+");
        Matcher numericMatcher = numericPattern.matcher(word);
        return numericMatcher.matches();
    }

    public static void palindromWord(
            String[] sourceWords) {
        List<String> oneOrTwoNumericPalindromicWords = new ArrayList<String>();
        for (String word : sourceWords) {
            if (isNumericWord(word)) {
                boolean isInputPalindrom = word.equals(new StringBuilder(word)
                        .reverse().toString());
                if (isInputPalindrom) {
                    oneOrTwoNumericPalindromicWords.add(word);
                }
            }
        }
        final String message = "только из цифр: ";
        if (oneOrTwoNumericPalindromicWords.size() == 0) {
            println(message + "Нет слов");
            return;
        }
        if (oneOrTwoNumericPalindromicWords.size() == 1) {
            println(message + oneOrTwoNumericPalindromicWords.get(0));
        } else {
            println("слов из цифр больше одного, вот второе из них: "
                    + oneOrTwoNumericPalindromicWords.get(1));
        }
    }

}
