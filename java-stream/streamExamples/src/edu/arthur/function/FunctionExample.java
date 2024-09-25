package edu.arthur.function;

import java.util.Arrays;
import java.util.List;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,10,25);

    //Function<Integer, Integer> dobrar = n -> n * 2;


    List<Integer> numerosDobrados = numeros.stream()
    .map(n -> n * 2)
    .filter(n -> n < 10)
    .toList();

    numerosDobrados.forEach(System.out::println);
    }
}
