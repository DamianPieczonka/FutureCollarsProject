package com.futurecollars.CollectionsTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtil {

    private List<String> names;

    public ArrayUtil(List<String> names) {
        this.names = names;
    }

    public List<String> distinct() {
        return names.stream().distinct().collect(Collectors.toList());
    }

    public List<String> reverse() {
        List<String> reversed = new ArrayList<>(names);
        Collections.reverse(reversed);
        return reversed;
    }

    public List<String> swap(String oldValue, String newValue) {
        List<String> swapped = new ArrayList<>(names);
        for (int i = 0; i < swapped.size(); i++) {
            if (swapped.get(i).equals(oldValue)) {
                swapped.set(i, newValue);
            }
        }
        return swapped;
    }
}
