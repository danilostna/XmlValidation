package main.java.example;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String result = changeList(list);

        System.out.println(list.toString());
        System.out.println(result);
    }

    private static String changeList(List<String> list) {
        list.add("one");
        list.add("two");

        return "changed";
    }
}
