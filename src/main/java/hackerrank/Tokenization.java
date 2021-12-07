package main.java.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tokenization {
    public static void main(String[] args) {
        String entry = "He is a very very good boy, isn't! he?";
        final String REGEX = "[ !,?._'@]";
        String[] splitted = entry.split(REGEX);
        List<String> tokens = Arrays.stream(splitted).filter( s -> !s.trim().isEmpty()).collect(Collectors.toList());

        System.out.println(tokens.size());
        for (String token: tokens) {
            System.out.println(token);
        }
    }
}
