package com.stream;

import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        getTotalNumberOfLettersOfNamesLongerThanFive("A","B","C");
    }
    //array itemlerini al -> stream()
    //5-den uzun isimleri filtreler -> filter()
    //geri qalan herflerin sayisini getir -> mapToInt()
    //sayilari topla -> sum()
    public static int getTotalNumberOfLettersOfNamesLongerThanFive(String... names) {
        return Arrays.stream(names).filter(name->name.length()>5).mapToInt(String::length).sum();
    }
}
