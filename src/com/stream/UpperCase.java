package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {

        mapToUpperCase("Abc", "bAc", "caB");
        mapToUpperCase2("Abc", "bAc", "caB");

    }

    public static Collection<String> mapToUpperCase(String... names) {
        Collection<String> upperCaseNames = new ArrayList<>();
        for (String name : names) {
            upperCaseNames.add(name.toUpperCase());
        }
        return upperCaseNames;
    }

    //Array itemlerinin tamamini al -> stream()
    //Buyuk harflere cevir -> map()
    //Liste olarak geri don -> collect()
    public static Collection<String> mapToUpperCase2(String... names) {
        return Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList());
    }
}
