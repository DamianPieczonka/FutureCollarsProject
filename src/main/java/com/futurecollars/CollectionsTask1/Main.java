package com.futurecollars.CollectionsTask1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Katarzyna");
        names.add("Tymon");
        names.add("Tadeusz");
        names.add("Anna");
        names.add("Karolina");
        names.add("Dorota");
        names.add("Piotr");
        ArrayUtil arrayUtil = new ArrayUtil(names);

        System.out.println(arrayUtil.distinct());
        System.out.println(arrayUtil.reverse());
        System.out.println(arrayUtil.swap("Anna", "Joanna"));
    }
}
