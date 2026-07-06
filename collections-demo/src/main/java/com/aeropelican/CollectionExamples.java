package com.aeropelican;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExamples {

    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Java";
        names[1] = "Python";
        names[2] = "Javascript";
        names[3] = "Html";

        System.out.println(Arrays.toString(names));
        names[1] = "Golang";

        System.out.println(Arrays.toString(names));

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Javascript");
        list.add("Html");

        System.out.println(list);
        list.add(0, "Golang");
        System.out.println(list);
        list.remove(2);
        list.remove(1);
        list.remove(0);
        System.out.println(list.get(3));
    }
}
