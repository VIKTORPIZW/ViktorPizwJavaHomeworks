package com.pvt;


import static com.pvt.StringsMethod.*;

public class Main {
    public static void main(String[] args) {
        String[] sourceStrings = readInput();
        if (sourceStrings.length == 0) {
            System.out.println("не правильно");
            System.exit(0);
        }
        shortAndLongString(sourceStrings);
        strLength(sourceStrings);
        strAverage(sourceStrings);
        String[] sourceWords = toStringArray(findWords(sourceStrings));
        minDifSym(sourceWords);
        wordsInLatin(sourceWords);
        wordSymbolCode(sourceWords);
        wordDifSym(sourceWords);
        palindromWord(sourceStrings);

    }
}