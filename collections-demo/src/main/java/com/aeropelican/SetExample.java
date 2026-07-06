package com.aeropelican;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static javax.swing.UIManager.put;

public class SetExample {
    public static void main(String[] args) {
        //Key, Value
        //hashset, linkedhashset
        //HashMap, LinkedHashMap
        Set<String> set = new HashSet<>();

        //10 > Same hash > Same bucket > ListList
        //6 > Redblack tree
        //ListLinked
        put("Roll", "Student");
        put("Ram", "Student");
        set.add("Java");
        set.add("Python");
        set.add("C++");

        Set<String> lSet = new LinkedHashSet<>();
        lSet.add("Java");
        lSet.add("Python");
        lSet.add("C++");
        System.out.println(set);
        System.out.println(lSet);
    }
}
